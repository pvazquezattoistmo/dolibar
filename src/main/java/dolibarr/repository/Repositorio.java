/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolibarr.repository;

import java.util.List;

/**
 *
 * @author PC
 */
public interface Repositorio <T> {
    
    List<T> listar();
    
    T buscarId(int id);
    
    void guardar(T t);
    
    void eliminar(int id);
    
}
