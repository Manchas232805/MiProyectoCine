package BusinessEntity;

public class Asiento {
    private int id;
    private String numero;
    private boolean ocupado;

    public Asiento() {}

    public Asiento(int id, String numero, boolean ocupado) {
        this.id = id;
        this.numero = numero;
        this.ocupado = ocupado;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public boolean isOcupado() { return ocupado; }
    public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }
}