package DataAccessObject;

import BusinessEntity.Boleto;
import java.util.List;
import java.util.ArrayList;

public class BoletoDAO implements IBaseDAO<Boleto> {
    @Override
    public void insertar(Boleto t) { }
    @Override
    public void actualizar(Boleto t) { }
    @Override
    public void eliminar(int id) { }
    @Override
    public Boleto obtenerPorId(int id) { return null; }
    @Override
    public List<Boleto> obtenerTodos() { return new ArrayList<>(); }
}