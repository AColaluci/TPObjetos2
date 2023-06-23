package com.unla.grupo5OO22023.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
    private Dispositivo dispositivo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotEmpty
	@Column(name = "fechaHora")
	private LocalDateTime fechaHora;

}