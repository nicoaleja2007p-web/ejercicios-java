package Ejercicio1_Arreglo.interfaz;

public class SensorTemperatura {
    private String idSensor;
    private double valorActual;
    private String unidad;

    public SensorTemperatura(String idSensor, double valorActual, String unidad){
        setIdSensor(idSensor);
        setValorActual(valorActual);
        setUnidad(unidad);
    }

    public String getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(String idSensor) {
        if (idSensor.length() > 0 && !idSensor.startsWith("-")) {
            this.idSensor = idSensor;
        } else {
            this.idSensor = "No valido";
            System.out.println("El ID no puede ser negativo.");
        }
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        if (valorActual >= -273.15) {
            this.valorActual = valorActual;
        }else
            System.out.println("El valor que ingresó no es válido.");
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        if (unidad.length()>0 && !unidad.startsWith("-")){
            this.unidad = unidad;
        }else{
            this.unidad = "No valido";
            System.out.println("La unidad no puede ser negativa.");
        }

    }

    public void mostrarLectura(){
        System.out.println("Sensor ID: "+idSensor+"\nValor Actual: "
                +valorActual+"\nUnidad: "+unidad);
        System.out.println("                                       ");
    }
}