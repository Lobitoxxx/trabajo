package com.trabajo.trabajo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trabajo.trabajo.entity.BitExistenciaInicial;
import com.trabajo.trabajo.repository.BitExistenciaInicialRepository;


@Service
public class BitExistenciaInicialServiceImplement implements BitExistenciaInicialService{
	@Autowired
	BitExistenciaInicialRepository x;

	@Override
	public BitExistenciaInicial registrar(BitExistenciaInicial a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public BitExistenciaInicial actualizar(BitExistenciaInicial a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(BitExistenciaInicial a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<BitExistenciaInicial> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}
}
