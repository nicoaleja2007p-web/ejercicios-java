package Ejercicio3.interfaz;

public class claseUsuario {
    private String nombreUsuario;
    private String correo;
    private String contrasena;


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        if (contrasena.length() >=  8) {
            this.contrasena = contrasena;
        }else  {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
        }
    }

    public void mostrarDatos(){
        System.out.println("Usuario: "+nombreUsuario);
        System.out.println("Correo: "+correo);
        System.out.println("               ");
    }
}
