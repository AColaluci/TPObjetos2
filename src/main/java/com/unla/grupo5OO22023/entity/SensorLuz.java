package com.unla.grupo5OO22023.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class SensorLuz extends Dispositivo{
	
	@NotEmpty
	@Column(name="activaDesde")
	private LocalDateTime activaDesde;
	
	@NotEmpty
	@Column(name="activaHasta")
	private LocalDateTime activaHasta;

}