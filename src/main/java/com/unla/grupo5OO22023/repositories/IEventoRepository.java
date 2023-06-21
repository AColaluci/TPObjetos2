package com.unla.grupo5OO22023.repositories;

import com.unla.grupo5OO22023.entity.Evento;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("eventoRepository")
public interface IEventoRepository extends JpaRepository<Evento, Serializable>{
	    public abstract Evento findByDescripcion(String descripcion);
	    public abstract Evento findByidEvento(int idEvento);
}