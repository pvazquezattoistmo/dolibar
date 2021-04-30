/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibarr.repository;

import dolibarr.jdbc.ConexionBaseDatos;
import dolibarr.models.entity.EtiquetaCategoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class EtiquetaRepositorioImpl implements Repositorio<EtiquetaCategoria> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<EtiquetaCategoria> listar() {
        List<EtiquetaCategoria> etiquetas = new ArrayList<>();

        try (Statement stm = getConnection().createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM categoriasetiquetas")) {

            while (rs.next()) {
                EtiquetaCategoria c = new EtiquetaCategoria();

                c.setId(rs.getInt("id_categorias"));
                c.setDescripcion(rs.getString("descripcion_categorias"));
                c.setReferencia(rs.getString("referencia_categorias"));
                c.setTipo(rs.getString("tipo_categorias"));

                etiquetas.add(c);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return etiquetas;
    }

    @Override
    public EtiquetaCategoria buscarId(int id) {

        EtiquetaCategoria c = null;

        try (PreparedStatement stm = getConnection().prepareStatement("SELECT * FROM categoriasetiquetas WHERE id_categorias = ?")) {
            stm.setInt(1, id);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                c = new EtiquetaCategoria();
                c.setId(rs.getInt("id_categorias"));
                c.setReferencia(rs.getString("referencia_categorias"));
                c.setDescripcion(rs.getString("descripcion_categorias"));
                c.setTipo(rs.getString("tipo_categorias"));
            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return c;
    }

    @Override
    public void guardar(EtiquetaCategoria t) {
        String sql;

        if (t.getId() == 0) {
            sql = "INSERT INTO categoriasetiquetas(referencia_categorias, descripcion_categorias, tipo_categorias) VALUES (?, ?, ?)";
        } else {
            sql = "UPDATE categoriasetiquetas SET referencia_categorias = ?, SET descripcion_categorias = ? "
                    + " SET tipo_categorias = ?";
        }

        try (PreparedStatement stm = getConnection().prepareStatement(sql)) {
            
            stm.setString(1, t.getReferencia());
            stm.setString(2, t.getDescripcion());
            stm.setString(3, t.getTipo());
            
            stm.executeUpdate();

        } catch (SQLException ex) {

        }
    }

    @Override
    public void eliminar(int id) {

    }

}
