/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.controller;

import dolibar.entity.Proveedor;
import dolibar.service.ProveedorRepositorioImp;
import dolibar.service.Repositorio;
import java.util.List;

/**
 *
 * @author PC
 */
public class ProveedorController {

    Repositorio<Proveedor> repositorio;

    public List<Proveedor> listado() {
        repositorio = new ProveedorRepositorioImp();
        return repositorio.listar();
    }

    public void agregar(Proveedor proveedor) {
        repositorio = new ProveedorRepositorioImp();
        repositorio.guardar(proveedor);
    }

    public Proveedor buscarId(int id) {
        repositorio = new ProveedorRepositorioImp();
        return repositorio.buscarId(id);
    }

}
