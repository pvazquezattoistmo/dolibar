/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.controller;

import dolibar.entity.Cliente;
import dolibar.service.ClienteRepositorioImpl;
import dolibar.service.Repositorio;
import java.util.List;

/**
 *
 * @author PC
 */
public class ClienteController {

    Repositorio<Cliente> repositorio;

    public List<Cliente> listado() {
        repositorio = new ClienteRepositorioImpl();
        return repositorio.listar();
    }

    public void agregar(Cliente cliente) {
        repositorio = new ClienteRepositorioImpl();
        repositorio.guardar(cliente);
    }

    public Cliente buscarId(int id) {
        repositorio = new ClienteRepositorioImpl();
        return repositorio.buscarId(id);
    }

}
