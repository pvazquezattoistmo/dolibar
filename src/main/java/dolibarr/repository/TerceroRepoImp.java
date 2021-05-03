package dolibarr.repository;

import com.mysql.cj.jdbc.result.ResultSetInternalMethods;
import dolibarr.jdbc.ConexionBaseDatos;
import dolibarr.models.entity.EtiquetaCategoria;
import dolibarr.models.entity.Tercero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TerceroRepoImp implements Repositorio<Tercero>{
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
                 ter.setId_tercero(rss.getInt("id_tercero"));
                 ter.setNombreSimple(rss.getString("nombre_terceros"));
                 ter.setTipo(rss.getString("tipo_terceros"));
                 ter.setDireccion(rss.getString("direccion_terceros"));
                 ter.setCodPostal(rss.getInt("codigopostal_terceros"));
                 ter.setPais(rss.getString("pais_terceros"));
                 ter.setProvincia(rss.getString("provincia_terceros"));
                 ter.setRfc(rss.getString("rfc_terceros"));
                 ter.setRpimms(rss.getString("rpimms_terceros"));
                 ter.setImpuesto(rss.getInt("impuesto_terceros"));
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
        try (PreparedStatement pst = getConnection().prepareStatement("\"SELECT * FROM categoriasetiquetas WHERE id_terceros = ?\"")){
           pst.setInt(1, id);
           ResultSet rss = pst.executeQuery();
            if (rss.next()) {
                ter = new Tercero();
                ter.setId_tercero(rss.getInt("id_tercero"));
                ter.setNombreSimple(rss.getString("nombre_terceros"));
                ter.setTipo(rss.getString("tipo_terceros"));
                ter.setDireccion(rss.getString("direccion_terceros"));
                ter.setCodPostal(rss.getInt("codigopostal_terceros"));
                ter.setPais(rss.getString("pais_terceros"));
                ter.setProvincia(rss.getString("provincia_terceros"));
                ter.setRfc(rss.getString("rfc_terceros"));
                ter.setRpimms(rss.getString("rpimms_terceros"));
                ter.setImpuesto(rss.getInt("impuesto_terceros"));
                ter.setFormaJuridica(rss.getString("formajuridica_terceros"));
                
            }
           rss.close();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return  ter;
    }
    
    @Override
    public void guardar(Tercero t) {
        String sql;
        if (t.getId_tercero() == 0) {
            sql = "INSERT INTO terceros(nombre_terceros,tipo_terceros,direccion_terceros,codigopostal_terceros,pais_terceros,provincia_terceros,"
                    + "rfc_terceros,rpimms_terceros,impuesto_terceros,formajuridica_terceros) VALUES (?, ?, ?,?,?,?,?,?,?,?)";
        } else {
            sql = "UPDATE terceros SET nombre_terceros =?, SET tipo_terceros = ?,"
                    + "SET direccion_terceros = ?, SET codigopostal_terceros = ?, SET pais_terceros = ?,"
                    + "SET provincia_terceros = ?, SET rfc_terceros = ?,SET rpimms_terceros = ?,"
                    + "SET impuesto_terceros = ?, SET formajuridica_terceros = ?";
            
            try(PreparedStatement pst = getConnection().prepareStatement(sql)) {
                pst.setString(1, t.getNombreSimple());
                pst.setString(2, t.getTipo());
                pst.setString(3, t.getDireccion());
                pst.setInt(4, t.getCodPostal());
                pst.setString(5, t.getPais());
                pst.setString(6, t.getProvincia());
                pst.setString(7, t.getRfc());
                pst.setString(8, t.getRpimms());
                pst.setInt(9, t.getImpuesto());
                pst.setString(10, t.getFormaJuridica());
                
                pst.executeUpdate();
                
            } catch (SQLException ex) {
            }
        }
        
        
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
