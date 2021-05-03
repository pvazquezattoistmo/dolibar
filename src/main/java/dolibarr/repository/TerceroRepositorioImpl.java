/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibarr.repository;

import dolibarr.jdbc.ConexionBaseDatos;
import dolibarr.models.entity.Tercero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author PC
 */
public class TerceroRepositorioImpl implements Repositorio<Tercero> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Tercero> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tercero buscarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Tercero t) {
        String sql;

        if (t.getId() == 0) {
            sql = "INSERT INTO terceros(nombre_terceros, tipo_terceros, direccion_terceros, codigopostal_terceros, "
                    + "pais_terceros, provincia_terceros, rfc_terceros, rpimss_terceros, impuesto_terceros, "
                    + "formaJuridica_terceros, incoterms_terceros) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        } else {
            sql = "UPDATE terceros SET nombre_terceros = ?, SET tipo_terceros = ? "
                    + " SET direccion_terceros = ?,  SET codigopostal_terceros = ?,  SET pais_terceros = ?,"
                    + " SET provincia_terceros = ?,  SET rfc_terceros = ?,  SET rpimss_terceros = ?,"
                    + " SET impuesto_terceros = ?,  SET formaJuridica_terceros = ?,  SET incoterms_terceros = ?";
        }

        try (PreparedStatement stm = getConnection().prepareStatement(sql)) {

            stm.setString(1, t.getNombreSimple());
            stm.setString(2, t.getTipoTercero());
            stm.setString(3, t.getDireccion());
            stm.setString(4, t.getCodPostal());
            stm.setString(5, t.getPais());
            stm.setString(6, t.getProvincia());
            stm.setString(7, t.getRfc());
            stm.setString(8, t.getRpimms());
            stm.setString(9, t.getImpuesto());
            stm.setString(10, t.getFormaJuridica());
            stm.setString(11, t.getInconterms());

            stm.executeUpdate();

        } catch (SQLException ex) {

        }
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
