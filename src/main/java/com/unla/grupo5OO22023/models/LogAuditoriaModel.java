package com.unla.grupo5OO22023.models;

import java.time.LocalDate;
import com.unla.grupo5OO22023.entity.Evento;

public class LogAuditoriaModel {
	private int idLogAuditoria;
	private LocalDate fechaLogAuditoria;
	private Evento evento;
	
	public LogAuditoriaModel(int idLogAuditoria, LocalDate fechaLogAuditoria, Evento evento) {
		super();
		this.idLogAuditoria = idLogAuditoria;
		this.fechaLogAuditoria = fechaLogAuditoria;
		this.evento = evento;
	}
}