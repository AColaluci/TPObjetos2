package com.unla.grupo5OO22023.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name ="estacionamiento")
public class Estacionamiento {
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	@Column(name = "idEstacionamiento")
	private int idEstacionamiento;
	
	@OneToMany
	@JoinColumn(name = "idLugar")
	private List<Lugar> lugares;
	
}