/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibar.controller;

import dolibar.entity.EtiquetaCategoria;
import dolibar.service.EtiquetaRepositorioImpl;
import dolibar.service.Repositorio;
import java.util.List;

/**
 *
 * @author PC
 */
public class EtiquetaController {

    Repositorio<EtiquetaCategoria> repositorio;

    public List<EtiquetaCategoria> listado() {
        repositorio = new EtiquetaRepositorioImpl();
        return repositorio.listar();
    }

    public void agregar(EtiquetaCategoria etiquetaCategoria) {
        repositorio = new EtiquetaRepositorioImpl();
        repositorio.guardar(etiquetaCategoria);
    }

    public EtiquetaCategoria buscarId(int id) {
        repositorio = new EtiquetaRepositorioImpl();
        return repositorio.buscarId(id);
    }

}
