package com.tuuniversidad.repository;

import java.util.List;

import com.tuuniversidad.models.Libro;

public interface LibroRepository {
    Libro getLibro(Long id);
    List<Libro> getLibros();
    Libro nuevoLibro(Libro libro);

}
