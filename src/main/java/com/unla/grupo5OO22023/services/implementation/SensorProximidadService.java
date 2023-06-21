package com.unla.grupo5OO22023.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo5OO22023.entity.SensorProximidad;
import com.unla.grupo5OO22023.repositories.ISensorProximidadRepository;
import com.unla.grupo5OO22023.services.ISensorProximidadService;

@Service("sensorProximidadService")
public class SensorProximidadService implements ISensorProximidadService{
	@Autowired
	@Qualifier("sensorProximidadRepository")
	private ISensorProximidadRepository sensorProximidadRepository;
	
	@Override
	public List<SensorProximidad> getAll() {
		return (List<SensorProximidad>) sensorProximidadRepository.findAll();
	}

	@Override
	public SensorProximidad buscar(int id) {
		return sensorProximidadRepository.findById(id).orElse(null);
	}
	
	@Override
	public void save(SensorProximidad sensorProximidad) {
		sensorProximidadRepository.save(sensorProximidad);
	}

	@Override
	public void eliminar(int id) {
		sensorProximidadRepository.deleteById(id);
	}


}