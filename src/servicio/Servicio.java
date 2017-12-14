package servicio;

public class Servicio {

    private boolean tieneAudifonos;
    private boolean tieneJuegos;

    public Servicio() {

    }

    public Servicio(boolean tieneAudifonos, boolean tieneJuegos) {
        this.tieneAudifonos = tieneAudifonos;
        this.tieneJuegos = tieneJuegos;
    }

    public boolean isTieneAudifonos() {
        return tieneAudifonos;
    }

    public void setTieneAudifonos(boolean tieneAudifonos) {
        this.tieneAudifonos = tieneAudifonos;
    }

    public boolean isTieneJuegos() {
        return tieneJuegos;
    }

    public void setTieneJuegos(boolean tieneJuegos) {
        this.tieneJuegos = tieneJuegos;
    }

    @Override
    public String toString() {
        return "Servicio{" + " tieneAudifonos= " + tieneAudifonos + ", tieneJuegos= " + tieneJuegos + '}';
    }
    


}
