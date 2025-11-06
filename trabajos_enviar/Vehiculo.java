package trabajos_enviar;

public class Vehiculo {
    private String marca;
    private String modelo;
     private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + " - $" + precio);
    }

    void arrancar() {
        System.out.println(marca + " " + modelo + " ha arrancado.");
    }
}
