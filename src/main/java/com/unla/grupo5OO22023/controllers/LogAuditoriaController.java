package com.unla.grupo5OO22023.controllers;

import com.unla.grupo5OO22023.entity.Evento;
import com.unla.grupo5OO22023.helpers.ViewRouteHelper;
import com.unla.grupo5OO22023.models.LogAuditoriaModel;
import com.unla.grupo5OO22023.services.ILogAuditoriaService;
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
@RequestMapping("/LogAuditoria")
public class LogAuditoriaController {
	@Autowired
    @Qualifier("logAuditoriaService")

	private ILogAuditoriaService logService;
	
	@GetMapping("/editar")
    public ModelAndView index(){
        ModelAndView mAV = new ModelAndView(ViewRouteHelper.LogAuditoriaIndex);
        mAV.addObject("logAuditorias",logService.getAll());
        mAV.addObject("logAuditoria", new Evento());
        return mAV;
    }
	
	 @PostMapping("/editar")
	    public RedirectView create(@ModelAttribute("logAuditoria") LogAuditoriaModel logAuditoriaModel){
		 	logService.insertOrUpdate(logAuditoriaModel);
	        return new RedirectView(ViewRouteHelper.LogAuditoriaRuta);
	    }
}