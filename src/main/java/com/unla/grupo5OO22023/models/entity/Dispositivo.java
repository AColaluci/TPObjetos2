package com.unla.grupo5OO22023.models.entity;

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
@Table(name ="dispositivo") 
public abstract class Dispositivo{
	
	//ATRIBUTO
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	@Column(name = "idDispositivo")   
	protected int idDispositivo; 
	
	@NotEmpty
	@Column(name = "estado")
	protected boolean estado; 
	
	//CONSTRUCTOR
	public Dispositivo(boolean estado) {
		super();
		this.estado = estado;
	}

	//METODOS ABSTRACTOS QUE VAN A TENER TODOS LOS DISPOS
	public abstract void actualizarEstado();
}