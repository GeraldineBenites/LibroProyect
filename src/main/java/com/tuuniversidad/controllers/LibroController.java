package com.tuuniversidad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuuniversidad.models.Libro;
import com.tuuniversidad.service.LibroService;

@RestController
public class LibroController {

    @Autowired
    private LibroService libroService;


    @GetMapping("/hola")
    public String Hola(){
        return "Hola Spring libros";
    } 

    @GetMapping("/libros")
    public List<Libro> getLibros(){
            return libroService.getLibros();
    } 

    @GetMapping("/libros/{id}")
    public Libro getLibro(@PathVariable long id){
        Libro libro = libroService.getLibro(id);
        return libro;
    }


    @PostMapping("/libroPos")
    public String crearLibro(@RequestBody Libro nuevoLibro) {
        libroService.nuevoLibro(nuevoLibro);
        return "Libro creado correctamente";
    }
}
