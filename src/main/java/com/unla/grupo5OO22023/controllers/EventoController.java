package com.unla.grupo5OO22023.controllers;

import com.unla.grupo5OO22023.entity.Evento;
import com.unla.grupo5OO22023.entity.SensorLuz;
import com.unla.grupo5OO22023.helpers.ViewRouteHelper;
import com.unla.grupo5OO22023.services.IDispositivoService;
import com.unla.grupo5OO22023.services.IEventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
			model.addAttribute(evento);
			return ViewRouteHelper.EventoIndex;
		}
		return ViewRouteHelper.ERROR_EDITAR; // Return an appropriate error page or handle the case as needed
	}
	
	@GetMapping("/newevento")
	public String agregar(Model model) {
		Evento evento = new Evento();
		model.addAttribute("evento", evento);
		return ViewRouteHelper.EventoForm;
	}
	
	
}