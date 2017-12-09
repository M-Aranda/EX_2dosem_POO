package datos;

import java.util.Objects;

/**
 * Clase Azafate. Permite la creación de objetos tipo Azafate. Hereda atributos
 * y métodos de la clase PersonalDeCabina.
 *
 * @see PersonalDeCabina
 */
public class Azafate extends PersonalDeCabina {

    private String idioma;

    /**
     * Constructor vacío de la clase.
     */
    public Azafate() {
    }

    /**
     * Constructor para la clase Azafate. Posee manejo de flujo de datos en caso
     * de que los datos ingresados no se adhieran a las reglas del negocio de la
     * empresa. No inlcuye el idioma extra (si tiene el atributo idioma,
     * entonces según el enunciado del caso el azafate también habla inglés).
     *
     * @param rut El rut como String.
     * @param nombre El nombre como String.
     * @param apellido El apellido como String.
     * @param nacionalidad La nacionalidad como String.
     * @param edad La edad como int.
     */
    public Azafate(String rut, String nombre, String apellido, String nacionalidad, int edad) {
        super(rut, nombre, apellido, nacionalidad, edad);
        if (edad < 21) {
            mensajeDeErrorPorEdad();
        }
        if (nombre.equals(" ") || nombre.equals("")) {
            mensajeDeErrorPorNombre();
        }
        if (apellido.equals("") || apellido.equals(" ")) {

        }
    }

    /**
     * Constructor para la clase Azafate. Posee manejo de flujo de datos en caso
     * de que los datos ingresados no se adhieran a las reglas del negocio de la
     * empresa. Incluye el idioma extra (se considera que el azafate además sabe
     * inglés, según el enunciado del caso)
     *
     * @param rut El rut como String.
     * @param nombre El nombre como String.
     * @param apellido El apellido como String.
     * @param nacionalidad La nacionalidad como String.
     * @param edad La edad como int.
     * @param idioma El idioma como String.
     */
    public Azafate(String rut, String nombre, String apellido, String nacionalidad, int edad, String idioma) {
        this.idioma = idioma;
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
     * parámetro no se adhiere a las reglas de la empresa
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
     * Mutador para actualizar el nombre . Muestra mensaje de error si el
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
     * Accesador para el idioma.
     *
     * @return El idioma como String.
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Mutador para actualizar el idioma.
     *
     * @param idioma El idioma nuevo.
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * Método toString para mostrar la información del azafate.
     *
     * @return Los datos del azafate como String.
     */
    @Override
    public String toString() {
        return "" + getClass().getSimpleName().toLowerCase() + "{" + "Rut=" + getRut() + "Idioma=" + idioma
                + "Nombre=" + getNombre() + "Apellido" + getApellido() + "Nacionalidad=" + getNacionalidad()
                + "Edad=" + getEdad() + '}';
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
        final Azafate other = (Azafate) obj;
        if (!Objects.equals(this.idioma, other.idioma)) {
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
     * Mensaje de error. Advierte sobre la regla de negocio del nombre (sólo letras, no
     * puede estar vacío) .
     */
    @Override
    public void mensajeDeErrorPorNombre() {
        System.out.println("Error: debe ingresar un nombre para el azafate (debe ser sólo letras)");
    }

    /**
     * Mensaje de error. Advierte sobre la regla de negocio del apellido (no
     * debe estar en blanco y sólo debe tener 2 palabras separadas por un
     * espacio).
     */
    
    @Override
    public void mensajeDeErrorPorApellido() {
        System.out.println("Error:  debe ingresar 2 apellidos separados por un espacio (deben contener sólo letras) para el azafate");
    }

}
