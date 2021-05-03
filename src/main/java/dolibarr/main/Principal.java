/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibarr.main;

import dolibarr.jdbc.ConexionBaseDatos;
import dolibarr.models.entity.Contacto;
import dolibarr.models.entity.EtiquetaCategoria;
import dolibarr.models.entity.Tercero;
import dolibarr.repository.ContactoRepositorioImpl;
import dolibarr.repository.EtiquetaRepositorioImpl;
import dolibarr.repository.Repositorio;
import dolibarr.repository.TerceroRepositorioImpl;
import java.sql.Connection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class Principal {

    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.getInstance()) {

            Repositorio<EtiquetaCategoria> cat = new EtiquetaRepositorioImpl();
            System.out.println("=====================insertar etiqueta =====================");
            /*
            EtiquetaCategoria c1 = new EtiquetaCategoria();
            c1.setReferencia("123");
            c1.setDescripcion("prueba 1");
            c1.setTipo("proveedor");
            cat.guardar(c1);

            EtiquetaCategoria c2 = new EtiquetaCategoria();
            c2.setReferencia("123");
            c2.setDescripcion("prueba 1");
            c2.setTipo("proveedor");
            cat.guardar(c2);

            EtiquetaCategoria c3 = new EtiquetaCategoria();
            c3.setReferencia("123");
            c3.setDescripcion("prueba 1");
            c3.setTipo("proveedor");
            cat.guardar(c3);
            
             */
            List<EtiquetaCategoria> categorias = cat.listar();
            categorias.stream().forEach(x -> System.out.println(x));

            Repositorio<Tercero> terc = new TerceroRepositorioImpl();
            System.out.println("=====================insertar tercero =====================");
            /*
            Tercero t1 = new Tercero();
            t1.setNombreSimple("Jesus Alberto");
            t1.setTipoTercero("prueba2");
            t1.setDireccion("PRUEBA");
            t1.setCodPostal("89632");
            t1.setPais("UCRANIA");
            t1.setProvincia("LuagrPrueba");
            t1.setRfc("TGYWIEXXXX");
            t1.setRpimms("IGKSJFSD");
            t1.setImpuesto("52.6");
            t1.setFormaJuridica("djdklal");
            t1.setInconterms("sdfsdfs");
            terc.guardar(t1);

            Tercero t2 = new Tercero();
            t2.setNombreSimple("Jesus Alberto");
            t2.setTipoTercero("prueba2");
            t2.setDireccion("PRUEBA");
            t2.setCodPostal("5454");
            t2.setPais("UCRANIA");
            t2.setProvincia("LuagrPrueba");
            t2.setRfc("TGYWIEXXXX");
            t2.setRpimms("IGKSJFSD");
            t2.setImpuesto("52.6");
            t2.setFormaJuridica("djdklal");
            t2.setInconterms("sdfsdfs");
            terc.guardar(t2);

            Tercero t3 = new Tercero();
            t3.setNombreSimple("Jesus Alberto");
            t3.setTipoTercero("prueba2");
            t3.setDireccion("PRUEBA");
            t3.setCodPostal("545454");
            t3.setPais("UCRANIA");
            t3.setProvincia("LuagrPrueba");
            t3.setRfc("TGYWIEXXXX");
            t3.setRpimms("IGKSJFSD");
            t3.setImpuesto("dfsd");
            t3.setFormaJuridica("djdklal");
            t3.setInconterms("sdfsdfs");
            terc.guardar(t3);
             */
            
            List<Tercero> terceros = terc.listar();
            terceros.stream().forEachOrdered(x -> System.out.println(x));

            Repositorio<Contacto> contacs = new ContactoRepositorioImpl();
            System.out.println("=====================insertar contacto =====================");

            /*
            Contacto con1 = new Contacto();
            con1.setApellido("Prueba");
            con1.setNombre("prueba 1");

            con1.setTercero(terc.buscarId(1));

            con1.setTitulo("prueba");
            con1.setPuestoTrabajo("prueba");
            con1.setDireccion("prueba");
            con1.setCodigoPostal("prueba");
            con1.setCiudad("prueba");
            con1.setPais("prueba");
            con1.setEstado("prueba");
            con1.setTelTrabajo("prueba");
            con1.setCelular("prueba");
            con1.setEmail("prueba");
            con1.isCorreoMasivo();

            con1.setCategorias(cat.buscarId(1));

            con1.setFechaNacimiento(new Date());
            contacs.guardar(con1);

            Contacto c2 = new Contacto();
            c2.setApellido("123");
            c2.setNombre("prueba 1");

            c2.setTercero(terc.buscarId(2));

            c2.setTitulo("sdfdf");
            c2.setPuestoTrabajo("sdfsdf");
            c2.setDireccion("sdfsdf");
            c2.setCodigoPostal("sdfsf");
            c2.setCiudad("sdfsdf");
            c2.setPais("sdfsdf");
            c2.setEstado("sdfsdf");
            c2.setTelTrabajo("sdfsdf");
            c2.setCelular("sdfsdf");
            c2.setEmail("sdfsdf");
            c2.isCorreoMasivo();

            c2.setCategorias(cat.buscarId(2));

            c2.setFechaNacimiento(new Date());
            contacs.guardar(c2);

            Contacto c3 = new Contacto();
            c3.setApellido("123");
            c3.setNombre("prueba 1");

            c3.setTercero(terc.buscarId(3));

            c3.setTitulo("sdfdf");
            c3.setPuestoTrabajo("sdfsdf");
            c3.setDireccion("dfsdfs");
            c3.setCodigoPostal("sdfsdf");
            c3.setCiudad("sdfsdfsfd");
            c3.setPais("sdfsfddsf");
            c3.setEstado("sdfsdf");
            c3.setTelTrabajo("sdfsfds");
            c3.setCelular("sdfsdfs");
            c3.setEmail("sdfsdf");
            c3.isCorreoMasivo();

            c3.setCategorias(cat.buscarId(3));

            c3.setFechaNacimiento(new Date());
            contacs.guardar(c3);
             */
            
            List<Contacto> contactos = contacs.listar();
            contacs.listar().stream().forEach(x -> System.out.println(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
