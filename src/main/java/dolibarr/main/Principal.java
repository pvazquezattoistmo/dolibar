/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibarr.main;

import dolibar.data.ConexionBaseDatos;
import dolibar.entity.Cliente;
import dolibar.entity.Contacto;
import dolibar.entity.EtiquetaCategoria;
import dolibar.entity.Proveedor;
import dolibar.entity.Tercero;
import dolibar.service.ClienteRepositorioImpl;
import dolibar.service.ContactoRepositorioImpl;
import dolibar.service.EtiquetaRepositorioImpl;
import dolibar.service.ProveedorRepositorioImp;
import dolibar.service.Repositorio;
import dolibar.service.TerceroRepositorioImpl;
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

            Contacto co2 = new Contacto();
            co2.setApellido("123");
            co2.setNombre("prueba 1");

            co2.setTercero(terc.buscarId(2));

            co2.setTitulo("sdfdf");
            co2.setPuestoTrabajo("sdfsdf");
            co2.setDireccion("sdfsdf");
            co2.setCodigoPostal("sdfsf");
            co2.setCiudad("sdfsdf");
            co2.setPais("sdfsdf");
            co2.setEstado("sdfsdf");
            co2.setTelTrabajo("sdfsdf");
            co2.setCelular("sdfsdf");
            co2.setEmail("sdfsdf");
            co2.isCorreoMasivo();

            co2.setCategorias(cat.buscarId(2));

            co2.setFechaNacimiento(new Date());
            contacs.guardar(co2);

            Contacto co3 = new Contacto();
            co3.setApellido("123");
            co3.setNombre("prueba 1");

            co3.setTercero(terc.buscarId(3));

            co3.setTitulo("sdfdf");
            co3.setPuestoTrabajo("sdfsdf");
            co3.setDireccion("dfsdfs");
            co3.setCodigoPostal("sdfsdf");
            co3.setCiudad("sdfsdfsfd");
            co3.setPais("sdfsfddsf");
            co3.setEstado("sdfsdf");
            co3.setTelTrabajo("sdfsfds");
            co3.setCelular("sdfsdfs");
            co3.setEmail("sdfsdf");
            co3.isCorreoMasivo();

            co3.setCategorias(cat.buscarId(3));

            co3.setFechaNacimiento(new Date());
            contacs.guardar(co3);
             */
            List<Contacto> contactos = contacs.listar();
            contactos.stream().forEach(x -> System.out.println(x));

            Repositorio<Proveedor> prov = new ProveedorRepositorioImp();
            System.out.println("=====================insertar proveedor =====================");

            /*
            Proveedor pro1 = new Proveedor();
            pro1.setCatprovedor(cat.buscarId(1));
            pro1.setCodBarras("3541643434");
            pro1.setTercero(terc.buscarId(1));
            prov.guardar(pro1);
             */
            List<Proveedor> provee = prov.listar();
            provee.stream().forEach(x -> System.out.println(x));

            Repositorio<Cliente> cliente = new ClienteRepositorioImpl();
            System.out.println("=====================insertar cliente =====================");

            /*
            Cliente clie = new Cliente();
            clie.setCodCliente(565);
            clie.setCatCliente(cat.buscarId(2));
            clie.setTercero(terc.buscarId(2));
            cliente.guardar(clie);
             */
            List<Cliente> clien = cliente.listar();
            clien.stream().forEach(x -> System.out.println(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
