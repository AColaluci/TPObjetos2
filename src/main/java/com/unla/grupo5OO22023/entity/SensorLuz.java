package com.unla.grupo5OO22023.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Entity
@Data
@Getter
@Setter
@ToString
public class SensorLuz extends Dispositivo {

	@NotEmpty
	@Column(name = "activaDesde")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime activaDesde;

	@NotEmpty
	@Column(name = "activaHasta")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime activaHasta;

	public SensorLuz(boolean estado) {
		super(estado);
	}
	
	@OneToOne(mappedBy="sensorLuz")
	private AlumbradoInteligente alumbradoInteligente;

	@Override
	public void actualizarEstado() {
		// TODO Auto-generated method stub

	}
}