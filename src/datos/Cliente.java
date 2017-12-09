package datos;

import java.util.Objects;

/**
 * Clase Cliente. Se le puede entregan parámetros para construir un objeto del tipo
 * Cliente.
 *
 */
public class Cliente {

    private String rut;
    private String nombre;

    /**
     * Constructor vacío, para crear un cliente sin datos.
     */
    public Cliente() {
    }

    /**
     * Constructor utilizado para crear un objeto del tipo Cliente.
     * Posee control de flujo para verificar el nombre.
     *
     * @param rut El rut del cliente como String.
     * @param nombre El nombre del cliente como String.
     */
    public Cliente(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        if (nombre.equals(" ") || nombre.equals("")) {
            mensajeDeErrorPorNombreCliente();

        }

    }

    /**
     * Constructor para crear un objeto tipo cliente, pero sólo con el rut.
     *
     * @param rut El rut del cliente como String.
     */
    public Cliente(String rut) {
        this.rut = rut;

    }

    /**
     * Accesador para el rut del cliente.
     *
     * @return El rut como String.
     */
    public String getRut() {
        return rut;
    }

    /**
     * Mutador para actualizar el rut del cliente.
     *
     * @param rut El rut nuevo.
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Accesador para el nombre del cliente.
     *
     * @return El nombre como String.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Mutador para actualizar el nombre del cliente.
     * Posee contro de flujo para verificar el nombre.
     *
     * @param nombre El nombre nuevo.
     */
    public void setNombre(String nombre) {

        this.nombre = nombre;
        if (nombre.equals(" ") || nombre.equals("")) {
            mensajeDeErrorPorNombreCliente();

        }
    }

    /**
     * Método toString para mostrar la informacion del objeto tipo cliente.
     *
     * @return La información del objecto creado, como String.
     */
    @Override
    public String toString() {
        return "" + getClass().getSimpleName().toLowerCase() + "{" + "rut=" + rut + ", nombre=" + nombre + '}';
    }

    /**
     * Método hash para ver el hashcode.
     *
     * @return El código hash como int.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    /**
     * Método equals para verificar igualdad..
     *
     * @param obj el objeto con el que se compara.
     * @return Valor true o false dependiendo dependiendo si el objeto a
     * comparar es igual o no.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.rut, other.rut)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    /**
     * Mensaje de error. Advierte sobre la regla de negocio del  
     * nombre (sólo letras, no puede estar vacío).
     */
    public void mensajeDeErrorPorNombreCliente() {
        System.out.println("Error: Debe ingresar un nombre (debe ser sólo letras)");
    }

}
