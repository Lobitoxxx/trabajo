package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.Ajustes;

@Service
public interface AjustesService {
	public Ajustes registrar(Ajustes a);
	public Ajustes actualizar(Ajustes a);
	public void eliminar(Ajustes a);
	public List <Ajustes>ver();
}
