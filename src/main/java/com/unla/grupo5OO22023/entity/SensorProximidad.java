package com.unla.grupo5OO22023.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@PrimaryKeyJoinColumn(name = "idDispositivo")
@Table(name = "sensorProximidad")

public class SensorProximidad extends Dispositivo {
	// ATRIBUTOS

	@NotNull
	@Column(name = "utilidad") // Si esta en TRUE, esta ocupado, y sino esta libre
	private boolean utilidad;

	@NotNull
	@Column(name = "llegada")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime llegada;

	@NotNull
	@Column(name = "salida")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime salida;

	@Override
	public void actualizarEstado() {

	}

	public boolean isUtilidad() {
		return utilidad;
	}

	public void setUtilidad(boolean utilidad) {
		this.utilidad = utilidad;
	}

	public LocalDateTime getLlegada() {
		return llegada;
	}

	public void setLlegada(LocalDateTime llegada) {
		this.llegada = llegada;
	}

	public LocalDateTime getSalida() {
		return salida;
	}

	public void setSalida(LocalDateTime salida) {
		this.salida = salida;
	}

	@Override
	public String toString() {
		return super.idDispositivo +" - SensorProximidad" ;
	}

	
}