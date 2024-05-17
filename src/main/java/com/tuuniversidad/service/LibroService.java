package com.tuuniversidad.service;

import java.util.List;

import com.tuuniversidad.models.Libro;

public interface LibroService {
    Libro getLibro(Long id);
    List<Libro> getLibros();
    Libro nuevoLibro(Libro libro);
}
