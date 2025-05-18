package BusinessEntity;

public class Pelicula {
    private int id;
    private String titulo;
    private int duracion; // en minutos
    private String clasificacion;

    public Pelicula() {}

    public Pelicula(int id, String titulo, int duracion, String clasificacion) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }

    public String getClasificacion() { return clasificacion; }
    public void setClasificacion(String clasificacion) { this.clasificacion = clasificacion; }
}