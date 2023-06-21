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
@Table(name ="dispositivo") 
public class Dispositivo{
	
	//ATRIBUTO
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	@Column(name = "idDispositivo")   
	protected int idDispositivo; 
	
	@NotEmpty
	@Column(name = "estado")
	protected boolean estado; 
	
	//METODOS ABSTRACTOS QUE VAN A TENER TODOS LOS DISPOSITIVOS
	//public abstract void actualizarEstado();
}