package com.trabajo.trabajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="BitExistenciaInicial")
@Table(name="bitexistencialinicial")
public class BitExistenciaInicial {
	@Id
	String idExistencialInicial;
	String idProducto;
	String idLote;
	int cantidad;
	public BitExistenciaInicial() {
		super();
	}
	public BitExistenciaInicial(String idExistencialInicial,String idProducto,String idLote,int cantidad) {
		super();
		this.idExistencialInicial=idExistencialInicial;
		this.idProducto=idProducto;
		this.idLote=idLote;
		this.cantidad=cantidad;
	}
	public String getIdExistencialInicial() {
		return idExistencialInicial;
	}
	public void setIdExistencialInicial(String idExistencialInicial) {
		this.idExistencialInicial = idExistencialInicial;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getIdLote() {
		return idLote;
	}
	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}