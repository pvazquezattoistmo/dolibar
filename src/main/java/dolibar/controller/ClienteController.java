/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.controller;

import dolibar.entity.Cliente;
import dolibar.service.Repositorio;
import java.util.List;

/**
 *
 * @author PC
 */
public class ClienteController {

    Repositorio<Cliente> repositorio;

    public List<Cliente> listado() {
        return repositorio.listar();
    }

    public void agregar(Cliente cliente) {
        repositorio.guardar(cliente);
    }

    public Cliente buscarId(int id) {
        return repositorio.buscarId(id);
    }

}
