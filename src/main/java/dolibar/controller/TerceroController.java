/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.controller;

import dolibar.entity.Tercero;
import dolibar.service.Repositorio;
import dolibar.service.TerceroRepositorioImpl;
import java.util.List;

/**
 *
 * @author PC
 */
public class TerceroController {

    Repositorio<Tercero> repositorio;

    public List<Tercero> listado() {
        return repositorio.listar();
    }

    public void agregar(Tercero tercero) {
        repositorio = new TerceroRepositorioImpl();
        repositorio.guardar(tercero);
    }

    public Tercero buscarId(int id) {
        return repositorio.buscarId(id);
    }

}
