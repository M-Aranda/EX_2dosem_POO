package ex_fpoo_p2_marcelo_aranda;

import datos.*;
import java.util.ArrayList;
import java.util.List;
import negocio.*;
import java.util.Scanner;

public class Programa {

    public Programa() {
    }

    public void ejecutar() {

        Scanner s = new Scanner(System.in);

        List<Piloto> pilotos = new ArrayList<>();
        List<Azafate> azafates = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Avion> aviones = new ArrayList<>();
        List<Pasaje>pasajes=new ArrayList<>();

        boolean terminar = false;

        while (true) {

            System.out.println("Bienvenido al sistema de creacion de vuelos");
            System.out.println("Seleccione opcion: ");

            System.out.println("1. Crear piloto");
            System.out.println("2. Crear azafate");
            System.out.println("3. Crear cliente");
            System.out.println("4. Crear pasaje");
            System.out.println("5. Crear avion");
            System.out.println("6. Crear vuelo");
            System.out.println("7. Crear vuelo Charter");
            System.out.println("8. Salir");
            int opc = 0;

            try {
                opc = Integer.parseInt(s.next());
            } catch (Exception e) {
                System.out.println("Eso no es valido.");
            }

            switch (opc) {

                case 8:
                    terminar = true;
                    System.out.println("Programa terminado.");
                    System.out.println("Desarrollado por Marcelo Aranda");
                    break;

                case 1:
                    System.out.print("Ingrese rut del piloto: ");
                    String rutPiloto = s.next();
                    System.out.print("Ingrese nombre del piloto: ");
                    String nombrePiloto = s.next();
                    System.out.print("Ingrese apellido del piloto: ");
                    String apellidoPiloto = s.next();
                    System.out.print("Ingrese naconalidad del piloto:");
                    String nacionalidadPiloto = s.next();
                    System.out.print("Ingrese edad del piloto: ");
                    int edadPiloto = Integer.parseInt(s.next());
                    System.out.print("Ingrese horas de vuelo del piloto: ");
                    int horasDeVueloDelPiloto = Integer.parseInt(s.next());
                    Piloto piloto = new Piloto(rutPiloto, nombrePiloto, apellidoPiloto, nacionalidadPiloto, edadPiloto, horasDeVueloDelPiloto);
                    pilotos.add(piloto);
                    break;

                case 2:
                    System.out.print("Ingrese rut de azafate: ");
                    String rutAzafate = s.next();
                    System.out.print("Ingrese nombre de azafate: ");
                    String nombreAzafate = s.next();
                    System.out.print("Ingrese apellido de azafate: ");
                    String apellidoAzafate = s.next();
                    System.out.print("Ingrese nacionalidad del azafate: ");
                    String nacionalidadAzafate = s.next();
                    System.out.print("Ingrese edad del azafate: ");
                    int edadAzafate = Integer.parseInt(s.next());
                    System.out.println("Tiene un tercer idioma?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int tercerIdioma = Integer.parseInt(s.next());
                    if (tercerIdioma == 1) {
                        System.out.print("Idioma: ");
                        String idiomaAzafate = s.next();
                        Azafate azafate = new Azafate(rutAzafate, nombreAzafate, apellidoAzafate, nacionalidadAzafate, edadAzafate, idiomaAzafate);
                        azafates.add(azafate);

                    } else if (tercerIdioma == 2) {
                        Azafate azafate = new Azafate(rutAzafate, nombreAzafate, apellidoAzafate, nacionalidadAzafate, edadAzafate);
                        azafates.add(azafate);

                    }
                    break;

                case 3:
                    System.out.print("Ingrese rut del cliente: ");
                    String rutCliente = s.next();
                    System.out.print("Ingrese nombre del cliente: ");
                    String nombreCliente = s.next();
                    Cliente cliente = new Cliente(rutCliente, nombreCliente);
                    clientes.add(cliente);
                    break;

                case 4:
                    System.out.print("Ingrese cliente rut del cliente que va a tener el pasaje: ");
                    String rutCliente_pasaje = s.next();

                    String suRut = null;
                    String suNombre = null;
                    for (Cliente c : clientes) {
                        if (c.getRut().equalsIgnoreCase(rutCliente_pasaje)) {
                            suRut = c.getRut();
                            suNombre = c.getNombre();

                        }else{
                            System.out.println("No hay un cliente con ese rut");
                        }

                    }
                    Cliente clienteQueTieneElPasaje = new Cliente(suRut, suNombre);

                    System.out.print("Ingrese numero de vuelo");
                    int numero_de_vuelo = Integer.parseInt(s.next());
                    System.out.print("Ingrese fecha y hora");
                    String fecha_y_hora = s.next();
                    int numero_de_asiento = Integer.parseInt(s.next());
                    System.out.print("Ingrese clase");
                    String clase = s.next();
                    System.out.print("Ingrese valor del pasaje");
                    int valor = Integer.parseInt(s.next());

                    Pasaje pasaje = new Pasaje(clienteQueTieneElPasaje, numero_de_vuelo, fecha_y_hora, numero_de_asiento, clase, valor);
                    pasajes.add(pasaje);
                    break;

                case 5:
                    System.out.print("Ingrese marca del avion: ");
                    String marca = s.next();
                    System.out.print("Ingrese modelo: ");
                    String modelo = s.next();
                    System.out.print("Ingrese capacidad maxima de pasajeros: ");
                    int capacidadDePasajeros = Integer.parseInt(s.next());
                    System.out.println("Ingrese numero de helices: ");
                    int numeroDeHelices = Integer.parseInt(s.next());
                    float distaciaEntreLosAsientos = Float.parseFloat(s.next());
                    Avion avion = new Avion(marca, modelo, capacidadDePasajeros, numeroDeHelices, distaciaEntreLosAsientos);
                    aviones.add(avion);
                    break;

                case 6:
                    System.out.print("Ingrese numero de vuelo: ");
                    int numeroDeVuelo = Integer.parseInt(s.next());
                    System.out.print("Ingrese destino: ");
                    String destino = s.next();
                    System.out.print("Ingrese modelo del avion en el que se va a volar: ");
                    String modeloAComprobar = s.next();

                    String marcaDeEsteAvion = null;
                    String modeloDeEsteAvion = null;
                    int capacidadDePasajerosDeEsteAvion = 0;
                    int numeroDeHelicesDeEsteAvion = 0;
                    float distanciaEntreLosAsientosDeEsteAvion = 0;

                    for (Avion av : aviones) {
                        if (av.getModelo().equalsIgnoreCase(modeloAComprobar)) {
                            marcaDeEsteAvion = av.getMarca();
                            modeloDeEsteAvion = av.getModelo();
                            capacidadDePasajerosDeEsteAvion = av.getCapacidadDePasajeros();
                            numeroDeHelicesDeEsteAvion = av.getNumeroDeHelices();
                            distanciaEntreLosAsientosDeEsteAvion = av.getDistanciaEntreLosAsientos();

                        } 

                    }

                    Avion avionDelVuelo = new Avion(marcaDeEsteAvion, modeloDeEsteAvion, capacidadDePasajerosDeEsteAvion, numeroDeHelicesDeEsteAvion, distanciaEntreLosAsientosDeEsteAvion);
                    System.out.println("Tiene carga animal?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int res = Integer.parseInt(s.next());
                    boolean cargaAnimal = false;
                    if (res == 1) {
                        cargaAnimal = true;
                    } else if (res == 2) {
                        cargaAnimal = false;
                    }
//
//                    List<Piloto> pilotosDelVuelo = new ArrayList<>();
//                    List<Azafate> azafatesDelVuelo = new ArrayList<>();
//                    List<Cliente> clientesDelVuelo = new ArrayList<>();

                    Vuelo vuelo = new Vuelo(numeroDeVuelo, destino, avionDelVuelo, pilotos, azafates, clientes, cargaAnimal);
                    
                    break;
                case 7:
                    System.out.println("Es que todavia no hago eso");
                default:
                    System.out.println("El parametro ingresado no tiene efecto alguno.");

            }

            if (terminar) {
                break;
            }
        }

    }

}
