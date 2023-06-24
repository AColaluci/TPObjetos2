package com.unla.grupo5OO22023.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
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
@Data
@Getter
@Setter
@ToString
@PrimaryKeyJoinColumn(name = "idDispositivo")
@Table(name="sensorLuz")
public class SensorLuz extends Dispositivo {

	
	
	public SensorLuz(@NotEmpty LocalDateTime activaDesde, @NotEmpty LocalDateTime activaHasta) {
		super();
		this.activaDesde = activaDesde;
		this.activaHasta = activaHasta;
	}
	
	public SensorLuz() {
		super();
	}

	@NotEmpty
	@Column(name = "activaDesde")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime activaDesde;

	@NotEmpty
	@Column(name = "activaHasta")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime activaHasta;

	@Override
	public void actualizarEstado() {
	}

	public LocalDateTime getActivaDesde() {
		return activaDesde;
	}

	public void setActivaDesde(LocalDateTime activaDesde) {
		this.activaDesde = activaDesde;
	}

	public LocalDateTime getActivaHasta() {
		return activaHasta;
	}

	public void setActivaHasta(LocalDateTime activaHasta) {
		this.activaHasta = activaHasta;
	}
}