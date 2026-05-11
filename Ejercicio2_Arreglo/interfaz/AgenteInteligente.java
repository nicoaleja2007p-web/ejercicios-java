package Ejercicio2_Arreglo.interfaz;

public class AgenteInteligente {
    private String nombre;
    private int nivelEnergia;
    private String estado;

    public AgenteInteligente(String nombre, int nivelEnergia, String estado) {
        this.nombre = nombre;
        setNivelEnergia(nivelEnergia);
        setEstado(estado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        if(nivelEnergia >= 0 && nivelEnergia <= 100){
            this.nivelEnergia = nivelEnergia;
        }else{
            System.out.println("El nivel de energía debe estar entre 0 y 100");
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado.equals("Activo")  ||  estado.equals("Inactivo")){
            this.estado = estado;
        }else{
            System.out.println("El estado solo puede ser Activo o Inactivo");
        }
    }

    public void mostrarEstado(){
        System.out.println("Agente: "+nombre+"\n Energía: "+nivelEnergia+"\n Estado: "+estado);
    }
}
