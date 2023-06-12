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

import com.trabajo.trabajo.entity.Detalle_Compra;
import com.trabajo.trabajo.service.Detalle_CompraService;

@RestController
@RequestMapping
public class Detalle_CompraController {
	@Autowired
	Detalle_CompraService x;
	
	@GetMapping("/Detalle_Compra")
	public List<Detalle_Compra> ver(){
		return x.ver();
	}
	
	@PostMapping("/Detalle_Compra")
	public Detalle_Compra registrar(@RequestBody Detalle_Compra a) {
		return x.registrar(a);
	}
	
	@PutMapping("/Detalle_Compra")
	public Detalle_Compra actualizar(@RequestBody Detalle_Compra a) {
		return x.actualizar(a);
	}
	
	@DeleteMapping("/Detalle_Compra")
	public  void eliminar(@RequestBody Detalle_Compra a) {
		x.eliminar(a);
	}
}
