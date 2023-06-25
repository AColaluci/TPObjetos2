package com.unla.grupo5OO22023.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo5OO22023.entity.SensorLuz;
import com.unla.grupo5OO22023.repositories.ISensorLuzRepository;
import com.unla.grupo5OO22023.services.ISensorLuzService;

@Service("sensorluzService")
public class SensorLuzService implements ISensorLuzService {

	@Autowired
	@Qualifier("sensorluzRepository")
	private ISensorLuzRepository sensorluzRepository;

	@Override
	public List<SensorLuz> getAll() {
		return (List<SensorLuz>) sensorluzRepository.findAll();
	}

	@Override
	public SensorLuz buscar(int id) {
		return sensorluzRepository.findById(id).orElse(null);
	}

	@Override
	public void save(SensorLuz sensorLuz) {
		sensorluzRepository.save(sensorLuz);
	}

	@Override
	public void eliminar(int id) {
		sensorluzRepository.deleteById(id);
	}

}
