package com.tuuniversidad.repository;

import java.util.ArrayList;
import java.util.List;

import com.tuuniversidad.models.Libro;

public class LibroRepositoryImpl implements LibroRepository{
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl(){
        libros.add(new Libro(1L,"Los 5 lenguajes del amor", "Gary Chapman", "Unilit", 1992));
        libros.add(new Libro(2L,"Amar es para valientes", "Itiel Arroyo", "E625", 2019));
        libros.add(new Libro(3L,"Una Mujer Conforme al Corazón de Dios Favorito", "Elizabeth George", "Unilit", 2001));
        libros.add(new Libro(4L,"El verdadero arrepentimiento", "Charles G. Finney", "CLIE", 2008));
        libros.add(new Libro(5L,"Más allá del capítulo y el versículo", "Ken Casillas", "Ebi", 2020));
    }

    @Override
    public Libro getLibro(long id) {
        for(Libro libro:libros){
            if(id == libro.getId())
                return libro;
        }
        return null;
    }

    @Override
    public List<Libro> getLibros() {
        List<Libro> libros = getLibros();
        return libros;
    }

    @Override
    public Libro nuevoLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
