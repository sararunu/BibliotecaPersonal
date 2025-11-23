package es.daw.bibliotecapersonal.service;

import es.daw.bibliotecapersonal.entity.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioDeLibros {

    private List<Libro> listaLibros = new ArrayList<>();

    private int id = 1;

    //métodos
    public Libro agregarLibro(String titulo, String autor, int paginas) {
        Libro libro = new Libro(id, titulo, autor, paginas, false);
        listaLibros.add(libro);
        id++;
        return  libro;
    }

    public List<Libro> obtenerTodosLosLibros() {
        return listaLibros;
    }

    public Libro obtenerLibroPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null; //si llega aquí, no lo ha encontrado
    }

    public List<Libro> obtenerLibrosLeidos() {
        List<Libro> librosLeidos = new ArrayList<>();
        for (Libro libro : listaLibros) {
            if (libro.isLeido()) {
                librosLeidos.add(libro);
            }
        }
        return librosLeidos;
    }

    public List<Libro> obtenerLibrosPendientes() {
        List<Libro> librosPendientes = new ArrayList<>();
        for (Libro libro : listaLibros) {
            if (!libro.isLeido()) {
                librosPendientes.add(libro);
            }
        }
        return librosPendientes;
    }

    public List<Libro> buscarPorAutor(String autor) {
        List<Libro> librosDeUnAutor = new ArrayList<>();
        for (Libro libro : listaLibros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                librosDeUnAutor.add(libro);
            }
        }
        return librosDeUnAutor;
    }


}
