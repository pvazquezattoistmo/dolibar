/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibarr.repository;

import dolibarr.jdbc.ConexionBaseDatos;
import dolibarr.models.entity.Cliente;
import dolibarr.models.entity.EtiquetaCategoria;
import dolibarr.models.entity.Tercero;
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
public class ClienteRepositorioImpl implements Repositorio<Cliente> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> etiquetas = new ArrayList<>();
        try (Statement stm = getConnection().createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM clientes")) {

            while (rs.next()) {
                Cliente c = new Cliente();

                c.setCodCliente(rs.getInt("id_clientes"));

                Repositorio<EtiquetaCategoria> cat = new EtiquetaRepositorioImpl();
                EtiquetaCategoria ec = cat.buscarId(rs.getInt("etiqueta_clientes"));
                c.setCatCliente(ec);

                Repositorio<Tercero> tercero = new TerceroRepositorioImpl();
                Tercero terco = tercero.buscarId(rs.getInt("id_tercero"));
                c.setTercero(terco);
                
                etiquetas.add(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return etiquetas;
    }

    @Override
    public Cliente buscarId(int id) {
        Cliente c = null;

        try (PreparedStatement stm = getConnection().prepareStatement("SELECT * FROM clientes WHERE id_clientes = ?")) {
            stm.setInt(1, id);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                c = new Cliente();
                c.setCodCliente(rs.getInt("codigo_clientes"));
                Repositorio<EtiquetaCategoria> cat = new EtiquetaRepositorioImpl();
                EtiquetaCategoria ec = cat.buscarId(rs.getInt("categoria_proveedores"));
                c.setCatCliente(ec);

                Repositorio<Tercero> tercero = new TerceroRepositorioImpl();
                Tercero terco = tercero.buscarId(rs.getInt("id_tercero"));
                c.setTercero(terco);

            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return c;
    }

    @Override
    public void guardar(Cliente t) {
        String sql;
        if (t.getId() == 0) {
            sql = "INSERT INTO clientes(codigo_clientes, etiqueta_clientes, id_tercero) "
                    + "VALUES (?, ?, ?)";
        } else {
            sql = "UPDATE cliente SET codigo_cliente = ?, SET etiqueta_cliente = ? "
                    + " SET tercero_cliente = ?";
        }

        try (PreparedStatement stm = getConnection().prepareStatement(sql)) {

            stm.setInt(1, t.getCodCliente());
            stm.setInt(2, t.getCatCliente().getId());
            stm.setInt(3, t.getTercero().getId());

            stm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    @Override
    public void eliminar(int id) {

    }
}
