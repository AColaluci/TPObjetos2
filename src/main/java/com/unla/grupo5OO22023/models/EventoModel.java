package com.unla.grupo5OO22023.models;

import com.unla.grupo5OO22023.entity.Dispositivo;
import java.time.LocalDate;

public class EventoModel {
	private int idEvento;
	private String descripcion;
	private Dispositivo dispositivo;
	private LocalDate fechaHora;
	
	public EventoModel(int idEvento, String descripcion, Dispositivo dispositivo, LocalDate fechaHora) {
		super();
		this.idEvento = idEvento;
		this.descripcion = descripcion;
		this.dispositivo = dispositivo;
		this.fechaHora = fechaHora;
	}
	
}