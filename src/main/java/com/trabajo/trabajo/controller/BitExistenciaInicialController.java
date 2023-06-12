package com.trabajo.trabajo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabajo.trabajo.entity.BitExistenciaInicial;
import com.trabajo.trabajo.service.BitExistenciaInicialService;

@RestController
@RequestMapping
public class BitExistenciaInicialController {
	@Autowired
	BitExistenciaInicialService x;
	
	@GetMapping("/BitExistenciaInicial")
	public List<BitExistenciaInicial>ver(){
		return x.ver();
	}
	
	@PostMapping("/BitExistenciaInicial")
	public BitExistenciaInicial registrar(@RequestBody BitExistenciaInicial a) {
		return x.registrar(a);
	}
	
	@PutMapping("/BitExistenciaInicial")
	public BitExistenciaInicial actualizar(@RequestBody BitExistenciaInicial a) {
		return x.actualizar(a);
	}
	
	@DeleteMapping("/BitExistenciaInicial")
	public  void eliminar(@RequestBody BitExistenciaInicial a) {
		x.eliminar(a);
	}
}