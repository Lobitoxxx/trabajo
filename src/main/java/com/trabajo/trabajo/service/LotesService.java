package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Lotes;
@Service
public interface LotesService {
	public Lotes registrar(Lotes a);
	public Lotes actualizar(Lotes a);
	public void eliminar(Lotes a);
	public List <Lotes>ver();
}
