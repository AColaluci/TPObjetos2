package com.unla.grupo5OO22023.controllers;

import com.unla.grupo5OO22023.helpers.ViewRouteHelper;
import com.unla.grupo5OO22023.models.DispositivoModel;
import com.unla.grupo5OO22023.services.IDispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class DispositivoController {
	@Autowired
	@Qualifier("dispositivoService")
	private IDispositivoService dispositivoService;


    @GetMapping("/")
    public String index(Model model){
       model.addAttribute("dispositivos", dispositivoService.getAll());
       return "dispositivo/dispositivos";
    }

    @PostMapping("/")
    public RedirectView create(@ModelAttribute("dispositivo") DispositivoModel dispositivoModel){
        dispositivoService.insertOrUpdate(dispositivoModel);
        return new RedirectView(ViewRouteHelper.DispositivoRuta);
    }

}