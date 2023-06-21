package com.unla.grupo5OO22023.services;

import com.unla.grupo5OO22023.entity.Evento;
import com.unla.grupo5OO22023.models.EventoModel;
import java.util.List;

public interface IEventoService {

	Evento findById(int id);
	public List<Evento> getAll();
	public boolean remove(int idEvento);
    public EventoModel insertOrUpdate(EventoModel eventoModel);
  
}