package com.trabajo.trabajo.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Detalle_lote;
@Service
public interface Detalle_loteService {
	public Detalle_lote registrar(Detalle_lote a);
	public Detalle_lote actualizar(Detalle_lote a);
	public void eliminar(Detalle_lote a);
	public List<Detalle_lote> ver();
}