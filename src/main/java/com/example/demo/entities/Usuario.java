package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name =  "\"documento\"")
	private Long documento;
	
	@Column(name = "\"primerApellido\"")
	private String primerApellido;
	
	@Column(name = "\"primerNombre\"")
	private String primerNombre;

	@Column(name = "\"sexo\"")
	private String sexo;
	
	@Column(name = "\"correo\"")
	private String correo;
	
	@Column(name = "\"celular\"")
	private String celular;
	
	@Column(name = "\"clave\"")
	private String clave;
	
	@Column(name = "\"rol\"")
	private String rol;
	
	@Column(name = "\"fechaRegistro\"")
	private Date fechaRegistro;
	
	@Column(name="\"fechaActualizacion\"")
	private Date fechaActualizacion;
	
	@Column(name = "\"fechaUltimaSesion\"")
	private Date fechaUltimaSesion;
	
	@PrePersist
	public void prePersist() {
		this.fechaRegistro = new Date();
	}
	
	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Date getFechaUltimaSesion() {
		return fechaUltimaSesion;
	}

	public void setFechaUltimaSesion(Date fechaUltimaSesion) {
		this.fechaUltimaSesion = fechaUltimaSesion;
	}

	@Override
	public String toString() {
		return "Usuario [documento=" + documento + ", primerApellido=" + primerApellido + ", primerNombre="
				+ primerNombre + ", sexo=" + sexo + ", correo=" + correo + ", celular=" + celular + ", clave=" + clave
				+ ", rol=" + rol + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion
				+ ", fechaUltimaSesion=" + fechaUltimaSesion + "]";
	}
	
}
