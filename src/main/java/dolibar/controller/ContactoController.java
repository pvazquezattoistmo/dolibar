/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.controller;

import dolibar.entity.Contacto;
import dolibar.service.ContactoRepositorioImpl;
import dolibar.service.Repositorio;
import java.util.List;

/**
 *
 * @author PC
 */
public class ContactoController {

    Repositorio<Contacto> repositorio;

    public List<Contacto> listado() {
        repositorio = new ContactoRepositorioImpl();
        return repositorio.listar();
    }

    public void agregar(Contacto contacto) {
        repositorio = new ContactoRepositorioImpl();
        repositorio.guardar(contacto);
    }

    public Contacto buscarId(int id) {
        repositorio = new ContactoRepositorioImpl();
        return repositorio.buscarId(id);
    }

}
