/*
 * Empleado: clase utilizada para declarar los atributos de tipo Empleado 
    (objeto generico escogido para esta implementación), crear sus respectivos constructores, y metodos get y set.
 * @author1 santiago.giraldo_car@uao.edu.co Santiago Giraldo 2170265
 * @author2 juan_jose.jimenez@uao.edu.co Juan Jiménez 2195626
 * @author3 juan_seb.orejuela@uao.edu.co Sebastián Orejuela 2195416
 * @author4 daniel_andres.velez@uao.edu.co Daniel Vélez 2195145
 * @date 16 abril 2021
 * @version 1.0

 */
package datos;

public class Empleado implements Comparable<Empleado> {

    private int id;

    private String nombre;

    private String puesto;

    private String despacho;

    public Empleado(int id, String nombre, String puesto, String despacho) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.despacho = despacho;
    }

    /**
     * Get the value of despacho
     *
     * @return the value of despacho
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * Set the value of despacho
     *
     * @param despacho new value of despacho
     */
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    /**
     * Get the value of puesto
     *
     * @return the value of puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Set the value of puesto
     *
     * @param puesto new value of puesto
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * toString.
     *
     * @param No recibe ningún parametro. // Este método se encarga de generar
     * una cadena de texto con todos los atributos de clase.
     * @return Cadena de texto con atributos de clase Empleado.
     */
    @Override
    public String toString() {
        return "Datos: " + "id: " + id + ", nombre: " + nombre + ", puesto: " + puesto + ", despacho: " + despacho;
    }

    /**
     * compareTo.
     *
     * @param empl. // Este método se encarga de comparar los id de Empleado.
     * @return Retorna un entero (0, -1, 1).
     */
    @Override
    public int compareTo(Empleado empl) {
        if (id == empl.id) {
            return 0;
        } else if (id < empl.id) {
            return -1;
        } else {
            return 1;
        }
    }

}
