package com.unla.grupo5OO22023.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
@Table(name ="evento")

public class SensorProximidad extends Dispositivo{
	//ATRIBUTOS
	
	@NotEmpty
	@Column(name = "utilidad") //Si esta en TRUE, esta ocupado, y sino esta libre
	private boolean utilidad;

	public SensorProximidad(boolean estado, @NotEmpty boolean utilidad) {
		super(estado);
		this.utilidad = utilidad;
	}

	@Override
	public void actualizarEstado() {
		
	}
	
	
	
}