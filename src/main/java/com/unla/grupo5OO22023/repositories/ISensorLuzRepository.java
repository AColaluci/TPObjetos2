package com.unla.grupo5OO22023.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo5OO22023.entity.Dispositivo;
import com.unla.grupo5OO22023.entity.SensorLuz;

@Repository("sensorluzRepository")
public interface ISensorLuzRepository extends JpaRepository<SensorLuz, Serializable>  {
	
}
