package com.luismanrique.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message ="no puede estar vacio")
	@Size(min=4, max=12, message="el tamaño tiene que estar entre 4 y 12")
	@Column(nullable=false)
	private String nombre;
	
	@NotEmpty(message ="no puede estar vacio")
	private String apellido;
	
	@NotEmpty(message ="no puede estar vacio")
	@Email(message="no es una dirección de correo bien formada")
	@Column(nullable=false, unique=false)
	private String email;
	
	@NotEmpty(message ="no puede estar vacio")
	@Column(nullable=false, unique=false)
	private String telefono;
	
	@NotNull(message ="no puede estar vacio")
	@Column(name="fecha_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	private static final long serialVersionUID = 1L;
}
