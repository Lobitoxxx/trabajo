package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Ventas;
@Service
public interface VentasService {
	public Ventas registrar(Ventas a);
	public Ventas actualizar(Ventas a);
	public void eliminar(Ventas a);
	public List <Ventas>ver();
}
