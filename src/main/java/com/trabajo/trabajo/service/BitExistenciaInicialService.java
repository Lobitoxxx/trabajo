package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.BitExistenciaInicial;
@Service
public interface BitExistenciaInicialService {
	public BitExistenciaInicial registrar(BitExistenciaInicial a);
	public BitExistenciaInicial actualizar(BitExistenciaInicial a);
	public void eliminar(BitExistenciaInicial a);
	public List <BitExistenciaInicial>ver();
}
