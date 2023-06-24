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
import jakarta.validation.constraints.NotNull;
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
	@NotNull
	@Column(name = "idEstacionamiento")
	private int idEstacionamiento;
	
	@OneToMany
	@NotNull
	@JoinColumn(name = "idLugar")
	private List<Lugar> lugares;

	public Estacionamiento(@NotNull int idEstacionamiento, @NotNull List<Lugar> lugares) {
		super();
		this.idEstacionamiento = idEstacionamiento;
		this.lugares = lugares;
	}

	public Estacionamiento() {
		super();
	}

	public int getIdEstacionamiento() {
		return idEstacionamiento;
	}

	public void setIdEstacionamiento(int idEstacionamiento) {
		this.idEstacionamiento = idEstacionamiento;
	}

	public List<Lugar> getLugares() {
		return lugares;
	}

	public void setLugares(List<Lugar> lugares) {
		this.lugares = lugares;
	}
	
	
	
}