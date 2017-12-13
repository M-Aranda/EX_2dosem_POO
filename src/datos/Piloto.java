package datos;

import java.util.Objects;

/**
 * Clase Piloto. Permite la creación de objetos del tipo Piloto. Hereda
 * atributos y métodos de la clase PersonalDeCabina.
 *
 * @see PersonalDeCabina
 */
public class Piloto extends PersonalDeCabina {

    private int horas_de_vuelo;

    /**
     * Constructor vacío.
     */
    public Piloto() {
    }

    /**
     * Constructor que permite la creación de un objeto del tipo Piloto. No
     * incluye las horas de vuelo del piloto, pero si tiene control de flujo de
     * datos para revisar la validez de los parámetros ingresados.
     *
     * @param rut El rut como String.
     * @param nombre El nombre como String.
     * @param apellido El apellido como String.
     * @param nacionalidad La nacionalidad como String.
     * @param edad La edad como int.
     */
    public Piloto(String rut, String nombre, String apellido, String nacionalidad, int edad) {
        super(rut, nombre, apellido, nacionalidad, edad);
        if (edad < 21) {
            mensajeDeErrorPorEdad();
        }
        if (nombre.equals(" ") || nombre.equals("")) {
            mensajeDeErrorPorNombre();
        }
        if (apellido.equals("") || apellido.equals(" ")) {
            mensajeDeErrorPorApellido();
        }
    }

    /**
     * Constructor que permite la creación de un objeto del tipo Piloto. Toma en
     * consideración las horas de vuelo del piloto, y además posee control de
     * flujo para regular la validez de los parámetros ingresados.
     *
     * @param rut El rut como String.
     * @param nombre El nombre como String.
     * @param apellido El apellido como String.
     * @param nacionalidad La nacionalidad como String.
     * @param edad La edad como int.
     * @param horas_de_vuelo Las horas_de_vuelo como int.
     */
    public Piloto(String rut, String nombre, String apellido, String nacionalidad, int edad, int horas_de_vuelo) {
        this.horas_de_vuelo = horas_de_vuelo;
        if (edad < 21) {
            mensajeDeErrorPorEdad();
        }
        if (nombre.equals(" ") || nombre.equals("")) {
            mensajeDeErrorPorNombre();
        }
        if (apellido.equals("") || apellido.equals(" ")) {
            mensajeDeErrorPorApellido();
        }
        if (this.horas_de_vuelo < 400) {
            mensajeDeErrorPorHorasDeVuelo();
        }
    }

