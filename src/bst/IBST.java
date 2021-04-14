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
public interface IBST<T extends Comparable> {

    public void insertar(T empl);

    public boolean existe(int id);

    public T obtener(int d);

    public boolean esHoja();

    public boolean esVacio();

    public String preOrden();

    public String inOrden();

    public String postOrden();

    public void eliminar(int d);

}
