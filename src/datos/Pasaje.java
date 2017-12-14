package datos;

import java.util.Objects;

/**
 * Clase pasaje. Permite la creación de un objeto tipo pasaje.
 *
 */
public class Pasaje {

    private Cliente cliente;
    private int numero_de_vuelo;
    private String fecha_y_hora;
    private int numero_de_asiento;
    private String clase;
    private int valor;

    /**
     * Constructor vacío para crear un objeto del tipo Pasaje, sin datos.
     */
    public Pasaje() {
    }

    /**
     * Constructor para crear un objeto del tipo pasaje, con datos.
     *
     * @param cliente El cliente (sus datos) como Cliente (objeto).
     * @param numero_de_vuelo El número_de_vuelo como int.
     * @param fecha_y_hora La fecha_y_hora del vuelo como String.
     * @param numero_de_asiento El numero_de_asiento del cliente como int.
     * @param clase La clase en la que viaja el cliente (económica o ejecutiva)como String.
     * @param valor El costo del pasaje como int.
     */
    public Pasaje(Cliente cliente, int numero_de_vuelo, String fecha_y_hora, int numero_de_asiento, String clase, int valor) {
        this.cliente = cliente;
        this.numero_de_vuelo = numero_de_vuelo;
        this.fecha_y_hora = fecha_y_hora;
        this.numero_de_asiento = numero_de_asiento;
        this.clase = clase;
        this.valor = valor;
    }

    /**
     * Constructor para crear un objeto del tipo pasaje, con datos (en orden
     * inverso al anterior).
     *
     * @param valor El costo del pasaje como int.
     * @param clase La clase en la que viaja el cliente (económica o ejecutiva)
     * como String.
     * @param numero_de_asiento El numero_de_asiento del cliente como int.
     * @param fecha_y_hora La fecha_y_hora vuelo como String.
     * @param numero_de_vuelo El numero_de_vuelo como int.
     * @param cliente El cliente (sus datos) como Cliente (objeto).
     */
    public Pasaje(int valor, String clase, int numero_de_asiento, String fecha_y_hora, int numero_de_vuelo, Cliente cliente) {

        this.valor = valor;
        this.clase = clase;
        this.numero_de_asiento = numero_de_asiento;
        this.fecha_y_hora = fecha_y_hora;
        this.numero_de_vuelo = numero_de_vuelo;
        this.cliente = cliente;

    }

    /**
     * Accesador para el cliente del pasaje.
     *
     * @return El cliente (sus datos) como Cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Mutador para actualizar el cliente del pasaje.
     *
     * @param cliente El cliente nuevo.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Accesador para el numero_de_vuelo del pasaje.
     *
     * @return El numero_de_vuelo como int.
     */
    public int getNumero_de_vuelo() {
        return numero_de_vuelo;
    }

    /**
     * Mutador para actualizar el numero_de_vuelo del pasaje.
     *
     * @param numero_de_vuelo El numero_de_vuelo nuevo.
     */
    public void setNumero_de_vuelo(int numero_de_vuelo) {
        this.numero_de_vuelo = numero_de_vuelo;
    }

    /**
     * Accesador para la fecha_y_hora del pasaje.
     *
     * @return La fecha_y_hora como String.
     */
    public String getFecha_y_hora() {
        return fecha_y_hora;
    }

    /**
     * Mutador para actualizar la fecha_y_hora del pasaje.
     *
     * @param fecha_y_hora La fecha_y_hora nueva.
     */
    public void setFecha_y_hora(String fecha_y_hora) {
        this.fecha_y_hora = fecha_y_hora;
    }

    /**
     * Accesador para el numero_de_asiento del pasaje.
     *
     * @return el numero_de_asiento como int.
     */
    public int getNumero_de_asiento() {
        return numero_de_asiento;
    }

    /**
     * Mutador para actualizar el numero_de_asiento del pasaje.
     *
     * @param numero_de_asiento El numero_de_asiento nuevo.
     */
    public void setNumero_de_asiento(int numero_de_asiento) {
        this.numero_de_asiento = numero_de_asiento;
    }

    /**
     * Accesador para la clase del pasaje.
     *
     * @return La clase como String.
     */
    public String getClase() {
        return clase;
    }

    /**
     * Mutador para actualizar la clase del pasaje.
     *
     * @param clase La clase como String.
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * Accesador para el valor del pasaje (cuanto costó ).
     *
     * @return El valor como int.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Mutador para actualizar el valor del pasaje.
     *
     * @param valor El valor como int.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Método toString para mostrar la información del pasaje.
     *
     * @return Los datos del pasaje como String.
     */
    @Override
    public String toString() {
        return "Pasaje{" + " cliente= " + cliente + ", numero_de_vuelo= " + numero_de_vuelo + ", fecha_y_hora= " + fecha_y_hora + ", numero_de_asiento= " + numero_de_asiento + ", clase= " + clase + ", valor= " + valor + '}';
    }

    /**
     * Método hash para ver el codigo hash.
     *
     * @return el código hash como int.
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
        final Pasaje other = (Pasaje) obj;
        if (this.numero_de_vuelo != other.numero_de_vuelo) {
            return false;
        }
        if (this.numero_de_asiento != other.numero_de_asiento) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        if (!Objects.equals(this.fecha_y_hora, other.fecha_y_hora)) {
            return false;
        }
        if (!Objects.equals(this.clase, other.clase)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return true;
    }


}
