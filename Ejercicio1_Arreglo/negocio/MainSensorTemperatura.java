package Ejercicio1_Arreglo.negocio;

import Ejercicio1_Arreglo.interfaz.SensorTemperatura;

import java.util.Scanner;

public class MainSensorTemperatura {
    public static void main(String[] args) {

        final int MAX = 2;
        SensorTemperatura sensores[]= new SensorTemperatura[MAX];
        Scanner sc = new Scanner(System.in);

        String id, unidad;
        double valor;
        int opc;

        System.out.println("     Registro de sensores de Temperatura     ");

        for(int i = 0; i < sensores.length; i++){
            System.out.println("\nSensor #"+ (i+1));

            System.out.println("Ingresa el ID del sensor(Solo números positivos):  ");
            id = sc.nextLine();

            System.out.println("Ingresa el valor del sensor: ");
            valor = Double.parseDouble(sc.nextLine());

            System.out.println("Ingresa unidad del sensor(Solo numeros positivos): ");
            unidad = sc.nextLine();

            sensores[i] = new SensorTemperatura(id, valor, unidad);
        }

        do{
            System.out.println("         Menu         ");
            System.out.println("1. Mostrar lectura de todos los censores");
            System.out.println("2. Actualizar el valos de todos los sensores");
            System.out.println("3. Cambiar el valor de todos los sensores");
            System.out.println("4. Salir");
            System.out.println("Escoja una opción: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc){
                case 1:{
                    System.out.println("    Lecturas    ");
                    System.out.println("                ");
                    for(int i = 0; i < sensores.length; i++){
                        sensores[i].mostrarLectura();
                    }
                }break;

                case 2:{
                    System.out.println("    Actualizar Valores   ");
                    for(int i = 0; i < sensores.length; i++){
                        System.out.println("Nuevo valor para sensor: "+sensores[i].getIdSensor());
                        valor = Double.parseDouble(sc.nextLine());
                        sensores[i].setValorActual(valor);
                    }
                    System.out.println("Valores Actualizados.");
                }break;

                case 3:{
                    System.out.println("    Cambiar Unidades   ");
                    System.out.println("Ingrese la nueva unidad para todos los sensores: ");
                    unidad = sc.nextLine();

                    for(int i = 0; i < sensores.length; i++){
                        sensores[i].setUnidad(unidad);
                    }
                    System.out.println("Unidades actualizadas para todos los sensores.");
                }break;

                case 4:{
                    System.out.println("Gracias por usar el sistema.");
                }break;

                default:
                    System.out.println("Opción no disponible");
            }

        }while (opc != 4);
    }
}
