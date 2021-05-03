/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibarr.repository;

import dolibarr.jdbc.ConexionBaseDatos;
import dolibarr.models.entity.Contacto;
import dolibarr.models.entity.EtiquetaCategoria;
import dolibarr.models.entity.Tercero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class ContactoRepositorioImpl implements Repositorio<Contacto> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Contacto> listar() {
        List<Contacto> etiquetas = new ArrayList<>();

        try (Statement stm = getConnection().createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM contactos")) {

            while (rs.next()) {
                Contacto c = new Contacto();

                c.setId(rs.getInt("id_contactos"));
                c.setNombre(rs.getString("nombre_contactos"));
                c.setApellido(rs.getString("apellido_contactos"));

                Repositorio<Tercero> tercero = new TerceroRepositorioImpl();
                Tercero terco = tercero.buscarId(rs.getInt("id_tercero"));
                c.setTercero(terco);

                c.setTitulo(rs.getString("titulo_contactos"));
                c.setPuestoTrabajo(rs.getString("puestoTrabajo_contactos"));
                c.setDireccion(rs.getString("direccion_contactos"));
                c.setCodigoPostal(rs.getString("codigoPostal_contactos"));
                c.setCiudad(rs.getString("ciudad_contactos"));
                c.setPais(rs.getString("pais_contactos"));
                c.setEstado(rs.getString("estado_contactos"));
                c.setTelTrabajo(rs.getString("telTrabajo_contactos"));
                c.setCelular(rs.getString("celular_contactos"));
                c.setEmail(rs.getString("email_contactos"));
                c.setCorreoMasivo(rs.getBoolean("correoMasivo_contactos"));

                Repositorio<EtiquetaCategoria> cat = new EtiquetaRepositorioImpl();
                EtiquetaCategoria ec = cat.buscarId(rs.getInt("etiqueta_contactos"));
                c.setCategorias(ec);

                c.setFechaNacimiento(rs.getDate("fechanacimiento_contactos"));
                etiquetas.add(c);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return etiquetas;
    }

    @Override
    public Contacto buscarId(int id) {

        Contacto c = null;

        try (PreparedStatement stm = getConnection().prepareStatement("SELECT * FROM contactos WHERE id_contactos = ?")) {
            stm.setInt(1, id);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                c = new Contacto();
                c.setApellido(rs.getString("apellido_contactos"));
                c.setNombre(rs.getString("nombre_contactos"));

                Repositorio<Tercero> tercero = new TerceroRepositorioImpl();
                Tercero terco = tercero.buscarId(rs.getInt("id_tercero"));
                c.setTercero(terco);

                c.setTitulo(rs.getString("titulo_contactos"));
                c.setPuestoTrabajo(rs.getString("puestoTrabajo_contactos"));
                c.setDireccion(rs.getString("direccion_contactos"));
                c.setCodigoPostal(rs.getString("codigoPostal_contactos"));
                c.setCiudad(rs.getString("ciudad_contactos"));
                c.setPais(rs.getString("pais_contactos"));
                c.setEstado(rs.getString("estado_contactos"));
                c.setTelTrabajo(rs.getString("telTrabajo_contactos"));
                c.setCelular(rs.getString("celular_contactos"));
                c.setEmail(rs.getString("email_contactos"));

                c.setCorreoMasivo(rs.getBoolean("correoMasivo_contactos"));

                Repositorio<EtiquetaCategoria> cat = new EtiquetaRepositorioImpl();
                EtiquetaCategoria ec = cat.buscarId(rs.getInt("etiqueta_contactos"));
                c.setCategorias(ec);

                c.setFechaNacimiento(rs.getDate("fechanacimiento_contactos"));

            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return c;
    }

    @Override
    public void guardar(Contacto t) {
        String sql;

        if (t.getId() == 0) {
            sql = "INSERT INTO contactos(nombre_contactos, apellido_contactos, id_tercero, titulo_contactos, "
                    + "puestoTrabajo_contactos, direccion_contactos, codigoPostal_contactos, ciudad_contactos, "
                    + "pais_contactos, estado_contactos, telTrabajo_contactos, celular_contactos, email_contactos, "
                    + "correoMasivo_contactos, etiqueta_contactos, fechanacimiento_contactos) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        } else {
            sql = "UPDATE contacto SET apellido_contacto = ?, SET nombre_contacto = ? "
                    + " SET tercero_contacto = ?,SET titulo_contacto = ?,SET puestotrabajo_contacto = ?,SET direccion_contacto = ?,"
                    + "SET coidgopostal_contacto = ?,SET ciudad_contacto = ?,SET pais_contacto = ?,SET estado_contacto = ?,"
                    + "SET teltrabajo_contacto = ?,SET celular_contacto = ?,SET email_contacto = ?,SET correosmasivos_contacto = ?,"
                    + "SET categoria_contacto = ?,SET fechanacimiento_contacto = ?";
        }

        try (PreparedStatement stm = getConnection().prepareStatement(sql)) {

            stm.setString(1, t.getNombre());
            stm.setString(2, t.getApellido());

            stm.setInt(3, t.getTercero().getId());

            stm.setString(4, t.getTitulo());
            stm.setString(5, t.getPuestoTrabajo());
            stm.setString(6, t.getDireccion());
            stm.setString(7, t.getCodigoPostal());
            stm.setString(8, t.getCiudad());
            stm.setString(9, t.getPais());
            stm.setString(10, t.getEstado());
            stm.setString(11, t.getTelTrabajo());
            stm.setString(12, t.getCelular());
            stm.setString(13, t.getEmail());
            stm.setBoolean(14, t.isCorreoMasivo());

            stm.setInt(15, t.getCategorias().getId());
            
            Date date = new Date();
            java.sql.Date data = new java.sql.Date(date.getTime());
            stm.setDate(16, data);

            stm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(int id) {

    }

}
