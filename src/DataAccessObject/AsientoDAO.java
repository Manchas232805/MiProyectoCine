package DataAccessObject;

import BusinessEntity.Asiento;
import java.util.List;
import java.util.ArrayList;

public class AsientoDAO implements IBaseDAO<Asiento> {
    @Override
    public void insertar(Asiento t) { }
    @Override
    public void actualizar(Asiento t) { }
    @Override
    public void eliminar(int id) { }
    @Override
    public Asiento obtenerPorId(int id) { return null; }
    @Override
    public List<Asiento> obtenerTodos() { return new ArrayList<>(); }
}