package datos;

import java.util.Objects;

/**
 * Clase abstracta (no se instancia). Es superior a las clases Azafate y Piloto,
 * por lo que les hereda métodos y atributos.
 *
 */
public abstract class PersonalDeCabina {

    private String rut;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;

    /**
     * Constructor vacío de la clase.
     */
    public PersonalDeCabina() {
    }

    /**
     * Constructor con parámetros para la clase.
     *
     * @param rut El rut del personal de cabina como String.
     * @param nombre El nombre del personal de cabina como String.
     * @param apellido El apellido del personal de cabina como String.
     * @param nacionalidad La nacionalidad del personal de cabina como String.
     * @param edad La edad del personal de cabina como int.
     */
    public PersonalDeCabina(String rut, String nombre, String apellido, String nacionalidad, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    /**
     * Constructor con parámetros para la clase (en orden inverso al anteriror).
     *
     * @param edad La edad del personal de cabina como int.
     * @param nacionalidad La nacionalidad del personal de cabina como String.
     * @param apellido El apellido del personal de cabina como String.
     * @param nombre El nombre del personal de cabina como String.
     * @param rut El rut del personal de cabina como String.
     */
    public PersonalDeCabina(int edad, String nacionalidad, String apellido, String nombre, String rut) {

        this.edad = edad;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    /**
     * Accesador para el rut del personal de cabina.
     *
     * @return El rut como String.
     */
    public String getRut() {
        return rut;
    }

    /**
     * Mutador para actualizar el rut del personal de cabina.
     *
     * @param rut El rut nuevo.
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Accesador para el nombre del personal de cabina.
     *
     * @return El nombre como String.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Mutador para actualizar el nombre del personal de cabina.
     *
     * @param nombre El nombre nuevo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Accesador para el apellido del personal de cabina.
     *
     * @return El apellido como string.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Mutador para actualizar el apellido del personal de cabina
     *
     * @param apellido El apellido nuevo.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Accesador para la nacionalidad del personal de cabina.
     *
     * @return La nacionalidad como String.
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Mutador para actualizar la nacionalidad del personal de cabina.
     *
     * @param nacionalidad la Nacionalidad nueva.
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Accesador para la edad del del personal de cabina.
     *
     * @return La edad como int.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Mutador para actualizar la edad del personal de cabina.
     *
     * @param edad La edad nueva.
     */
    public void setEdad(int edad) {
        this.edad = edad;

    }

    /**
     * Método hash para ver el hashcode.
     *
     * @return El código hash como int.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    /**
     * Método equals para verificar igualdad (intuilizable porque esta clase
     * es abstracta, pero el examen lo solicita).
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
        final PersonalDeCabina other = (PersonalDeCabina) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.rut, other.rut)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        return true;
    }
    
    /**
     * Método que muestra mensaje de error por edad, sin cuerpo, porque cambia según 
     * la clase que lo use.
     */
    abstract public void mensajeDeErrorPorEdad();
    
       /**
     * Método que muestra mensaje de error por nombre, sin cuerpo, porque cambia según 
     * la clase que lo use.
     */
    abstract public void mensajeDeErrorPorNombre();
    
       /**
     * Método que muestra mensaje de error por apellido, sin cuerpo, porque cambia según 
     * la clase que lo use.
     */
    
    abstract public void mensajeDeErrorPorApellido();
    

}
