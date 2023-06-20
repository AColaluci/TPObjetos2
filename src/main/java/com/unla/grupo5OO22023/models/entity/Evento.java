package com.unla.grupo5OO22023.models.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
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
@Table(name ="evento")
public class Evento {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	@Column(name = "idEvento")
	private int idEvento;
	
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "idDispositivo")
	private Dispositivo dispositivo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotEmpty
	@Column(name = "fechaHora")
	private LocalDate fechaHora;

	public Evento(@NotEmpty int idEvento, @NotEmpty String descripcion, @NotEmpty Dispositivo dispositivo,
			@NotEmpty LocalDate fechaHora) {
		super();
		this.idEvento = idEvento;
		this.descripcion = descripcion;
		this.dispositivo = dispositivo;
		this.fechaHora = fechaHora;
	}
	
	

}