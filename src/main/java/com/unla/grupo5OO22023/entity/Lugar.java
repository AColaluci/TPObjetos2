package com.unla.grupo5OO22023.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "lugar")
public class Lugar {
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "idLugar")
	private int idLugar;

	@OneToOne
	@NotNull
	@JoinColumn(name = "idSensorProximidad")
	private SensorProximidad sensorProximidad;

	public Lugar(@NotNull int idLugar, @NotNull SensorProximidad sensorProximidad) {
		super();
		this.idLugar = idLugar;
		this.sensorProximidad = sensorProximidad;
	}

	public Lugar() {
		super();
	}

	public int getIdLugar() {
		return idLugar;
	}

	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}

	public SensorProximidad getSensorProximidad() {
		return sensorProximidad;
	}

	public void setSensorProximidad(SensorProximidad sensorProximidad) {
		this.sensorProximidad = sensorProximidad;
	}

	
}
