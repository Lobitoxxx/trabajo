package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Estado_Ventas;
@Service
public interface Estado_VentasService {
	public Estado_Ventas registrar(Estado_Ventas a);
	public Estado_Ventas actualizar(Estado_Ventas a);
	public void eliminar(Estado_Ventas a);
	public List <Estado_Ventas>ver();
}
