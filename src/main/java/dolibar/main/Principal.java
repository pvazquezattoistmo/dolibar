/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.main;

import dolibar.controller.ClienteController;
import dolibar.controller.ContactoController;
import dolibar.controller.EtiquetaController;
import dolibar.controller.ProveedorController;
import dolibar.controller.TerceroController;
import dolibar.data.ConexionBaseDatos;
import dolibar.entity.Cliente;
import dolibar.entity.Contacto;
import dolibar.entity.EtiquetaCategoria;
import dolibar.entity.Proveedor;
import dolibar.entity.Tercero;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author PC
 */
public class Principal {

    public static void main(String[] args) {
        try (Connection conn = ConexionBaseDatos.getInstance()) {
            System.out.println("===================== Etiqueta =====================");
            EtiquetaController etiquetaController = new EtiquetaController();
            /*
            EtiquetaCategoria etiqueta1 = new EtiquetaCategoria();
            etiqueta1.setReferencia("123");
            etiqueta1.setDescripcion("prueba 1");
            etiqueta1.setTipo("proveedor");
            etiquetaController.agregar(etiqueta1);

            EtiquetaCategoria etiqueta2 = new EtiquetaCategoria();
            etiqueta2.setReferencia("123");
            etiqueta2.setDescripcion("prueba 1");
            etiqueta2.setTipo("proveedor");
            etiquetaController.agregar(etiqueta2);

            EtiquetaCategoria etiqueta3 = new EtiquetaCategoria();
            etiqueta3.setReferencia("123");
            etiqueta3.setDescripcion("prueba 1");
            etiqueta3.setTipo("proveedor");
            etiquetaController.agregar(etiqueta3);
             */
            List<EtiquetaCategoria> categorias = etiquetaController.listado();
            categorias.stream().forEach(x -> System.out.println(x));

            System.out.println("===================== Tercero =====================");
            TerceroController terceroController = new TerceroController();
            /*
            Tercero tercero1 = new Tercero();
            tercero1.setNombreSimple("Jesus Alberto");
            tercero1.setTipoTercero("prueba2");
            tercero1.setDireccion("PRUEBA");
            tercero1.setCodPostal("89632");
            tercero1.setPais("UCRANIA");
            tercero1.setProvincia("LuagrPrueba");
            tercero1.setRfc("TGYWIEXXXX");
            tercero1.setRpimms("IGKSJFSD");
            tercero1.setImpuesto("52.6");
            tercero1.setFormaJuridica("djdklal");
            tercero1.setInconterms("sdfsdfs");
            terceroController.agregar(tercero1);

            Tercero tercero2 = new Tercero();
            tercero2.setNombreSimple("Jesus Alberto");
            tercero2.setTipoTercero("prueba2");
            tercero2.setDireccion("PRUEBA");
            tercero2.setCodPostal("5454");
            tercero2.setPais("UCRANIA");
            tercero2.setProvincia("LuagrPrueba");
            tercero2.setRfc("TGYWIEXXXX");
            tercero2.setRpimms("IGKSJFSD");
            tercero2.setImpuesto("52.6");
            tercero2.setFormaJuridica("djdklal");
            tercero2.setInconterms("sdfsdfs");
            terceroController.agregar(tercero2);

            Tercero tercero3 = new Tercero();
            tercero3.setNombreSimple("Jesus Alberto");
            tercero3.setTipoTercero("prueba2");
            tercero3.setDireccion("PRUEBA");
            tercero3.setCodPostal("545454");
            tercero3.setPais("UCRANIA");
            tercero3.setProvincia("LuagrPrueba");
            tercero3.setRfc("TGYWIEXXXX");
            tercero3.setRpimms("IGKSJFSD");
            tercero3.setImpuesto("dfsd");
            tercero3.setFormaJuridica("djdklal");
            tercero3.setInconterms("sdfsdfs");
            terceroController.agregar(tercero3);
             */
            List<Tercero> terceros = terceroController.listado();
            terceros.stream().forEachOrdered(x -> System.out.println(x));

            System.out.println("=====================insertar contacto =====================");
            ContactoController contactoController = new ContactoController();
            /*
            Contacto contacto1 = new Contacto();
            contacto1.setApellido("Prueba");
            contacto1.setNombre("prueba 1");

            contacto1.setTercero(terceroController.buscarId(1));

            contacto1.setTitulo("prueba");
            contacto1.setPuestoTrabajo("prueba");
            contacto1.setDireccion("prueba");
            contacto1.setCodigoPostal("prueba");
            contacto1.setCiudad("prueba");
            contacto1.setPais("prueba");
            contacto1.setEstado("prueba");
            contacto1.setTelTrabajo("prueba");
            contacto1.setCelular("prueba");
            contacto1.setEmail("prueba");
            contacto1.isCorreoMasivo();

            contacto1.setCategorias(etiquetaController.buscarId(1));

            contacto1.setFechaNacimiento(new Date());
            contactoController.agregar(contacto1);

            Contacto contacto2 = new Contacto();
            contacto2.setApellido("123");
            contacto2.setNombre("prueba 1");

            contacto2.setTercero(terceroController.buscarId(2));

            contacto2.setTitulo("sdfdf");
            contacto2.setPuestoTrabajo("sdfsdf");
            contacto2.setDireccion("sdfsdf");
            contacto2.setCodigoPostal("sdfsf");
            contacto2.setCiudad("sdfsdf");
            contacto2.setPais("sdfsdf");
            contacto2.setEstado("sdfsdf");
            contacto2.setTelTrabajo("sdfsdf");
            contacto2.setCelular("sdfsdf");
            contacto2.setEmail("sdfsdf");
            contacto2.isCorreoMasivo();

            contacto2.setCategorias(etiquetaController.buscarId(2));

            contacto2.setFechaNacimiento(new Date());
            contactoController.agregar(contacto2);

            Contacto contacto3 = new Contacto();
            contacto3.setApellido("123");
            contacto3.setNombre("prueba 1");

            contacto3.setTercero(terceroController.buscarId(3));

            contacto3.setTitulo("sdfdf");
            contacto3.setPuestoTrabajo("sdfsdf");
            contacto3.setDireccion("dfsdfs");
            contacto3.setCodigoPostal("sdfsdf");
            contacto3.setCiudad("sdfsdfsfd");
            contacto3.setPais("sdfsfddsf");
            contacto3.setEstado("sdfsdf");
            contacto3.setTelTrabajo("sdfsfds");
            contacto3.setCelular("sdfsdfs");
            contacto3.setEmail("sdfsdf");
            contacto3.isCorreoMasivo();

            contacto3.setCategorias(etiquetaController.buscarId(3));

            contacto3.setFechaNacimiento(new Date());
            contactoController.agregar(contacto3);
             */
            List<Contacto> contactos = contactoController.listado();
            contactos.stream().forEach(x -> System.out.println(x));

            System.out.println("=====================insertar proveedor =====================");
            ProveedorController proveedorController = new ProveedorController();
            /*
            Proveedor proveedor1 = new Proveedor();
            proveedor1.setCatprovedor(etiquetaController.buscarId(1));
            proveedor1.setCodBarras("3541643434");
            proveedor1.setTercero(terceroController.buscarId(1));
            proveedorController.agregar(proveedor1);
             */
            List<Proveedor> provee = proveedorController.listado();
            provee.stream().forEach(x -> System.out.println(x));

            System.out.println("=====================insertar cliente =====================");
            ClienteController clienteController = new ClienteController();
            /*
            Cliente clieente1 = new Cliente();
            clieente1.setCodCliente(565);
            clieente1.setCatCliente(etiquetaController.buscarId(2));
            clieente1.setTercero(terceroController.buscarId(2));
            clienteController.agregar(clieente1);
             */
            List<Cliente> clien = clienteController.listado();
            clien.stream().forEach(x -> System.out.println(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
