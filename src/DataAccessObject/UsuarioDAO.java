package DataAccessObject;

import BusinessEntity.Usuario;
import java.sql.*;

public class UsuarioDAO implements IBaseDAO<Usuario> {

    @Override
    public void insertar(Usuario usuario) {
        try (Connection con = ConexionMySQL.getConnection()) {
            String sql = "INSERT INTO Usuario (nombre, correo, contrasena) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getContrasena());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Usuario usuario) {
        try (Connection con = ConexionMySQL.getConnection()) {
            String sql = "UPDATE Usuario SET nombre=?, correo=?, contrasena=? WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getContrasena());
            ps.setInt(4, usuario.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {
        try (Connection con = ConexionMySQL.getConnection()) {
            String sql = "DELETE FROM Usuario WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Usuario obtenerPorId(int id) {
        try (Connection con = ConexionMySQL.getConnection()) {
            String sql = "SELECT * FROM Usuario WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getInt("id"), rs.getString("nombre"),
                        rs.getString("correo"), rs.getString("contrasena"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public java.util.List<Usuario> obtenerTodos() {
        java.util.List<Usuario> lista = new java.util.ArrayList<>();
        try (Connection con = ConexionMySQL.getConnection()) {
            String sql = "SELECT * FROM Usuario";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new Usuario(rs.getInt("id"), rs.getString("nombre"),
                        rs.getString("correo"), rs.getString("contrasena")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean login(String correo, String contrasena) {
        try (Connection con = ConexionMySQL.getConnection()) {
            String sql = "SELECT * FROM Usuario WHERE correo=? AND contrasena=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, contrasena);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
