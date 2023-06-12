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

import com.trabajo.trabajo.entity.Ventas;
import com.trabajo.trabajo.service.VentasService;

@RestController
@RequestMapping
public class VentasController {
	@Autowired
	VentasService x;
	
	@GetMapping("/Ventas")
	public List<Ventas> ver(){
		return x.ver();
	}
	
	@PostMapping("/Ventas")
	public Ventas registrar(@RequestBody Ventas a) {
		return x.registrar(a);
	}
	
	@PutMapping("/Ventas")
	public Ventas actualizar(@RequestBody Ventas a) {
		return x.actualizar(a);
	}
	
	@DeleteMapping("/Ventas")
	public  void eliminar(@RequestBody Ventas a) {
		x.eliminar(a);
	}
}
