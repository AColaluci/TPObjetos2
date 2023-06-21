package com.unla.grupo5OO22023.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name ="lugar")
public class Lugar {
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	@Column(name = "idLugar")
	private int idLugar;
	
	@ManyToOne
	@JoinColumn(name = "idDispositivo")
	private SensorLuz sensorLuz;

	public Lugar(@NotEmpty int idLugar, SensorLuz sensorLuz) {
		super();
		this.idLugar = idLugar;
		//this.sensorLuz = sensorLuz;
	}
}