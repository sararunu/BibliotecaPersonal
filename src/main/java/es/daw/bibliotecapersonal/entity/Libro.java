package es.daw.bibliotecapersonal.entity;

public class Libro {
    //atributos
    private int id;
    private String titulo;
    private String autor;
    private int paginas;
    private boolean leido;

    //constructores
    public Libro(int id, String titulo, String autor, int paginas, boolean leido) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.leido = leido;
    }

    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    //métodos
    public void marcarComoLeido(){
        this.leido = true;
    }
}
