package com.unla.grupo5OO22023.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.unla.grupo5OO22023.entity.SensorLuz;
import com.unla.grupo5OO22023.entity.SensorProximidad;
import com.unla.grupo5OO22023.helpers.ViewRouteHelper;
import com.unla.grupo5OO22023.services.IDispositivoService;
import com.unla.grupo5OO22023.services.ISensorLuzService;
import com.unla.grupo5OO22023.services.ISensorProximidadService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/dispositivo")
public class DispositivoController {

	@Autowired
	@Qualifier("sensorluzService")
	private ISensorLuzService sensorluzService;

	@Autowired
	@Qualifier("sensorProximidadService")
	private ISensorProximidadService sensorProximidadService;
	@Autowired
	@Qualifier("dispositivoService")
	private IDispositivoService dispositivoService;

	@GetMapping("/listar")
	public String listarDispositivos(Model model) {
		List<SensorLuz> sensoresLuz = sensorluzService.getAll();
		List<SensorProximidad> sensoresProximidad = sensorProximidadService.getAll();
		model.addAttribute("titulo", "Lista de dispositivos");
		model.addAttribute("tituloSLuz", "Sensores luz");
		model.addAttribute("tituloSensorProximidad", "Sensores Proximidad");
		model.addAttribute("sensoresLuz", sensoresLuz);
		model.addAttribute("sensoresProximidad", sensoresProximidad);
		return ViewRouteHelper.DISPOSITIVO_INDEX;
	}

	@GetMapping("/editar/{idDispositivo}")
	public String editar(@PathVariable int idDispositivo, Model model) {
		SensorLuz sensorluz = sensorluzService.buscar(idDispositivo);
		SensorProximidad sensorproximidad = sensorProximidadService.buscar(idDispositivo);
		if (sensorluz != null) {
			model.addAttribute("sensorluz", sensorluz);
			return ViewRouteHelper.FORM_SENSORLUZ;
		}
		if (sensorproximidad != null) {
			model.addAttribute("sensorproximidad", sensorproximidad);
			return ViewRouteHelper.FORM_SENSORPROXIMIDAD;
		}
		// Handle the case if the device is not an instance of either child class
		return ViewRouteHelper.ERROR_EDITAR; // Return an appropriate error page or handle the case as needed
	}
	@GetMapping("/eliminar/{idDispositivo}")
	public String delete(Model model , @PathVariable int idDispositivo) {
		SensorLuz sensorluz = sensorluzService.buscar(idDispositivo);
		SensorProximidad sensorproximidad = sensorProximidadService.buscar(idDispositivo);
		
		if(sensorluz!=null) {
			sensorluzService.eliminar(idDispositivo);
		}
		if(sensorproximidad !=null) {
			sensorProximidadService.eliminar(idDispositivo);
		}
		return "redirect:/dispositivo/listar";
	}

	// ************************SENSORLUZ***********************************************************

	@GetMapping("/newsluz")
	public String agregar(Model model) {
		SensorLuz sensorluz = new SensorLuz();
		model.addAttribute("sensorluz", sensorluz);
		return ViewRouteHelper.FORM_SENSORLUZ;
	}

	@PostMapping("/savesluz")
	public String save(@Valid SensorLuz sensorluz, Model model) {
	    if (sensorluz.getIdDispositivo() != 0) {
	        SensorLuz existingSensorLuz = sensorluzService.buscar(sensorluz.getIdDispositivo());
	        if (existingSensorLuz != null) {
	            // Actualizar los datos del objeto existente con los valores del objeto enviado desde el formulario
	            existingSensorLuz.setNombre(sensorluz.getNombre());
	            existingSensorLuz.setActivaDesde(sensorluz.getActivaDesde());
	            existingSensorLuz.setActivaHasta(sensorluz.getActivaHasta());
	            existingSensorLuz.setEstado(sensorluz.isEstado());
	            sensorluzService.save(existingSensorLuz);
	        } else {
	            // El objeto con el ID especificado no existe, por lo que se crea uno nuevo
	            sensorluzService.save(sensorluz);
	        }
	    } else {
	        // No se especificó un ID, por lo que se crea un nuevo objeto
	        sensorluzService.save(sensorluz);
	    }
	    return "redirect:/dispositivo/listar";
	}

	// ************************SENSORPROXIMIDAD***********************************************************

	@GetMapping("/newsproxi")
	public String agregarProximidad(Model model) {
		SensorProximidad sensorProximidad = new SensorProximidad();
//    	model.addAttribute("sensorProximidad",sensorProximidad);
		model.addAttribute("sensorproximidad", sensorProximidad);
		return ViewRouteHelper.FORM_SENSORPROXIMIDAD;
	}

	@PostMapping("/savesproxi")
	public String saveProximidad(@Valid SensorProximidad sensorProximidad, Model model) {
		SensorProximidad existingSensorProximidad = sensorProximidadService.buscar(sensorProximidad.getIdDispositivo());
		if (existingSensorProximidad != null) {
			existingSensorProximidad.setNombre(sensorProximidad.getNombre());
			existingSensorProximidad.setLlegada(sensorProximidad.getLlegada());
			existingSensorProximidad.setSalida(sensorProximidad.getSalida());
			existingSensorProximidad.setEstado(sensorProximidad.isEstado());
			existingSensorProximidad.setUtilidad(sensorProximidad.isUtilidad());
			sensorProximidadService.save(existingSensorProximidad);
		} else {
			sensorProximidadService.save(sensorProximidad);
		}
		return "redirect:/dispositivo/listar";
	}
}