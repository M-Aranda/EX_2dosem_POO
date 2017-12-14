package ex_fpoo_p3_marcelo_aranda;

import negocio.Avion;
import negocio.Vuelo;
import negocio.Charter;
import servicio.Servicio;

public class EX_FPOO_p3_marcelo_aranda {

    public static void main(String[] args) {//metodo main

        System.out.println("Ejemplo de servicio: ");
        boolean pTA = true;
        boolean pTJ = true;
        Servicio s = new Servicio(pTA, pTJ);
        System.out.println(s);
        System.out.println("                              ");

        System.out.println("Ejemplo de vuelo: ");
        String marca="Sky";
        String modelo="Dreamer";
        int capacidad=30;
        int numDeHeli=12;
        float distEnAs=(float) 0.45;
        Avion av = new Avion(marca, modelo, capacidad, numDeHeli, distEnAs);
        
        
        
        int numVuel=5;
        String destino="Rusia";
        //avion ya se hizo
        //servicio ya se 
                
                
        
        Vuelo v=new Vuelo(numVuel, destino, av, s);
        System.out.println(v);
        System.out.println("                                     ");
        
        
        System.out.println("Ejemplo de charter: ");
        
        int numVCHA=6;
        String destinoVCH="California";
        
        Charter cha=new Charter(numVCHA, destinoVCH, av, s);
        cha.setMenu("A lo fino");
        System.out.println(cha);
        
        
        System.out.println("--------------------");
        
        
        //Las proximas 2 lineas de codigo sirven para lo que seria la creacion de 
        // los objetos, con lectura de datos (aun sin validar del todo)
        Programa pro = new Programa();
        pro.ejecutar();
        
        


    }

}
