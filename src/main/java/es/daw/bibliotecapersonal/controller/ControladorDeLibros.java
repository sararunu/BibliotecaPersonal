package es.daw.bibliotecapersonal.controller;

import es.daw.bibliotecapersonal.entity.Libro;
import es.daw.bibliotecapersonal.service.ServicioDeLibros;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControladorDeLibros {

    //constructor de INYECCIÓN DE DEPENDENCIAS
    private final ServicioDeLibros servicioDeLibros;

    public ControladorDeLibros(ServicioDeLibros servicioDeLibros, ServicioDeLibros servicioDeLibros1) {
        this.servicioDeLibros = servicioDeLibros;
    }

    @GetMapping("/libros")
    public List<Libro> obtenerTodosLosLibros() {
        return servicioDeLibros.obtenerTodosLosLibros();
    }

    @GetMapping("/libros/{id}")
    public Libro obtenerLibro(@PathVariable int id) {
        return servicioDeLibros.obtenerLibroPorId(id); //hay q pasarle el id
    }

    @GetMapping("/libros/leidos")
    public List<Libro> obtenerLibrosLeidos() {
        return servicioDeLibros.obtenerLibrosLeidos();
    }

    @GetMapping("/libros/pendientes")
    public List<Libro> obtenerLibrosPendientes() {
        return servicioDeLibros.obtenerLibrosPendientes();
    }

    @GetMapping("/libros/buscar")
    public List<Libro> buscarPorAutor(String autor) {
        return servicioDeLibros.buscarPorAutor(autor);
    }

    //requestbody = json comlejos
    //requestparam = parámetros simples
    @PostMapping("/libros")
    public Libro agregarLibro(@RequestParam String titulo, @RequestParam String autor, @RequestParam int paginas) {
        return servicioDeLibros.agregarLibro(titulo, autor, paginas);
    }

}
