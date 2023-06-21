package com.unla.grupo5OO22023.services;

import java.util.List;

import com.unla.grupo5OO22023.entity.SensorProximidad;

public interface ISensorProximidadService {
	public List<SensorProximidad> getAll();

	public SensorProximidad buscar(int id);

	public void eliminar(int id);

	public void save(SensorProximidad sensorProximidad);
	
}