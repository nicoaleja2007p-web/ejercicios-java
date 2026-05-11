package Ejercicio2_Arreglo.negocio;

import Ejercicio2_Arreglo.interfaz.AgenteInteligente;

import java.util.Scanner;

public class MainAgenteInteligente {
    public static void main(String[] args) {

        final int MAX = 2;
        AgenteInteligente agentes[] = new AgenteInteligente[MAX];
        Scanner sc = new Scanner(System.in);

        String nombre,estado;
        int energia;

        System.out.println("        Registro de Agentes          ");
        for(int i=0; i< agentes.length; i++){
            System.out.println("                                          ");
            System.out.println("Ingrese el nombre del agente "+(i+1)+":");
            nombre = sc.nextLine();
            System.out.println("Ingrese el nivel de energía del agente  "+(i+1)+": (0-100)");
            energia = Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese el estado del agente "+(i+1)+": (Activo o Inactivo)");
            estado = sc.nextLine();

            agentes [i] = new AgenteInteligente(nombre, energia, estado);
        }

        System.out.println("        Estado de los Agentes          ");
        for(int i=0; i< agentes.length; i++){
            agentes [i].mostrarEstado();
        }
    }
}
