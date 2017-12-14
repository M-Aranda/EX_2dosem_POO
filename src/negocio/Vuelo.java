package negocio;

import datos.Piloto;
import datos.Azafate;
import datos.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import servicio.Servicio;

public class Vuelo {

    private int numeroDeVuelo;
    private String destino;
    private Avion avion;
    private List<Piloto> pilotos;
    private List<Azafate> azafates;
    private List<Cliente> clientes;
    private boolean cargaAnimal;
    private Servicio servicio;

    List<Piloto> pilotosDelVuelo = new ArrayList<>();
    List<Azafate> azafatesDelVuelo = new ArrayList<>();
    List<Cliente> pasajerosDelVuelo = new ArrayList<>();

    Scanner s = new Scanner(System.in);
    private boolean seEncontro = false;

    private int cantidadDePasajeros = 0;

    public Vuelo() {

    }

    public Vuelo(int numeroDeVuelo, String destino, Avion avion, Servicio servicio) {
        this.numeroDeVuelo = numeroDeVuelo;
        this.destino = destino;
        this.avion = avion;
        this.servicio=servicio;
    }

    public Vuelo(int numeroDeVuelo, String destino, Avion avion, List<Piloto> pilotos, List<Azafate> azafates, List<Cliente> clientes, boolean CargaAnimal, Servicio servicio) {
        this.numeroDeVuelo = numeroDeVuelo;
        this.destino = destino;
        this.avion = avion;
        this.pilotos = pilotos;
        this.azafates = azafates;
        this.clientes = clientes;
        this.cargaAnimal = CargaAnimal;
        this.servicio=servicio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    

    public int getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(int numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public List<Azafate> getAzafates() {
        return azafates;
    }

    public void setAzafates(List<Azafate> azafates) {
        this.azafates = azafates;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public boolean isCargaAnimal() {
        return cargaAnimal;
    }

    public void setCargaAnimal(boolean cargaAnimal) {
        this.cargaAnimal = cargaAnimal;
    }

    public List<Piloto> getPilotosDelVuelo() {
        return pilotosDelVuelo;
    }

    public void setPilotosDelVuelo(List<Piloto> pilotosDelVuelo) {
        this.pilotosDelVuelo = pilotosDelVuelo;
    }

    public List<Azafate> getAzafatesDelVuelo() {
        return azafatesDelVuelo;
    }

    public void setAzafatesDelVuelo(List<Azafate> azafatesDelVuelo) {
        this.azafatesDelVuelo = azafatesDelVuelo;
    }

    public List<Cliente> getPasajerosDelVuelo() {
        return pasajerosDelVuelo;
    }

    public void setPasajerosDelVuelo(List<Cliente> pasajerosDelVuelo) {
        this.pasajerosDelVuelo = pasajerosDelVuelo;
    }

    public void mostrarPilotosDelVuelo() {
        for (Piloto piloto : pilotosDelVuelo) {
            System.out.println(piloto);
        }
    }

    public void mostrarAzafatesDelVuelo() {
        for (Azafate azafate : azafatesDelVuelo) {
            System.out.println(azafate);
        }
    }

    public boolean isSeEncontro() {
        return seEncontro;
    }

    public void setSeEncontro(boolean seEncontro) {
        this.seEncontro = seEncontro;
    }

    public int getCantidadActualDePasajeros() {
        return cantidadDePasajeros;
    }

    public void setCantidadActualDePasajeros(int cantidadActualDePasajeros) {
        this.cantidadDePasajeros = cantidadActualDePasajeros;
    }

    public void agregarTripulantesdeCabina() {
        System.out.print("Ingrese rut del tripulante de cabina a agregar: ");
        String rutTC = s.next();

        boolean esPiloto = true;
        boolean tripulanteExiste = false;

        for (Piloto piloto : pilotos) {
            if (piloto.getRut().equalsIgnoreCase(rutTC)) {
                esPiloto = true;
                if (!pilotos.contains(piloto)) {
                    tripulanteExiste = false;
                } else {
                    tripulanteExiste = true;
                }
            }

        }

        if (!tripulanteExiste) {

            for (Azafate azafate : azafates) {
                if (azafate.getRut().equalsIgnoreCase(rutTC)) {
                    esPiloto = false;
                    if (!azafates.contains(azafate)) {
                        tripulanteExiste = false;
                    } else {
                        tripulanteExiste = true;
                    }
                }
            }

        }
        
        if(!tripulanteExiste){
            System.out.println("No existe personal con ese rut en los registros.");
        }

        if (esPiloto) {
            String rPEV = null;
            String nPEV = null;
            String aPEV = null;
            String nacPEV = null;
            int edadPEV = 0;
            int horasDEVPEV = 0;

            for (Piloto p : pilotos) {

                if (p.getRut().equalsIgnoreCase(rutTC) && !pilotosDelVuelo.contains(p)) {//contains verifica si el objeto ya esta en la lista

                    pilotosDelVuelo.add(p);
                    System.out.println("Se agrego al  " + p);

                } else if (p.getRut().equalsIgnoreCase(rutTC) && pilotosDelVuelo.contains(p)) {
                    System.out.println("No puede agregar a alguien que ya esta en el vuelo.");
                }

            }

        } else if (!esPiloto) {
            String rAEV = null;
            String nAEV = null;
            String aAEV = null;
            String nacAEV = null;
            int eAEV = 0;
            String iAEV = null;

            for (Azafate az : azafates) {
                if (az.getRut().equalsIgnoreCase(rutTC) && !azafatesDelVuelo.contains(az)) {
//                    rAEV = az.getRut();
//                    nAEV = az.getNombre();
//                    aAEV = az.getApellido();
//                    nacAEV = az.getNacionalidad();
//                    eAEV = az.getEdad();
//                    
//                    if (az.getIdioma() == null) {
//                        iAEV = "No sabe un tercer idioma. ";
//                    } else if (az.getIdioma() != null) {
//                        iAEV = az.getIdioma();
//                    }
                    azafatesDelVuelo.add(az);
                    System.out.println("Se agrego al " + az);

                } else if (az.getRut().equalsIgnoreCase(rutTC) && azafatesDelVuelo.contains(az)) {
                    System.out.println("No puede agregar a alguien que ya esta en el vuelo");
                }

            }

        }

    }

    public void agregarPasajero() {

        if (cantidadDePasajeros < avion.getCapacidadDePasajeros()) {
            System.out.print("Ingrese el rut de un cliente para embarcarlo en este vuelo: ");
            String rutDePasajero = s.next();
            seEncontro=false;

            for (Cliente cli : clientes) {
                if (cli.getRut().equalsIgnoreCase(rutDePasajero) && !pasajerosDelVuelo.contains(cli)) {
                    pasajerosDelVuelo.add(cli);
                    cantidadDePasajeros++;
                    System.out.println("Se agrego a "+cli);
                    seEncontro=true;

                }else if(cli.getRut().equalsIgnoreCase(rutDePasajero) && !pasajerosDelVuelo.contains(cli)){
                    System.out.println("No puede volver a agregar a un pasajero ya registrado");
                    seEncontro=true;
                }
                

            }
            
            if(!seEncontro){
                System.out.println("No se encontro en los registros.");
            }

        } else if (cantidadDePasajeros >= avion.getCapacidadDePasajeros()) {
            System.out.println("No se puede agregar mas pasajeros porque ya se llego al limite de pasajeros (" + avion.getCapacidadDePasajeros() + ")");
        }

    }

    public void eliminarPasajero() {

        if (cantidadDePasajeros <= avion.getCapacidadDePasajeros() && cantidadDePasajeros > 0) {
            System.out.print("Inrese rut del pasajero a eliminar de este vuelo: ");
            String rutPAEliminar = s.next();

            String rutPElim = null;
            String nomPElim = null;

            for (Cliente pasa : pasajerosDelVuelo) {
                if (pasa.getRut().equalsIgnoreCase(rutPAEliminar)) {

                    rutPElim = pasa.getRut();
                    nomPElim = pasa.getNombre();

                    int indiceAborrar = pasajerosDelVuelo.indexOf(pasa);
                    pasajerosDelVuelo.remove(indiceAborrar);

                }

                if (pasajerosDelVuelo.contains(pasa.getRut()) == false) {
                    seEncontro = false;

                } else if (pasajerosDelVuelo.contains(pasa.getRut()) == true) {
                    seEncontro = true;
                }

            }

            if (seEncontro = false) {
                System.out.println("No se encontro ese pasajero en los registros");
            }

            Cliente pasaAElim = new Cliente(rutPElim, nomPElim);
            System.out.println("Se borro a: " + pasaAElim+ "de los registros");
            cantidadDePasajeros -= 1;

        } else {
            System.out.println("No puede eliminar pasajeros si no hay ninguno");
        }

    }

    public void mostrarListaDePasajeros() {
        for (Cliente pasa : pasajerosDelVuelo) {
            System.out.println(pasa);
        }

    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Vuelo other = (Vuelo) obj;
        if (this.numeroDeVuelo != other.numeroDeVuelo) {
            return false;
        }
        if (this.cargaAnimal != other.cargaAnimal) {
            return false;
        }
        if (this.seEncontro != other.seEncontro) {
            return false;
        }
        if (this.cantidadDePasajeros != other.cantidadDePasajeros) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.avion, other.avion)) {
            return false;
        }
        if (!Objects.equals(this.pilotos, other.pilotos)) {
            return false;
        }
        if (!Objects.equals(this.azafates, other.azafates)) {
            return false;
        }
        if (!Objects.equals(this.clientes, other.clientes)) {
            return false;
        }
        if (!Objects.equals(this.pilotosDelVuelo, other.pilotosDelVuelo)) {
            return false;
        }
        if (!Objects.equals(this.azafatesDelVuelo, other.azafatesDelVuelo)) {
            return false;
        }
        if (!Objects.equals(this.pasajerosDelVuelo, other.pasajerosDelVuelo)) {
            return false;
        }
        if (!Objects.equals(this.s, other.s)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vuelo{" + " numeroDeVuelo= " + numeroDeVuelo + ", destino= " + destino + ", avion= " + avion + ", pilotos= " + pilotos + ", azafates=" + azafates + ", clientes= " + clientes + ", cargaAnimal= " + cargaAnimal + ", pilotosDelVuelo= " + pilotosDelVuelo + ", azafatesDelVuelo= " + azafatesDelVuelo + ", pasajerosDelVuelo= " + pasajerosDelVuelo + ", s= " + s + ", seEncontro= " + seEncontro + ", cantidadDePasajeros= " + cantidadDePasajeros +", servicio= "+servicio+ '}';
    }

}
