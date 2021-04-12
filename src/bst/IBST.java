/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author Daniel
 */
public interface IBST <T extends Comparable> {

    void insertar(T empl);

    boolean existe(int id);

    T obtener(int d);

    boolean esHoja();

    boolean esVacio();

    void preOrden();

    void inOrden();

    void postOrden();

    void eliminar(int d);

}
