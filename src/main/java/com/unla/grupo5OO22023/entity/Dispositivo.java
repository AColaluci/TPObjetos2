package com.unla.grupo5OO22023.entity;

//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name ="dispositivo") 
public abstract class Dispositivo{
	
	//ATRIBUTO
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "idDispositivo")   
	protected int idDispositivo; 
	
	@NotEmpty
	@Column(name="nombre")
	protected String nombre;
	
	@NotEmpty
	@Column(name = "estado")
	protected boolean estado; 

	//METODOS ABSTRACTOS QUE VAN A TENER TODOS LOS DISPOS
	public abstract void actualizarEstado();

	public Dispositivo() {
		super();
	}

	public Dispositivo(@NotNull int idDispositivo, @NotEmpty String nombre, @NotEmpty boolean estado) {
		super();
		this.idDispositivo = idDispositivo;
		this.nombre = nombre;
		this.estado = estado;
	}

	public int getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
}