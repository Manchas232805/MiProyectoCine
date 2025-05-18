package BusinessEntity;

public class Boleto {
    private int id;
    private int idFuncion;
    private int idAsiento;
    private int idUsuario;
    private double precio;

    public Boleto() {}

    public Boleto(int id, int idFuncion, int idAsiento, int idUsuario, double precio) {
        this.id = id;
        this.idFuncion = idFuncion;
        this.idAsiento = idAsiento;
        this.idUsuario = idUsuario;
        this.precio = precio;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdFuncion() { return idFuncion; }
    public void setIdFuncion(int idFuncion) { this.idFuncion = idFuncion; }

    public int getIdAsiento() { return idAsiento; }
    public void setIdAsiento(int idAsiento) { this.idAsiento = idAsiento; }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}