/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibarr.main;

import dolibarr.jdbc.ConexionBaseDatos;
import dolibarr.models.entity.EtiquetaCategoria;
import dolibarr.repository.EtiquetaRepositorioImpl;
import dolibarr.repository.Repositorio;
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
    }
}
