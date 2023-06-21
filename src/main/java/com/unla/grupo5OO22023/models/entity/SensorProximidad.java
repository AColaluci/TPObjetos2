package com.unla.grupo5OO22023.models.entity;

import java.time.LocalDateTime;

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

	@NotEmpty
	@Column(name="activaDesde")
	private LocalDateTime activaDesde;
	
	@NotEmpty
	@Column(name="activaHasta")
	private LocalDateTime activaHasta;

	public SensorProximidad(boolean estado, @NotEmpty boolean utilidad, @NotEmpty LocalDateTime activaDesde,
			@NotEmpty LocalDateTime activaHasta) {
		super(estado);
		this.utilidad = utilidad;
		this.activaDesde = activaDesde;
		this.activaHasta = activaHasta;
	}

	@Override
	public void actualizarEstado() {
		
	}
	
	
	
}