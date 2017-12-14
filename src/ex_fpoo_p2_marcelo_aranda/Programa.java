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
        List<Pasaje> pasajes = new ArrayList<>();

        boolean terminar = false;

        System.out.println("Bienvenido al sistema de creacion de vuelos");

        while (true) {

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
                    System.out.println("Desarrollado por Marcelo Aranda.");
                    break;

                case 1:
                    Piloto piloto = new Piloto();

                    System.out.print("Ingrese rut del piloto: ");
                    String rutPiloto = s.next();
                    piloto.setRut(rutPiloto);
                    System.out.print("Ingrese nombre del piloto: ");
                    String nombrePiloto = s.next();
                    piloto.setNombre(nombrePiloto);
                    System.out.print("Ingrese apellido del piloto: ");
                    String apellidoPiloto = s.next();
                    piloto.setApellido(apellidoPiloto);
                    System.out.print("Ingrese nacionalidad del piloto:");
                    String nacionalidadPiloto = s.next();
                    piloto.setNacionalidad(nacionalidadPiloto);
                    System.out.print("Ingrese edad del piloto: ");
                    int edadPiloto = Integer.parseInt(s.next());
                    piloto.setEdad(edadPiloto);
                    System.out.print("Ingrese horas de vuelo del piloto: ");
                    int horasDeVueloDelPiloto = Integer.parseInt(s.next());
                    piloto.setHoras_de_vuelo(horasDeVueloDelPiloto);

                    pilotos.add(piloto);
                    System.out.println("Se creo al " + piloto);
                    break;

                case 2:
                    Azafate azafate = new Azafate();
                    System.out.print("Ingrese rut de azafate: ");
                    String rutAzafate = s.next();
                    azafate.setRut(rutAzafate);
                    System.out.print("Ingrese nombre de azafate: ");
                    String nombreAzafate = s.next();
                    azafate.setNombre(nombreAzafate);
                    System.out.print("Ingrese apellido de azafate: ");
                    String apellidoAzafate = s.next();
                    azafate.setApellido(apellidoAzafate);
                    System.out.print("Ingrese nacionalidad del azafate: ");
                    String nacionalidadAzafate = s.next();
                    azafate.setNacionalidad(nacionalidadAzafate);
                    System.out.print("Ingrese edad del azafate: ");
                    int edadAzafate = Integer.parseInt(s.next());
                    azafate.setEdad(edadAzafate);
                    System.out.println("Tiene un tercer idioma?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int tercerIdioma = Integer.parseInt(s.next());
                    if (tercerIdioma == 1) {
                        System.out.print("Idioma: ");
                        String idiomaAzafate = s.next();
                        azafate.setIdioma(idiomaAzafate);

                        azafates.add(azafate);

                    } else if (tercerIdioma == 2) {
                        azafate.setIdioma("No tiene");
                        azafates.add(azafate);

                    }
                    
                    System.out.println("Se creo al "+azafate);
                    break;

                case 3:
                    System.out.print("Ingrese rut del cliente: ");
                    String rutCliente = s.next();
                    System.out.print("Ingrese nombre del cliente: ");
                    String nombreCliente = s.next();
                    Cliente cliente = new Cliente(rutCliente, nombreCliente);
                    clientes.add(cliente);
                    System.out.println("Se creo al "+cliente);
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

                        } else {
                            System.out.println("No hay un cliente con ese rut");
                        }

                    }
                    Cliente clienteQueTieneElPasaje = new Cliente(suRut, suNombre);

                    System.out.print("Ingrese numero de vuelo: ");
                    int numero_de_vuelo = Integer.parseInt(s.next());
                    System.out.print("Ingrese fecha y hora: ");
                    String fecha_y_hora = s.next();
                    int numero_de_asiento = Integer.parseInt(s.next());
                    System.out.print("Ingrese clase: ");
                    String clase = s.next();
                    System.out.print("Ingrese valor del pasaje: ");
                    int valor = Integer.parseInt(s.next());

                    Pasaje pasaje = new Pasaje(clienteQueTieneElPasaje, numero_de_vuelo, fecha_y_hora, numero_de_asiento, clase, valor);
                    pasajes.add(pasaje);
                    System.out.println("Pasaje creado.");
                    break;

                case 5:
                    System.out.print("Ingrese marca del avion: ");
                    String marca = s.next();
                    System.out.print("Ingrese modelo: ");
                    String modelo = s.next();
                    System.out.print("Ingrese capacidad maxima de pasajeros: ");
                    int capacidadDePasajeros = Integer.parseInt(s.next());
                    System.out.print("Ingrese numero de helices: ");
                    int numeroDeHelices = Integer.parseInt(s.next());
                    System.out.print("Ingrese distancia en metros entre los asientos: ");
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

                    Vuelo vuelo = new Vuelo(numeroDeVuelo, destino, avionDelVuelo, pilotos, azafates, clientes, cargaAnimal);

                    while (true) {
                        System.out.println("Opciones de vuelo: ");

                        int alternativa;
                        

                        System.out.println("1. Agregar tripulante de cabina.");
                        System.out.println("2. Agregar pasajero.");
                        System.out.println("3. Eliminar pasajero.");
                        System.out.println("4. Mostrar informacion del avion.");
                        System.out.println("5. Mostrar lista de pasajeros del vuelo.");
                        System.out.println("6. Mostrar lista de pilotos del vuelo.");
                        System.out.println("7. Mostrar lista de azafates del vuelo.");
                        System.out.println("8. Mostrar lista de tripulantes de cabina.");
                        System.out.println("9. Finalizar creacion del vuelo");

                        alternativa = Integer.parseInt(s.next());
                        if (alternativa >= 1 && alternativa <= 9) {
                            if (alternativa == 9 && vuelo.getPilotosDelVuelo().isEmpty()) {
                                System.out.println("El vuelo debe tener al menos un piloto");
                            } else if (alternativa == 9 && !vuelo.getPilotosDelVuelo().isEmpty()) {
                                break;
                            } else if (alternativa == 1) {

                                vuelo.agregarTripulantesdeCabina();
                            } else if (alternativa == 2) {
                                vuelo.agregarPasajero();
                            } else if (alternativa == 3) {
                                vuelo.eliminarPasajero();
                            } else if (alternativa == 4) {
                                System.out.println(vuelo.getAvion());
                            } else if (alternativa == 5) {
                                if (vuelo.getPasajerosDelVuelo().isEmpty()) {
                                    System.out.println("Este vuelo no lleva pasajeros.");
                                }
                                vuelo.mostrarListaDePasajeros();
                            } else if (alternativa == 6) {
                                if (vuelo.getPilotosDelVuelo().isEmpty()) {
                                    System.out.println("Este vuelo no tiene pilotos asignados.");
                                }

                                vuelo.mostrarPilotosDelVuelo();
                            } else if (alternativa == 7) {
                                if (vuelo.getAzafatesDelVuelo().isEmpty()) {
                                    System.out.println("Este vuelo no tiene azafates asignados.");
                                }
                                vuelo.mostrarAzafatesDelVuelo();
                            } else if (alternativa == 8) {
                                if (vuelo.getPilotosDelVuelo().isEmpty()) {
                                    System.out.println("Este vuelo no tiene pilotos asignados.");
                                } else {
                                    vuelo.mostrarPilotosDelVuelo();
                                }
                                if (vuelo.getAzafatesDelVuelo().isEmpty()) {
                                    System.out.println("Este vuelo no tiene azafates asignados.");
                                } else {
                                    vuelo.mostrarAzafatesDelVuelo();
                                }

                            }
                        } else if (alternativa < 1 || alternativa > 9) {
                            System.out.println("Ese numero no es valido");
                        }

                    }

                    System.out.println("Vuelo creado exitosamente");
                    break;

                case 7:
                    System.out.print("Ingrese numero de vuelo: ");
                    int nVCH = Integer.parseInt(s.next());
                    System.out.print("Ingrese destino: ");
                    String dVCH = s.next();
                    System.out.print("Ingrese modelo del avion en el que se va a volar: ");
                    String modeloAVCHComprobar = s.next();

                    String marcaDeEsteAvionVCH = null;
                    String modeloDeEsteAvionVCH = null;
                    int capacidadDePasajerosDeEsteAvionVCH = 0;
                    int numeroDeHelicesDeEsteAvionVCH = 0;
                    float distanciaEntreLosAsientosDeEsteAvionVCH = 0;

                    for (Avion av : aviones) {
                        if (av.getModelo().equalsIgnoreCase(modeloAVCHComprobar)) {
                            marcaDeEsteAvionVCH = av.getMarca();
                            modeloDeEsteAvionVCH = av.getModelo();
                            capacidadDePasajerosDeEsteAvionVCH = av.getCapacidadDePasajeros();
                            numeroDeHelicesDeEsteAvionVCH = av.getNumeroDeHelices();
                            distanciaEntreLosAsientosDeEsteAvionVCH = av.getDistanciaEntreLosAsientos();

                        }

                    }

                    Avion avionDelVueloCH = new Avion(marcaDeEsteAvionVCH, modeloDeEsteAvionVCH, capacidadDePasajerosDeEsteAvionVCH, numeroDeHelicesDeEsteAvionVCH, distanciaEntreLosAsientosDeEsteAvionVCH);
                    System.out.println("Tiene carga animal?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int resVCH = Integer.parseInt(s.next());
                    boolean cargaAnimalVCH = false;
                    if (resVCH == 1) {
                        cargaAnimal = true;
                    } else if (resVCH == 2) {
                        cargaAnimal = false;
                    }

                    Charter vueloCH = new Charter(nVCH, dVCH, avionDelVueloCH, pilotos, azafates, clientes, cargaAnimalVCH);
                    //creado nuevo vuelo charter

                    while (true) {
                        System.out.println("Opciones de vuelo: ");

                        int alternativa2;

                        System.out.println("1. Agregar tripulante de cabina.");
                        System.out.println("2. Agregar pasajero.");
                        System.out.println("3. Eliminar pasajero.");
                        System.out.println("4. Mostrar informacion del avion.");
                        System.out.println("5. Mostrar lista de pasajeros del vuelo.");
                        System.out.println("6. Mostrar lista de pilotos del vuelo.");
                        System.out.println("7. Mostrar lista de azafates del vuelo.");
                        System.out.println("8. Mostrar lista de tripulantes de cabina.");
                        System.out.println("9. Ingresar menu.");
                        System.out.println("10. Finalizar creacion del vuelo");

                        alternativa2 = Integer.parseInt(s.next());
                        if (alternativa2 >= 1 && alternativa2 <= 10) {
                            if (alternativa2 == 10 && vueloCH.getPilotosDelVuelo().isEmpty()) {
                                System.out.println("El vuelo debe tener al menos un piloto");
                            } else if (alternativa2 == 10 && !vueloCH.getPilotosDelVuelo().isEmpty()) {
                                break;
                            } else if (alternativa2 == 1) {

                                vueloCH.agregarTripulantesdeCabina();
                            } else if (alternativa2 == 2) {
                                vueloCH.agregarPasajero();
                            } else if (alternativa2 == 3) {
                                vueloCH.eliminarPasajero();
                            } else if (alternativa2 == 4) {
                                System.out.println(vueloCH.getAvion());
                            } else if (alternativa2 == 5) {
                                if (vueloCH.getPasajerosDelVuelo().isEmpty()) {
                                    System.out.println("Este vuelo no lleva pasajeros.");
                                }
                                vueloCH.mostrarListaDePasajeros();
                            } else if (alternativa2 == 6) {
                                if (vueloCH.getPilotosDelVuelo().isEmpty()) {
                                    System.out.println("Este vuelo no tiene pilotos asignados.");
                                }

                                vueloCH.mostrarPilotosDelVuelo();
                            } else if (alternativa2 == 7) {
                                if (vueloCH.getAzafatesDelVuelo().isEmpty()) {
                                    System.out.println("Este vuelo no tiene azafates asignados.");
                                }
                                vueloCH.mostrarAzafatesDelVuelo();
                            } else if (alternativa2 == 8) {
                                if (vueloCH.getPilotosDelVuelo().isEmpty()) {
                                    System.out.println("Este vuelo no tiene pilotos asignados.");
                                } else {
                                    vueloCH.mostrarPilotosDelVuelo();
                                }
                                if (vueloCH.getAzafatesDelVuelo().isEmpty()) {
                                    System.out.println("Este vuelo no tiene azafates asignados.");
                                } else {
                                    vueloCH.mostrarAzafatesDelVuelo();
                                }

                            }else if(alternativa2==9){
                                System.out.print("Ingrese menu para comer, de los pasajeros: ");
                                String menuPASajeros=s.next();
                                vueloCH.setMenu(menuPASajeros);
                            }
                        } else if (alternativa2 < 1 || alternativa2 > 10) {
                            System.out.println("Ese numero no es valido");
                        }

                    }

                    break;

                default:
                    System.out.println("El parametro ingresado no tiene efecto alguno.");

            }

            if (terminar) {
                break;
            }
        }

    }

}