    /**
     * Mutador para actualizar la edad. Muestra mensaje de error si el parámetro
     * no se adhiere a las reglas de la empresa.
     *
     * @param edad La edad nueva.
     */
    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
        if (edad < 21) {
            mensajeDeErrorPorEdad();
        }
    }

    /**
     * Accesador para la edad.
     *
     * @return La edad como int.
     */
    @Override
    public int getEdad() {
        return super.getEdad();
    }

    /**
     * Mutador para actualizar la nacionalidad.
     *
     * @param nacionalidad La nacionalidad nueva.
     */
    @Override
    public void setNacionalidad(String nacionalidad) {
        super.setNacionalidad(nacionalidad);
    }

    /**
     * Accesador para la nacionalidad.
     *
     * @return La nacionalidad como String.
     */
    @Override
    public String getNacionalidad() {
        return super.getNacionalidad();
    }

    /**
     * Mutador para actualizar el apellido. Muestra mensaje de error si el
     * parámetro no se adhiere a las reglas de la empresa.
     *
     * @param apellido El apellido nuevo.
     */
    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
        if (apellido.equals("") || apellido.equals(" ")) {
            mensajeDeErrorPorApellido();
        }

    }

    /**
     * Accesador para el apellido.
     *
     * @return El apellido como String.
     */
    @Override
    public String getApellido() {
        return super.getApellido();
    }

    /**
     * Mutador para actualizar el nombre Muestra mensaje de error si el
     * parámetro no se adhiere a las reglas de la empresa.
     *
     * @param nombre El nombre nuevo.
     */
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
        if (nombre.equals(" ") || nombre.equals("")) {
            mensajeDeErrorPorNombre();

        }
    }

    /**
     * Accesador para el nombre.
     *
     * @return El nombre como String.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Mutador para actualizar el rut.
     *
     * @param rut El rut nuevo.
     */
    @Override
    public void setRut(String rut) {
        super.setRut(rut);
    }

    /**
     * Accesador para el rut.
     *
     * @return El rut como String.
     */
    @Override
    public String getRut() {
        return super.getRut();
    }

    /**
     * Accesador para las horas_de_vuelo.
     * @return horas_de_vuelo (cuantas horas de vuelo) como int .
     */
    public int getHoras_de_vuelo() {
        return horas_de_vuelo;
    }

    /**
     * Mutador para actualizar las horas_de_vuelo
     * @param horas_de_vuelo  Las horas_de_vuelo nuevas.
     */
    public void setHoras_de_vuelo(int horas_de_vuelo) {
        this.horas_de_vuelo = horas_de_vuelo;
        if (this.horas_de_vuelo < 400) {
            mensajeDeErrorPorHorasDeVuelo();
        }

    }

    /**
     * Método toString para mostrar la información del Piloto.
     *
     * @return Los datos del piloto como String.
     */
    @Override
    public String toString() {
        return "" + getClass().getSimpleName().toLowerCase() + "{" + "Rut= " + getRut() + "Horas de vuelo= " + horas_de_vuelo
                + "Nombre= " + getNombre() + "Apellido= " + getApellido() + "Nacionalidad= " + getNacionalidad()
                + "Edad= " + getEdad() + '}';
    }

    /**
     * Método hash para ver el hashcode.
     *
     * @return El código hash como int.
     */
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    /**
     * Método equals para verificar igualdad.
     *
     * @param obj El objeto con el que se compara.
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
        final Piloto other = (Piloto) obj;
        if (this.horas_de_vuelo != other.horas_de_vuelo) {
            return false;
        }

        if (!Objects.equals(getRut(), other.getRut())) {
            return false;
        }
        if (!Objects.equals(getNombre(), other.getNombre())) {
            return false;
        }
        if (!Objects.equals(getApellido(), other.getApellido())) {
            return false;
        }
        if (!Objects.equals(getNacionalidad(), other.getNacionalidad())) {
            return false;
        }
        if (!Objects.equals(getEdad(), other.getEdad())) {
            return false;
        }
        return true;
    }

    /**
     * Mensaje de error sobreescrito. Advierte sobre la regla de negocio de la
     * edad (tripulante debe tener 21 años o más).
     *
     */
    @Override
    public void mensajeDeErrorPorEdad() {
        System.out.println("Error: Azafate debe de tener por lo menos 21 años de edad");
    }

    /**
     * Mensaje de error. Advierte sobre la regla de negocio del 
     * nombre (sólo letras, no puede estar en blanco) .
     */
    @Override
    public void mensajeDeErrorPorNombre() {
        System.out.println("Error: debe ingresar un nombre (debe ser sólo letras) para el piloto");
    }

    /**
     * Mensaje de error. Advierte sobre la regla de negocio del apellido (no debe
     * estar en blanco y sólo debe tener 2 palabras separadas por un espacio).
     */
    @Override
    public void mensajeDeErrorPorApellido() {
        System.out.println("Error: debe ingresar 2 apellidos separados por un espacio (deben contener sólo letras) para el piloto");
    }

    /**
     * Mensaje de error que se muestra si las horas_de_vuelo son menos de 400.
     */
    public void mensajeDeErrorPorHorasDeVuelo() {
        System.out.println("Error: la cantidad de horas de vuelo del piloto debe ser superior a 400");
    }
}
