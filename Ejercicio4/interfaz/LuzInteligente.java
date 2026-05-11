package Ejercicio4.interfaz;

public class LuzInteligente {
    private String idLuz;
    private int nivelBrillo;
    private boolean encendida;

    public LuzInteligente(String idLuz) {
        this.idLuz = idLuz;
        this.nivelBrillo = 0;
        this.encendida = false;
    }

    public String getIdLuz() {
        return idLuz;
    }

    public int getNivelBrillo() {
        return nivelBrillo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {
        encendida = true;
        System.out.println("Luz " + idLuz + " encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Luz " + idLuz + " apagada.");
    }

    public void ajustarBrillo(int nuevoNivel) {
        if (encendida) {
            if (nuevoNivel >= 0 && nuevoNivel <= 100) {
                nivelBrillo = nuevoNivel;
                System.out.println("Brillo ajustado a " + nivelBrillo + "%.");
            } else {
                System.out.println("Advertencia: el brillo debe estar entre 0 y 100.");
            }
        } else {
            System.out.println("La luz " + idLuz + " esta apagada, no se puede ajustar el brillo.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Luz    : " + idLuz);
        System.out.println("Estado : " + (encendida ? "Encendida" : "Apagada"));
        System.out.println("Brillo : " + nivelBrillo + "%");
        System.out.println("                                    ");
    }
}
