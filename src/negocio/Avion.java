
package negocio;

import java.util.Objects;


public class Avion {
    
    private String marca;
    private String modelo;
    private int capacidadDePasajeros;
    private int numeroDeHelices;
    private float distanciaEntreLosAsientos;
    
    public Avion(){
        
    }

    public Avion(String marca, String modelo, int capacidadDePasajeros, int numeroDeHelices, float distanciaEntreLosAsientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadDePasajeros = capacidadDePasajeros;
        this.numeroDeHelices = numeroDeHelices;
        this.distanciaEntreLosAsientos = distanciaEntreLosAsientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }

    public void setCapacidadDePasajeros(int capacidadDePasajeros) {
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    public int getNumeroDeHelices() {
        return numeroDeHelices;
    }

    public void setNumeroDeHelices(int numeroDeHelices) {
        this.numeroDeHelices = numeroDeHelices;
    }

    public float getDistanciaEntreLosAsientos() {
        return distanciaEntreLosAsientos;
    }

    public void setDistanciaEntreLosAsientos(float distanciaEntreLosAsientos) {
        this.distanciaEntreLosAsientos = distanciaEntreLosAsientos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

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
        final Avion other = (Avion) obj;
        if (this.capacidadDePasajeros != other.capacidadDePasajeros) {
            return false;
        }
        if (this.numeroDeHelices != other.numeroDeHelices) {
            return false;
        }
        if (Float.floatToIntBits(this.distanciaEntreLosAsientos) != Float.floatToIntBits(other.distanciaEntreLosAsientos)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Avion{" + "marca= " + marca + ", modelo= " + modelo + ", capacidadDePasajeros= " + capacidadDePasajeros + ", numeroDeHelices= " + numeroDeHelices + ", distanciaEntreLosAsientos=" + distanciaEntreLosAsientos + '}';
    }
    
    

   
    
    
    
    
    
    
    
    
}
