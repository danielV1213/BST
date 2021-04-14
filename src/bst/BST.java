/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst; //BINARY SEARCH TREE (ÁRBOL BINARIO DE BÚSQUEDA)

import datos.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class BST implements IBST<Empleado> {

    private Empleado valor;

    private BST izdo, dcho;

    private BST padre;

    public Empleado getValor() {
        return valor;
    }

    @Override
    public boolean esVacio() {
        return valor == null;
    }

    @Override
    public boolean esHoja() {
        return valor != null && izdo == null && dcho == null;
    }

    public void insertarImpl(Empleado empl, BST padre) {
        if (valor == null) {
            this.valor = empl;
            this.padre = padre;
        } else {
            if (empl.compareTo(valor) < 0) { //En este caso, el empl es menor y se debe seguir por el subárbol derecho.
                if (izdo == null) {
                    izdo = new BST();
                }
                izdo.insertarImpl(empl, this);

            } else if (empl.compareTo(valor) > 0) {
                if (dcho == null) {
                    dcho = new BST();
                }
                dcho.insertarImpl(empl, this);
            } else {
                throw new RuntimeException("Insertando elemento duplicado");
            }
        }
    }

    @Override
    public void insertar(Empleado empl) {
        insertarImpl(empl, null); //Estamos insertando al árbol raíz.
    }

    @Override
    public boolean existe(int id) {
        if (valor != null) {
            if (id == valor.getId()) {
                return true;
            } else if (id < valor.getId() && izdo != null) {
                return izdo.existe(id);
            } else if (id > valor.getId() && dcho != null) {
                return dcho.existe(id);
            } else {
                return false;
            }
        } else {
            return false;

        }
    }

    @Override
    public Empleado obtener(int id) {
        if (valor != null) {
            if (id == valor.getId()) {
                return valor;
            } else if (id < valor.getId() && izdo != null) {
                return izdo.obtener(id);
            } else if (id > valor.getId() && dcho != null) {
                return dcho.obtener(id);
            } else {
                return null;
            }
        } else {
            return null;

        }
    }

    @Override
    public String preOrden() {
        String m = "";
        if (valor != null) {

            m += valor.toString() + "\n";
            System.out.println(valor);
            if (izdo != null) {
                izdo.preOrden();
                String izq = izdo.getValor().toString();
                m += izq + "\n";
            }
            if (dcho != null) {
                dcho.preOrden();
                String dere = dcho.getValor().toString();
                m += dere + "\n";
            }

        }
        return m;
    }

    @Override
    public String inOrden() {
        String m = "";
        if (valor != null) {
            if (izdo != null) {
                izdo.inOrden();
                String izq = izdo.getValor().toString();
                m += izq + "\n";
            }
            m += valor.toString() + "\n";
            System.out.println(valor);
            if (dcho != null) {
                dcho.inOrden();//Añadir retorno de una cadena
                String dere = dcho.getValor().toString();
                m += dere + "\n";
            }

        }
        return m;
    }

    @Override
    public String postOrden() {
        String m = "";
        if (valor != null) {
            if (izdo != null) {
                izdo.postOrden();
                String izq = izdo.getValor().toString();
                m += izq + "\n";
            }
            if (dcho != null) {
                dcho.postOrden();
                String dere = dcho.getValor().toString();
                m += dere + "\n";
            }
            m += valor.toString() + "\n";
            System.out.println(valor);//Añadir retorno de una cadena
        }
        return m;
    }

    private BST minimo() {
        if (izdo != null && !izdo.esVacio()) {
            return izdo.minimo();
        } else {
            return this;
        }
    }

    private void eliminarImpl(int id) {
        if (izdo != null && dcho != null) {
            //Eliminar con 2 hijos.
            BST minimo = dcho.minimo();
            this.valor = minimo.valor;
            dcho.eliminar(minimo.valor.getId());
        } else if (izdo != null || dcho != null) {
            //Eliminar con 1 hijo. 
            BST sustituto = izdo != null ? izdo : dcho;
            this.valor = sustituto.valor;
            this.izdo = sustituto.izdo;
            this.dcho = sustituto.dcho;
        } else {
            //Eliminar hoja.
            if (padre != null) {
                if (this == padre.izdo) {
                    padre.izdo = null;
                }
                if (this == padre.dcho) {
                    padre.dcho = null;
                }
                padre = null;
            }
            valor = null;
        }
    }

    @Override
    public void eliminar(int id) {
        if (valor != null) {
            if (id == valor.getId()) {
                eliminarImpl(id);
            } else if (id < valor.getId() && izdo != null) {
                izdo.eliminar(id);
            } else if (id > valor.getId() && dcho != null) {
                dcho.eliminar(id);
            }
        }

    }

}
