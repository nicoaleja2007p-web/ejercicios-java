package Ejercicio3.negocio;

import Ejercicio3.interfaz.claseUsuario;

import java.util.Scanner;

public class MainclaseUsuario {
    public static void main(String[] args) {

        final int MAX = 2;
        claseUsuario usuarios[] = new claseUsuario[MAX];
        Scanner sc = new Scanner(System.in);

        String nombre, correo, contrasena;

        System.out.println("     Registro de Usuarios    ");
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("\n Usuario " + (i + 1) + ":");
            System.out.print("Nombre de usuario: ");
            nombre = sc.nextLine();
            System.out.print("Correo: ");
            correo = sc.nextLine();
            System.out.print("Contraseñ a: ");
            contrasena = sc.nextLine();
            usuarios[i] = new claseUsuario();
            usuarios[i].setNombreUsuario(nombre);
            usuarios[i].setCorreo(correo);
            usuarios[i].setContrasena(contrasena);
        }

        System.out.println("\n   Datos de Usuarios:     ");
        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i].mostrarDatos();
        }
    }
}
