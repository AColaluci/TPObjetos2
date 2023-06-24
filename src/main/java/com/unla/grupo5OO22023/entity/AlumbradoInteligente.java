package com.unla.grupo5OO22023.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
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
@Table(name="alumbradoInteligente")
public class AlumbradoInteligente {
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
	
	@NotEmpty
	@Column(name="nombre")
	private String nombre;
	
	@OneToOne
	@NotNull
    @JoinColumn(name="idSensorLuz")
    private SensorLuz sensorLuz;

	public AlumbradoInteligente(@NotNull int id, @NotEmpty String nombre, @NotNull SensorLuz sensorLuz) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sensorLuz = sensorLuz;
	}

	public AlumbradoInteligente() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public SensorLuz getSensorLuz() {
		return sensorLuz;
	}

	public void setSensorLuz(SensorLuz sensorLuz) {
		this.sensorLuz = sensorLuz;
	}
}