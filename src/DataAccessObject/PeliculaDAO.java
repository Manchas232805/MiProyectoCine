package DataAccessObject;

import BusinessEntity.Pelicula;
import java.util.List;
import java.util.ArrayList;

public class PeliculaDAO implements IBaseDAO<Pelicula> {
    @Override
    public void insertar(Pelicula t) { }
    @Override
    public void actualizar(Pelicula t) { }
    @Override
    public void eliminar(int id) { }
    @Override
    public Pelicula obtenerPorId(int id) { return null; }
    @Override
    public List<Pelicula> obtenerTodos() { return new ArrayList<>(); }
}