/*
  * Clase "Main Ejemplo BST": clase main de la aplicación BST. También se utiliza para establecer algunas configuraciones iniciales
    pertenecientes al Arbol Binario, tales como su el id del Empleado, Nombre del Empleado, Puesto del Empleado y Despacho
    del Empleado.
 * @author1 santiago.giraldo_car@uao.edu.co Santiago Giraldo 2170265
 * @author2 juan_jose.jimenez@uao.edu.co Juan Jiménez 2195626
 * @author3 juan_seb.orejuela@uao.edu.co Sebastián Orejuela 2195416
 * @author4 daniel_andres.velez@uao.edu.co Daniel Vélez 2195145
 * @date 16 abril 2021
 * @version 1.0
 */
package vista;

import bst.*;
import datos.Empleado;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class MainEjemploBST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empleado e1 = new Empleado(20, "Juan", "Multimedia", "A11");
        Empleado e2 = new Empleado(44, "Sebastián", "Informática", "B13");
        Empleado e3 = new Empleado(18, "Santiago", "Ventas", "C55");
        Empleado e4 = new Empleado(33, "Daniel", "Ingeniería", "D64");
        Empleado e5 = new Empleado(64, "David", "Mecatrónica", "A69");
//        Empleado e6 = new Empleado(55, "Alejandro", "Informática", "A98");

        BST bst = new BST();

//        System.out.println("¿Está vacío?: "+ bst.esVacio() + ", ¿Es hoja: " + bst.esHoja());
//        bst.insertar(e1);
//        System.out.println("¿Está vacío?: " + bst.esVacio() + ", ¿Es hoja: " + bst.esHoja());
//        bst.insertar(e2);
//        System.out.println("¿Está vacío?: " + bst.esVacio() + ", ¿Es hoja: " + bst.esHoja());
        Arrays.asList(e1, e2, e3, e4, e5).forEach(e -> bst.insertar(e)); //Arreglo para insertar todos los elementos de la
        //lista en el árbol.
//        bst.eliminar(20);

//        bst.preOrden();
//        System.out.println(bst.existe(12));
//        System.out.println(bst.obtener(12));
//        System.out.println(bst.existe(20));
//        System.out.println(bst.obtener(20));
//        bst.inOrden();
//        bst.postOrden();
    }

}
