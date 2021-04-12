/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import bst.*;
import datos.Empleado;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
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
        Empleado e6 = new Empleado(55, "Alejandro", "Informática", "A98");
        
        BST bst = new BST();
//        System.out.println("¿Está vacío?: "+ bst.esVacio() + ", ¿Es hoja: " + bst.esHoja());
//        bst.insertar(e1);
//        System.out.println("¿Está vacío?: "+ bst.esVacio() + ", ¿Es hoja: " + bst.esHoja());
//        bst.insertar(e2);
//        System.out.println("¿Está vacío?: "+ bst.esVacio() + ", ¿Es hoja: " + bst.esHoja());

        Arrays.asList(e1, e2, e3, e4, e5, e6).forEach(e -> bst.insertar(e)); //Arreglo para insertar todos los elementos de la
        //lista en el árbol.

        bst.eliminar(20);
        bst.preOrden();

//        bst.inOrden();
//        bst.postOrden();
    }

}
