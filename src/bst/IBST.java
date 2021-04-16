/*
 * Interfaz IBST: interfaz utilizada para declarar los metodos de la interfaz del Arbol Binario de Búsqueda 
    (Interface Binary Search Tree), usa la interfaz Comparable de Java.
 * @author1 santiago.giraldo_car@uao.edu.co Santiago Giraldo 2170265
 * @author2 juan_jose.jimenez@uao.edu.co Juan Jiménez 2195626
 * @author3 juan_seb.orejuela@uao.edu.co Sebastián Orejuela 2195416
 * @author4 daniel_andres.velez@uao.edu.co Daniel Vélez 2195145
 * @date 16 abril 2021
 * @version 1.0

 */
package bst;

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
