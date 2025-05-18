package DataAccessObject;

import BusinessEntity.Funcion;
import java.util.List;
import java.util.ArrayList;

public class FuncionDAO implements IBaseDAO<Funcion> {
    @Override
    public void insertar(Funcion t) { }
    @Override
    public void actualizar(Funcion t) { }
    @Override
    public void eliminar(int id) { }
    @Override
    public Funcion obtenerPorId(int id) { return null; }
    @Override
    public List<Funcion> obtenerTodos() { return new ArrayList<>(); }
}