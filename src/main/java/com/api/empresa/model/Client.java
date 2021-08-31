package com.api.empresa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String identificacion_cc;
	private String razon_social;
	private String contacto;
	private String region;
	
	public Client() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdentificacion_cc() {
		return identificacion_cc;
	}

	public void setIdentificacion_cc(String identificacion_cc) {
		this.identificacion_cc = identificacion_cc;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", identificacion_cc=" + identificacion_cc + ", razon_social=" + razon_social
				+ ", contacto=" + contacto + ", region=" + region + "]";
	}
	
	
	
}
