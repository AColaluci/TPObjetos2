package com.unla.grupo5OO22023.controllers;

import com.unla.grupo5OO22023.entity.Evento;
import com.unla.grupo5OO22023.helpers.ViewRouteHelper;
import com.unla.grupo5OO22023.services.IDispositivoService;
import com.unla.grupo5OO22023.services.IEventoService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/evento")
public class EventoController {
	@Autowired
    @Qualifier("eventoService")
    private IEventoService eventoService;
	
	@Autowired
	@Qualifier("dispositivoService")
	private IDispositivoService dispositivoService;
	
	@GetMapping("/listar")
	public String listarEventos(Model model) {
		List<Evento> eventos = eventoService.getAll();
		model.addAttribute("eventos", eventos);
		return ViewRouteHelper.EventoIndex;
	}
	
	@GetMapping("/editar/{idEvento}")
	public String editar(@PathVariable int idEvento, Model model) {
		Evento evento = eventoService.findById(idEvento);
		if (evento != null){
			model.addAttribute("evento",evento);
			return ViewRouteHelper.EventoForm;
		}
		return ViewRouteHelper.ERROR_EDITAR;
	}
	
	@GetMapping("/eliminar/{idEvento}")
	public String delete(Model model , @PathVariable int idEvento) {
		Evento evento = eventoService.findById(idEvento);
		if(evento!=null) {
			eventoService.remove(idEvento);
		}
		return "redirect:/evento/listar";
	}
	
	@GetMapping("/newevento")
	public String agregar(Model model) {
		Evento evento = new Evento();
		model.addAttribute("evento", evento);
		return ViewRouteHelper.EventoForm;
	}
	
	@PostMapping("/saveevento")
	public String save(@Valid Evento evento, Model model){
		if(evento.getIdEvento()!=0) {
			Evento existingEvento = eventoService.findById(evento.getIdEvento());
			if(existingEvento != null) {
				existingEvento.setFechaHora(evento.getFechaHora());
				existingEvento.setDescripcion(evento.getDescripcion());
				existingEvento.setDispositivo(evento.getDispositivo());
				eventoService.save(existingEvento);
			}else {
				// El objeto con el ID especificado no existe, por lo que se crea uno nuevo
				eventoService.save(evento);
			}
		}else {
			// No se especificó un ID, por lo que se crea un nuevo objeto
			eventoService.save(evento);
		}
		return "redirect:/evento/listar";
	}
	
	
}