package BusinessEntity;

import java.sql.Date;
import java.sql.Time;

public class Funcion {
    private int id;
    private int idPelicula;
    private Date fecha;
    private Time hora;

    public Funcion() {}

    public Funcion(int id, int idPelicula, Date fecha, Time hora) {
        this.id = id;
        this.idPelicula = idPelicula;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdPelicula() { return idPelicula; }
    public void setIdPelicula(int idPelicula) { this.idPelicula = idPelicula; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public Time getHora() { return hora; }
    public void setHora(Time hora) { this.hora = hora; }
}