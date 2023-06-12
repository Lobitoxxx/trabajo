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

import com.trabajo.trabajo.entity.Estado_Ventas;
import com.trabajo.trabajo.service.Estado_VentasService;

@RestController
@RequestMapping
public class Estado_VentasController {
	@Autowired
	Estado_VentasService x;
	
	@GetMapping("/Estado_Ventas")
	public List<Estado_Ventas>ver(){
		return x.ver();
	}
	
	@PostMapping("/Estado_Ventas")
	public Estado_Ventas registrar(@RequestBody Estado_Ventas a) {
		return x.registrar(a);
	}
	
	@PutMapping("/Estado_Ventas")
	public Estado_Ventas actualizar(@RequestBody Estado_Ventas a) {
		return x.actualizar(a);
	}
	
	@DeleteMapping("/Estado_Ventas")
	public  void eliminar(@RequestBody Estado_Ventas a) {
		x.eliminar(a);
	}
}