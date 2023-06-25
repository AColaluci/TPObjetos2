package com.unla.grupo5OO22023.entity;

import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@Data
@Table(name ="evento")
public class Evento {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "idEvento")
	private int idEvento;
	
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	
	@ManyToOne
    private Dispositivo dispositivo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotEmpty
	@Column(name = "fechaHora")
	private LocalDateTime fechaHora;

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", descripcion=" + descripcion + ", dispositivo=" + dispositivo
				+ ", fechaHora=" + fechaHora + "]";
	}
	
	
}