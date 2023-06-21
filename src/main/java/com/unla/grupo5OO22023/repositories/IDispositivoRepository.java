package com.unla.grupo5OO22023.repositories;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unla.grupo5OO22023.entity.Dispositivo;
import java.util.List;


@Repository("dispositivoRepository")
public interface IDispositivoRepository extends JpaRepository<Dispositivo, Serializable>{
	public abstract Dispositivo findById(int id);
    public abstract Dispositivo findByNombre(String nombre);
    public abstract List<Dispositivo> findAll();
}