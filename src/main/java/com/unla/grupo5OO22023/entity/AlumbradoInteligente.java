package com.unla.grupo5OO22023.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

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
	
	@OneToOne
    @JoinColumn(name="idSensorLuz")
    private SensorLuz sensorLuz;
}
