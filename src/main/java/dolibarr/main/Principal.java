/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibarr.main;

import dolibarr.jdbc.ConexionBaseDatos;
import dolibarr.models.entity.EtiquetaCategoria;
import dolibarr.models.entity.Tercero;
import dolibarr.repository.EtiquetaRepositorioImpl;
import dolibarr.repository.Repositorio;
import dolibarr.repository.TerceroRepoImp;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class Principal {

    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.getInstance()) {

            Repositorio<EtiquetaCategoria> repo = new EtiquetaRepositorioImpl();
            System.out.println("=====================insertar producto =====================");

            EtiquetaCategoria c1 = new EtiquetaCategoria();
            c1.setReferencia("123");
            c1.setDescripcion("prueba 1");
            c1.setTipo("proveedor");
            repo.guardar(c1);

            EtiquetaCategoria c2 = new EtiquetaCategoria();
            c2.setReferencia("123");
            c2.setDescripcion("prueba 1");
            c2.setTipo("proveedor");
            repo.guardar(c2);

            EtiquetaCategoria c3 = new EtiquetaCategoria();
            c3.setReferencia("123");
            c3.setDescripcion("prueba 1");
            c3.setTipo("proveedor");
            repo.guardar(c3);

        } catch (Exception e) {
        }
        try(Connection conn = ConexionBaseDatos.getInstance()) {
            Repositorio<Tercero> terc = new TerceroRepoImp();
            System.out.println("=====================insertar producto =====================");
            
            Tercero t1 = new Tercero();
            t1.setId_tercero(555);
            t1.setNombreSimple("Jesus Alberto");
            t1.setTipo("prueba2");
            t1.setDireccion("PRUEBA");
            t1.setCodPostal(8963);
            t1.setPais("UCRANIA");
            t1.setProvincia("LuagrPrueba");
            t1.setRfc("TGYWIEXXXX");
            t1.setRpimms("IGKSJFSD");
            t1.setImpuesto(589);
            t1.setFormaJuridica("djdklalñ");
            terc.guardar(t1);
            
            Tercero t2 = new Tercero();
            t2.setId_tercero(555);
            t2.setNombreSimple("Jesus Alberto");
            t2.setTipo("prueba2");
            t2.setDireccion("PRUEBA");
            t2.setCodPostal(8963);
            t2.setPais("UCRANIA");
            t2.setProvincia("LuagrPrueba");
            t2.setRfc("TGYWIEXXXX");
            t2.setRpimms("IGKSJFSD");
            t2.setImpuesto(589);
            t2.setFormaJuridica("djdklalñ");
            terc.guardar(t2);
            
            Tercero t3 = new Tercero();
            t3.setId_tercero(555);
            t3.setNombreSimple("Jesus Alberto");
            t3.setTipo("prueba2");
            t3.setDireccion("PRUEBA");
            t3.setCodPostal(8963);
            t3.setPais("UCRANIA");
            t3.setProvincia("LuagrPrueba");
            t3.setRfc("TGYWIEXXXX");
            t3.setRpimms("IGKSJFSD");
            t3.setImpuesto(589);
            t3.setFormaJuridica("djdklalñ");
            terc.guardar(t3);
        } catch (Exception e) {
        
    }
    }
}
