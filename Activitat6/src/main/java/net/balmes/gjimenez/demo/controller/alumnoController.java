package net.balmes.gjimenez.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.balmes.raulr.demo.entity.Alumne;
import net.balmes.raulr.demo.entity.Proyecto;
import repositorio.alumneRepositori;

@RestController
@RequestMapping("api")
public class alumnoController {
	
	@Autowired
	alumneRepositori alRep;
	
	@GetMapping("alumne/{id}")
	public Alumne getAlumne(@PathVariable long id) {
		Alumne alum = alRep.findById(id).get();
		
		return alum;
	}
}
