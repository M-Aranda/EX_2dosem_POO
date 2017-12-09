package negocio;

import datos.Piloto;
import datos.Azafate;
import datos.Cliente;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Vuelo {

    private int numeroDeVuelo;
    private String destino;
    private Avion avion;
    private List<Piloto> pilotos;
    private List<Azafate> azafates;
    private List<Cliente> clientes;
    private boolean cargaAnimal;

    private List<Piloto> pilotosDelVuelo;
    private List<Azafate> azafatesDelVuelo;
    private List<Cliente> pasajerosDelVuelo;
    private Scanner s;

    private boolean seEncontro = false;
    private int limiteDePasajeros = avion.getCapacidadDePasajeros();
    private int cantidadActualDePasajeros = 0;

    public Vuelo() {

    }

    public Vuelo(int numeroDeVuelo, String destino, Avion avion) {
        this.numeroDeVuelo = numeroDeVuelo;
        this.destino = destino;
        this.avion = avion;
    }

    public Vuelo(int numeroDeVuelo, String destino, Avion avion, List<Piloto> pilotos, List<Azafate> azafates, List<Cliente> clientes, boolean CargaAnimal) {
        this.numeroDeVuelo = numeroDeVuelo;
        this.destino = destino;
        this.avion = avion;
        this.pilotos = pilotos;
        this.azafates = azafates;
        this.clientes = clientes;
        this.cargaAnimal = CargaAnimal;
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

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }

    public boolean isSeEncontro() {
        return seEncontro;
    }

    public void setSeEncontro(boolean seEncontro) {
        this.seEncontro = seEncontro;
    }

    public int getLimiteDePasajeros() {
        return limiteDePasajeros;
    }

    public void setLimiteDePasajeros(int limiteDePasajeros) {
        this.limiteDePasajeros = limiteDePasajeros;
    }

    public int getCantidadActualDePasajeros() {
        return cantidadActualDePasajeros;
    }

    public void setCantidadActualDePasajeros(int cantidadActualDePasajeros) {
        this.cantidadActualDePasajeros = cantidadActualDePasajeros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        if (this.limiteDePasajeros != other.limiteDePasajeros) {
            return false;
        }
        if (this.cantidadActualDePasajeros != other.cantidadActualDePasajeros) {
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
    
    

    public void agregarTripulantesdeCabina() {
        System.out.print("Ingrese rut del tripulante de cabina a agregar: ");
        String rutTC = s.next();

        boolean esPiloto = true;

        if (pilotos.contains(rutTC)) {
            esPiloto = true;
        } else if (azafates.contains(rutTC)) {
            esPiloto = false;
        } else if (!pilotos.contains(rutTC) && !azafates.contains(rutTC)) {
            System.out.println("No existe personal alguno con ese rut. ");
        }

        if (esPiloto) {
            String rPEV = null;
            String nPEV = null;
            String aPEV = null;
            String nacPEV = null;
            int edadPEV = 0;
            int horasDEVPEV = 0;

            for (Piloto p : pilotos) {
                if (p.getRut().equalsIgnoreCase(rutTC) && !pilotosDelVuelo.contains(p)) {
                    rPEV = p.getRut();
                    nPEV = p.getNombre();
                    aPEV = p.getApellido();
                    nacPEV = p.getNacionalidad();
                    edadPEV = p.getEdad();
                    horasDEVPEV = p.getHoras_de_vuelo();

                } else if (p.getRut().equalsIgnoreCase(rutTC) && pilotosDelVuelo.contains(p)) {
                    System.out.println("No puede agregar a alguien que ya esta en el vuelo");
                }

            }

            Piloto pilDEesteVuelo = new Piloto(rutTC, nacPEV, aPEV, nacPEV, edadPEV, horasDEVPEV);
            pilotosDelVuelo.add(pilDEesteVuelo);
            System.out.print("Se agrego exitosamente al piloto: " + pilDEesteVuelo);

        }else if(!esPiloto){
            String rAEV=null;
            String nAEV=null;
            String aAEV=null;
            String nacAEV=null;
            int eAEV=0;
            String iAEV=null;
            
            for (Azafate az : azafates) {
                if(az.getRut().equalsIgnoreCase(rutTC)&& !azafatesDelVuelo.contains(az)){
                    rAEV=az.getRut();
                    nAEV=az.getNombre();
                    aAEV=az.getApellido();
                    nacAEV=az.getNacionalidad();
                    eAEV=az.getEdad();
                    if(az.getIdioma()==null){
                        iAEV="No sabe un tercer idioma. ";
                    }else if(az.getIdioma()!=null){
                        iAEV=az.getIdioma();
                    }
                }else if(az.getRut().equalsIgnoreCase(rutTC)&& azafatesDelVuelo.contains(az)){
                    System.out.println("No puede agregar a alguien que ya esta en el vuelo");
                }
                
            }
            
            Azafate azafateDeEstevuelo= new Azafate(rutTC, nacAEV, destino, nacAEV, eAEV, iAEV);
            azafatesDelVuelo.add(azafateDeEstevuelo);
            System.out.println("Se agrego exitosamente al azafate "+azafateDeEstevuelo);
        }

    }

    public void agregarPasajero() {

        if (cantidadActualDePasajeros < limiteDePasajeros) {
            System.out.print("Ingrese el rut de un cliente para embarcarlo en este vuelo");
            String rutDePasajero = s.next();
            String rutPasajero = null;
            String nombrePasajero = null;

            for (Cliente cli : clientes) {
                if (cli.getRut().equalsIgnoreCase(rutDePasajero) && !pasajerosDelVuelo.contains(cli)) {
                    rutPasajero = cli.getRut();
                    nombrePasajero = cli.getNombre();

                }
                if (pasajerosDelVuelo.contains(cli.getRut()) == false) {
                    seEncontro = false;

                } else if (pasajerosDelVuelo.contains(cli.getRut()) == true) {
                    seEncontro = true;
                }

            }

            if (seEncontro = false) {
                System.out.println("No se encontro ese pasajero en los registros");
            }

            if (seEncontro) {
                Cliente pasajeroDeEsteVuelo = new Cliente(rutPasajero, nombrePasajero);
                System.out.println("Se agrego exitosamente al siguiente pasajero: " + pasajeroDeEsteVuelo);
                pasajerosDelVuelo.add(pasajeroDeEsteVuelo);
                cantidadActualDePasajeros++;

            }

        } else if (cantidadActualDePasajeros >= limiteDePasajeros) {
            System.out.println("No se puede agregar mas pasajeros porque ya se llego al limite de pasajeros (" + limiteDePasajeros + ")");
        }

    }

    public void eliminarPasajero() {

        if (cantidadActualDePasajeros <= limiteDePasajeros && cantidadActualDePasajeros > 0) {
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
            System.out.println("Se borro el siguiente pasajero: " + pasaAElim);
            cantidadActualDePasajeros -= 1;

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
    public String toString() {
        return "Vuelo{" + "numeroDeVuelo=" + numeroDeVuelo + ", destino=" + destino + ", avion=" + avion + ", pilotos=" + pilotos + ", azafates=" + azafates + ", clientes=" + clientes + ", cargaAnimal=" + cargaAnimal + ", pilotosDelVuelo=" + pilotosDelVuelo + ", azafatesDelVuelo=" + azafatesDelVuelo + ", pasajerosDelVuelo=" + pasajerosDelVuelo + ", s=" + s + ", seEncontro=" + seEncontro + ", limiteDePasajeros=" + limiteDePasajeros + ", cantidadActualDePasajeros=" + cantidadActualDePasajeros + '}';
    }


    
    
    

}
