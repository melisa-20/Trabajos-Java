package trabajos_enviar;

public class V_nuevo extends Vehiculo {
    private  String color;
    private int placa;

    public V_nuevo(String marca, String modelo, double precio, String color, int placa) {
        super(marca, modelo, precio);
        this.color = color;
        this.placa = placa;
    }
    public void detalles(){
        System.out.println("el color del vehiculo es: "+color);
    }
    public void numero(){
        System.out.println("el numero de su placa sera"+placa);
    }
}
