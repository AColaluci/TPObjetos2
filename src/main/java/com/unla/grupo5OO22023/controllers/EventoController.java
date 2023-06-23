package com.unla.grupo5OO22023.controllers;

import com.unla.grupo5OO22023.helpers.ViewRouteHelper;
import com.unla.grupo5OO22023.entity.Evento;
import com.unla.grupo5OO22023.services.IEventoService;
import com.unla.grupo5OO22023.models.EventoModel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
@Controller
@RequestMapping("/evento")
public class EventoController {
	@Autowired
    @Qualifier("eventoService")
    private IEventoService eventoService;
	
	@GetMapping("/editar")
    public ModelAndView index(){
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.EventoIndex);
        mAV.addObject("eventos",eventoService.getAll());
        mAV.addObject("evento", new Evento());
        return mAV;
    }
	
	 @PostMapping("/editar")
	    public RedirectView create(@ModelAttribute("evento") EventoModel eventoModel){
	        eventoService.insertOrUpdate(eventoModel);
	        return new RedirectView(ViewRouteHelper.EventoRuta);
	    }
}