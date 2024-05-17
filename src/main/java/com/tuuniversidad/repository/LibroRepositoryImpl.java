package com.tuuniversidad.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tuuniversidad.models.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository{
    
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl(){
        libros.add(new Libro((long) 1,"Los 5 lenguajes del amor", "Gary Chapman", "Unilit", 1992));
        libros.add(new Libro((long) 2,"Amar es para valientes", "Itiel Arroyo", "E625", 2019));
        libros.add(new Libro((long) 3,"Una Mujer Conforme al Corazón de Dios Favorito", "Elizabeth George", "Unilit", 2001));
        libros.add(new Libro((long) 4,"El verdadero arrepentimiento", "Charles G. Finney", "CLIE", 2008));
        libros.add(new Libro((long) 5,"Más allá del capítulo y el versículo", "Ken Casillas", "Ebi", 2020));
    }

    @Override
    public Libro getLibro(Long id) {
        for(Libro libro:libros){
            if(id == libro.getId())
                return libro;
        }
        return null;
    }

    @Override
    public List<Libro> getLibros() {
        //List<Libro> libros = getLibros();
        return libros;
    }

    @Override
    public Libro nuevoLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
