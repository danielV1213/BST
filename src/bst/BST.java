/*
 * Clase BST: clase utilizada para implementar los metodos del Arbol Binario de Búsqueda (Binary Search Tree)
    de tipo Empleado (objeto generico escogido para esta implementación) que harán parte de la libreria BST.
 * @author1 santiago.giraldo_car@uao.edu.co Santiago Giraldo 2170265
 * @author2 juan_jose.jimenez@uao.edu.co Juan Jiménez 2195626
 * @author3 juan_seb.orejuela@uao.edu.co Sebastián Orejuela 2195416
 * @author4 daniel_andres.velez@uao.edu.co Daniel Vélez 2195145
 * @date 16 abril 2021
 * @version 1.0

 */
package bst; //BINARY SEARCH TREE (ÁRBOL BINARIO DE BÚSQUEDA)

import datos.Empleado;
import javax.swing.JOptionPane;

public class BST implements IBST<Empleado> {

    private Empleado valor;

    private BST izdo, dcho;

    private BST padre;

    /**
     * getValor.
     *
     * @param No recibe nada. // Este método se encarga de obtener el valor de
     * Empleado.
     * @return Retorna valor.
     */
    public Empleado getValor() {
        return valor;
    }

    /**
     * esVacio.
     *
     * @param No recibe nada. // Este método se encarga verificar si esta vacio.
     * @return Retorna valor.
     */
    @Override
    public boolean esVacio() {
        return valor == null;
    }

    /**
     * esHoja.
     *
     * @param No recibe nada. // Este método se encarga de verificar si un
     * objeto es hoja.
     * @return Retorna valor.
     */
    @Override
    public boolean esHoja() {
        return valor != null && izdo == null && dcho == null;
    }

    /**
     * insertarImpl
     *
     * @param empl, padre. // Este método se encarga de insertar un objeto tipo
     * empleado a una rama del arbol.
     * @return Retorna nada.
     */
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

    /**
     * insertar.
     *
     * @param empl. // Este método se encarga insertar un objeto tipo empleado a
     * la raiz.
     * @return No retorna nada.
     */
    @Override
    public void insertar(Empleado empl) {
        insertarImpl(empl, null); //Estamos insertando al árbol raíz.
    }

    /**
     * existe.
     *
     * @param id. // Este método se encarga verificar la existencia de un objeto
     * tipo empleado buscandolo por su id.
     * @return Retorna un booleano.
     */
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

    /**
     * obtener.
     *
     * @param id. // Este método se encarga de obtener el id del objeto tipo
     * Empleado.
     * @return Retorna un valor.
     */
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

    /**
     * preOrden.
     *
     * @param No recibe nada. // Este método se encarga de recorrer el arbol de
     * tipo empleado de la forma PreOrden.
     * @return Retorna m.
     */
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

    /**
     * inOrde.
     *
     * @param No recibe nada. // Este método se encarga de recorrer el arbol de
     * tipo empleado de la forma inOrden.
     * @return Retorna m.
     */
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

    /**
     * postOrden.
     *
     * @param No recibe nada. // Este método se encarga de recorrer el arbol de
     * tipo empleado de la forma PostOrden.
     * @return Retorna m.
     */
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

    /**
     * minimo.
     *
     * @param No recibe nada. // Este método se encarga de retornar el valor
     * minimo.
     * @return Retorna valor minimo.
     */
    private BST minimo() {
        if (izdo != null && !izdo.esVacio()) {
            return izdo.minimo();
        } else {
            return this;
        }
    }

    /**
     * eliminarImpl.
     *
     * @param id. // Este método se encarga de recorrer el arbol, buscando un id
     * deseado por el usuario.
     * @return Retorna un null.
     */
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

    /**
     * eliminar.
     *
     * @param id. // Este método se encarga de eliminar un objeto de tipo
     * empleado por su id.
     * @return No retorna nada.
     */
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
