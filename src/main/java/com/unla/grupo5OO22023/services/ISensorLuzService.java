package com.unla.grupo5OO22023.services;

import java.util.List;

import com.unla.grupo5OO22023.entity.SensorLuz;

public interface ISensorLuzService {
	public List<SensorLuz> getAll();

	public SensorLuz buscar(int id);

	public void eliminar(int id);

	public void save(SensorLuz sensorLuz);
}
