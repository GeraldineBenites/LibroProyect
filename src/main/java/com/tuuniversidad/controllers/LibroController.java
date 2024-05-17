package com.tuuniversidad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tuuniversidad.models.Libro;
import com.tuuniversidad.service.LibroService;

public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libros")
    public List<Libro> getLibros(){
        return libroService.getLibros();
    } 

    @GetMapping("/libros/{id}")
    public Libro getLibro(@PathVariable long id){
        Libro libro = libroService.getLibro(id);
        return libro;
    }

    @PostMapping
    public Libro nuevoLibro(@RequestBody Libro libro){
        return libroService.nuevoLibro(libro);
    }
}
