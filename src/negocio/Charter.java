
package negocio;

import datos.Azafate;
import datos.Cliente;
import datos.Piloto;
import java.util.List;
import servicio.Servicio;




public class Charter extends Vuelo {
    
    private String menu;

    public Charter() {
    }

    public Charter(int numeroDeVuelo, String destino, Avion avion, Servicio servicio) {
        super(numeroDeVuelo, destino, avion, servicio);
    }

    public Charter(int numeroDeVuelo, String destino, Avion avion, List<Piloto> pilotos, List<Azafate> azafates, List<Cliente> clientes, boolean CargaAnimal, Servicio servicio) {
        super(numeroDeVuelo, destino, avion, pilotos, azafates, clientes, CargaAnimal, servicio);
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public void setServicio(Servicio servicio) {
        super.setServicio(servicio); 
    }

    @Override
    public Servicio getServicio() {
        return super.getServicio(); 
    }
    
    
//    public String menuContoString(){
//        return super.toString()+" menu: "+menu;
//    }

    @Override
    public String toString() {
        return super.toString()+" menu: "+menu; 
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }

    @Override
    public int hashCode() {
        return super.hashCode(); 
    }

    @Override
    public void mostrarListaDePasajeros() {
        super.mostrarListaDePasajeros(); 
    }

    @Override
    public void eliminarPasajero() {
        super.eliminarPasajero(); 
    }

    @Override
    public void agregarPasajero() {
        super.agregarPasajero(); 
    }

    @Override
    public void agregarTripulantesdeCabina() {
        super.agregarTripulantesdeCabina(); 
    }

    @Override
    public void setCantidadActualDePasajeros(int cantidadActualDePasajeros) {
        super.setCantidadActualDePasajeros(cantidadActualDePasajeros); 
    }

    @Override
    public int getCantidadActualDePasajeros() {
        return super.getCantidadActualDePasajeros();
    }

    @Override
    public void setSeEncontro(boolean seEncontro) {
        super.setSeEncontro(seEncontro); 
    }

    @Override
    public boolean isSeEncontro() {
        return super.isSeEncontro(); 
    }

    @Override
    public void mostrarAzafatesDelVuelo() {
        super.mostrarAzafatesDelVuelo(); 
    }

    @Override
    public void mostrarPilotosDelVuelo() {
        super.mostrarPilotosDelVuelo(); 
    }

    @Override
    public void setPasajerosDelVuelo(List<Cliente> pasajerosDelVuelo) {
        super.setPasajerosDelVuelo(pasajerosDelVuelo); 
    }

    @Override
    public List<Cliente> getPasajerosDelVuelo() {
        return super.getPasajerosDelVuelo();
    }

    @Override
    public void setAzafatesDelVuelo(List<Azafate> azafatesDelVuelo) {
        super.setAzafatesDelVuelo(azafatesDelVuelo); 
    }

    @Override
    public List<Azafate> getAzafatesDelVuelo() {
        return super.getAzafatesDelVuelo(); 
    }

    @Override
    public void setPilotosDelVuelo(List<Piloto> pilotosDelVuelo) {
        super.setPilotosDelVuelo(pilotosDelVuelo); 
    }

    @Override
    public List<Piloto> getPilotosDelVuelo() {
        return super.getPilotosDelVuelo(); 
    }

    @Override
    public void setCargaAnimal(boolean cargaAnimal) {
        super.setCargaAnimal(cargaAnimal); 
    }

    @Override
    public boolean isCargaAnimal() {
        return super.isCargaAnimal();
    }

    @Override
    public void setClientes(List<Cliente> clientes) {
        super.setClientes(clientes); 
    }

    @Override
    public List<Cliente> getClientes() {
        return super.getClientes();
    }

    @Override
    public void setAzafates(List<Azafate> azafates) {
        super.setAzafates(azafates); 
    }

    @Override
    public List<Azafate> getAzafates() {
        return super.getAzafates(); 
    }

    @Override
    public void setPilotos(List<Piloto> pilotos) {
        super.setPilotos(pilotos); 
    }

    @Override
    public List<Piloto> getPilotos() {
        return super.getPilotos(); 
    }

    @Override
    public void setAvion(Avion avion) {
        super.setAvion(avion); 
    }

    @Override
    public Avion getAvion() {
        return super.getAvion(); 
    }

    @Override
    public void setDestino(String destino) {
        super.setDestino(destino); 
    }

    @Override
    public String getDestino() {
        return super.getDestino();
    }

    @Override
    public void setNumeroDeVuelo(int numeroDeVuelo) {
        super.setNumeroDeVuelo(numeroDeVuelo);
    }

    @Override
    public int getNumeroDeVuelo() {
        return super.getNumeroDeVuelo(); 
    }


    
    
    
}
