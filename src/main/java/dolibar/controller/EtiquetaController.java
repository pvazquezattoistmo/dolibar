/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.controller;

import dolibar.entity.EtiquetaCategoria;
import dolibar.service.Repositorio;
import java.util.List;

/**
 *
 * @author PC
 */
public class EtiquetaController {

    Repositorio<EtiquetaCategoria> repositorio;

    public List<EtiquetaCategoria> listado() {
        return repositorio.listar();
    }

    public void agregar(EtiquetaCategoria etiquetaCategoria) {
        repositorio.guardar(etiquetaCategoria);
    }

    public EtiquetaCategoria buscarId(int id) {
        return repositorio.buscarId(id);
    }

}
