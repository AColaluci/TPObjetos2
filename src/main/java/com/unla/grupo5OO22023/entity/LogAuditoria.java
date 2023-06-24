package com.unla.grupo5OO22023.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter 
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="logAuditoria")

public class LogAuditoria {

    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idLogAuditoria;
    
    @NotEmpty
    @Column(name="fechaRegistro")
    private LocalDate fechaLogAuditoria;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idEvento", nullable=true)
    private Evento evento;

	public LogAuditoria(@NotNull int idLogAuditoria, @NotEmpty LocalDate fechaLogAuditoria, @NotNull Evento evento) {
		super();
		this.idLogAuditoria = idLogAuditoria;
		this.fechaLogAuditoria = fechaLogAuditoria;
		this.evento = evento;
	}
	
	public LogAuditoria() {
		super();
	}

	public int getIdLogAuditoria() {
		return idLogAuditoria;
	}

	public void setIdLogAuditoria(int idLogAuditoria) {
		this.idLogAuditoria = idLogAuditoria;
	}

	public LocalDate getFechaLogAuditoria() {
		return fechaLogAuditoria;
	}

	public void setFechaLogAuditoria(LocalDate fechaLogAuditoria) {
		this.fechaLogAuditoria = fechaLogAuditoria;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
    
    
}