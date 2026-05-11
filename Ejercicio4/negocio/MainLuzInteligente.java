package Ejercicio4.negocio;

import Ejercicio4.interfaz.LuzInteligente;

import java.util.Scanner;

public class MainLuzInteligente {
    public static void main(String[] args) {

        final int MAX = 3;
        LuzInteligente luces[] = new LuzInteligente[MAX];
        Scanner sc = new Scanner(System.in);

        String idLuz;
        int opc, pos;
        int indice = 0;

        do {
            System.out.println("\n        Menu        ");
            System.out.println("1. Agregar luz");
            System.out.println("2. Mostrar estado de una luz");
            System.out.println("3. Encender una luz");
            System.out.println("4. Apagar una luz");
            System.out.println("5. Ajustar brillo de una luz");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {

                case 1:
                    if (indice < MAX) {
                        System.out.print("ID de la luz: ");
                        idLuz = sc.nextLine();
                        luces[indice] = new LuzInteligente(idLuz);
                        indice++;
                        System.out.println("Luz agregada correctamente.");
                    } else {
                        System.out.println("No hay mas espacio disponible.");
                    }
                    break;

                case 2:
                    if (indice == 0) {
                        System.out.println("No hay luces registradas.");
                        break;
                    }
                    System.out.print("Indice de la luz (0 al " + (indice - 1) + "): ");
                    pos = Integer.parseInt(sc.nextLine());
                    if (pos >= 0 && pos < indice) {
                        luces[pos].mostrarEstado();
                    } else {
                        System.out.println("Indice inválido.");
                    }
                    break;

                case 3:
                    if (indice == 0) {
                        System.out.println("No hay luces registradas.");
                        break;
                    }
                    System.out.print("Indice de la luz (0 al " + (indice - 1) + "): ");
                    pos = Integer.parseInt(sc.nextLine());
                    if (pos >= 0 && pos < indice) {
                        luces[pos].encender();
                    } else {
                        System.out.println("Indice inválido.");
                    }
                    break;

                case 4:
                    if (indice == 0) {
                        System.out.println("No hay luces registradas.");
                        break;
                    }
                    System.out.print("Indice de la luz (0 al " + (indice - 1) + "): ");
                    pos = Integer.parseInt(sc.nextLine());
                    if (pos >= 0 && pos < indice) {
                        luces[pos].apagar();
                    } else {
                        System.out.println("Indice inválido.");
                    }
                    break;

                case 5:
                    if (indice == 0) {
                        System.out.println("No hay luces registradas.");
                        break;
                    }
                    System.out.print("Indice de la luz (0 al " + (indice - 1) + "): ");
                    pos = Integer.parseInt(sc.nextLine());
                    if (pos >= 0 && pos < indice) {
                        System.out.print("Nuevo nivel de brillo (0-100): ");
                        int brillo = Integer.parseInt(sc.nextLine());
                        luces[pos].ajustarBrillo(brillo);
                    } else {
                        System.out.println("Indice inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opcion inválida.");
            }

        } while (opc != 0);
    }
}