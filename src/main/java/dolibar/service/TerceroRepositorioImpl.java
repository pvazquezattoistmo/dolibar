/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.service;

import dolibar.data.ConexionBaseDatos;
import dolibar.entity.Tercero;
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
public class TerceroRepositorioImpl implements Repositorio<Tercero> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Tercero> listar() {
        List<Tercero> Tert = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement();
                ResultSet rss = stmt.executeQuery("SELECT * FROM terceros")) {

            while (rss.next()) {
                Tercero ter = new Tercero();
                ter.setId(rss.getInt("id_terceros"));
                ter.setNombreSimple(rss.getString("nombre_terceros"));
                ter.setTipoTercero(rss.getString("tipo_terceros"));
                ter.setDireccion(rss.getString("direccion_terceros"));
                ter.setCodPostal(rss.getString("codigopostal_terceros"));
                ter.setPais(rss.getString("pais_terceros"));
                ter.setProvincia(rss.getString("provincia_terceros"));
                ter.setRfc(rss.getString("rfc_terceros"));
                ter.setRpimms(rss.getString("rpimss_terceros"));
                ter.setImpuesto(rss.getString("impuesto_terceros"));
                ter.setFormaJuridica(rss.getString("formajuridica_terceros"));

                Tert.add(ter);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Tert;
    }

    @Override
    public Tercero buscarId(int id) {
        Tercero ter = null;
        try (PreparedStatement pst = getConnection().prepareStatement("SELECT * FROM terceros WHERE id_terceros = ?")) {
            pst.setInt(1, id);
            ResultSet rss = pst.executeQuery();
            if (rss.next()) {
                ter = new Tercero();
                ter.setId(rss.getInt("id_terceros"));
                ter.setNombreSimple(rss.getString("nombre_terceros"));
                ter.setTipoTercero(rss.getString("tipo_terceros"));
                ter.setDireccion(rss.getString("direccion_terceros"));
                ter.setCodPostal(rss.getString("codigopostal_terceros"));
                ter.setPais(rss.getString("pais_terceros"));
                ter.setProvincia(rss.getString("provincia_terceros"));
                ter.setRfc(rss.getString("rfc_terceros"));
                ter.setRpimms(rss.getString("rpimss_terceros"));
                ter.setImpuesto(rss.getString("impuesto_terceros"));
                ter.setFormaJuridica(rss.getString("formajuridica_terceros"));

            }
            rss.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ter;
    }

    @Override
    public void guardar(Tercero t) {

        String sql;

        if (t.getId() == 0) {
            sql = "INSERT INTO terceros(nombre_terceros, tipo_terceros, direccion_terceros, codigopostal_terceros, "
                    + "pais_terceros, provincia_terceros, rfc_terceros, rpimss_terceros, impuesto_terceros, "
                    + "formaJuridica_terceros, incoterms_terceros) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        } else {
            sql = "UPDATE terceros SET nombre_terceros = ?, SET tipo_terceros = ?, "
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
            ex.printStackTrace();
        }

    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
