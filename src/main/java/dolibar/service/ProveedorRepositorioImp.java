package dolibar.service;

import dolibar.data.ConexionBaseDatos;
import dolibar.entity.EtiquetaCategoria;
import dolibar.entity.Proveedor;
import dolibar.entity.Tercero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProveedorRepositorioImp implements Repositorio<Proveedor> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Proveedor> listar() {
        List<Proveedor> etiquetas = new ArrayList<>();
        try (Statement stm = getConnection().createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM proveedores")) {

            while (rs.next()) {
                Proveedor p = new Proveedor();
                p.setId(rs.getInt("id_proveedores"));

                p.setCodigoProvedor(rs.getInt("codigo_proovedores"));

                Repositorio<EtiquetaCategoria> cat = new EtiquetaRepositorioImpl();
                EtiquetaCategoria ec = cat.buscarId(rs.getInt("categoria_proveedores"));
                p.setCatprovedor(ec);

                p.setCodBarras(rs.getString("codigoBarras_proveedores"));

                Repositorio<Tercero> tercero = new TerceroRepositorioImpl();
                Tercero terco = tercero.buscarId(rs.getInt("id_tercero"));
                p.setTercero(terco);

                etiquetas.add(p);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return etiquetas;
    }

    @Override
    public Proveedor buscarId(int id) {
        Proveedor p = null;
        try (PreparedStatement stm = getConnection().prepareStatement("SELECT * FROM proveedores WHERE id_proveedores = ?");
                ResultSet rs = stm.executeQuery()) {
            if (rs.next()) {
                p.setId(rs.getInt("id_terceros"));
                p.setCodigoProvedor(rs.getInt("codigo_proveedores"));

                Repositorio<EtiquetaCategoria> cat = new EtiquetaRepositorioImpl();
                EtiquetaCategoria ec = cat.buscarId(rs.getInt("categoria_proveedores"));
                p.setCatprovedor(ec);

                Repositorio<Tercero> tercero = new TerceroRepositorioImpl();
                Tercero terco = tercero.buscarId(rs.getInt("id_tercero"));
                p.setTercero(terco);

                p.setCodBarras(rs.getString("codigoBarras_proveedor"));

            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;

    }

    @Override
    public void guardar(Proveedor t) {
        String sql;
        if (t.getId() == 0) {

            sql = "INSERT INTO proveedores(codigo_proovedores, categoria_proveedores, codigoBarras_proveedores, "
                    + "id_tercero) VALUES(?,?,?,?) ";

        } else {

            sql = "UPDATE proveedores SET codigo_proveedores = ?, SET categoria_proveedores = ?,"
                    + "SET codigoBarras_proveedores = ?";
        }
        try (PreparedStatement stm = getConnection().prepareStatement(sql)) {

            stm.setInt(1, t.getCodigoProvedor());
            stm.setInt(2, t.getCatprovedor().getId());
            stm.setString(3, t.getCodBarras());
            stm.setInt(4, t.getTercero().getId());

            stm.executeUpdate();
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
