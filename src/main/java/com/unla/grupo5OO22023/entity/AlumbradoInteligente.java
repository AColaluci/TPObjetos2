package com.unla.grupo5OO22023.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToOne
    @JoinColumn(name="idSensorLuz")
    private SensorLuz sensorLuz;
}
