package com.tuuniversidad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuuniversidad.models.Libro;
import com.tuuniversidad.service.LibroService;
import com.tuuniversidad.utils.LibroException;

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
    public ResponseEntity<Libro> getLibro(@PathVariable long id){

        Libro libro = libroService.getLibro(id);

        if(libro == null){
            throw new LibroException("no se encontró la persona con el " + id);
        }

        return ResponseEntity.ok(libro);

        // if(libro != null){
        //     return ResponseEntity.ok(libro);
        // }else{
        //     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(libro);
        // }
    }


    @PostMapping("/libroPos")
    public ResponseEntity<Libro> crearLibro(@RequestBody Libro nuevoLibro) {
        var new_libro = libroService.nuevoLibro(nuevoLibro);
        return ResponseEntity.status(HttpStatus.CREATED).body(new_libro);
    }
}
