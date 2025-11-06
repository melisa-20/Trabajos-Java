package actividades;

public class ejercicio02 {
    public static void main(String[] args) {

        boolean ClienteFrecuente = true;  //
        double montoCompra = 350;

        double descuento;
        double montoFinal;

        // Lógica de descuento
        if (ClienteFrecuente && montoCompra >= 800) {
            descuento = montoCompra * 0.10;
        } else if (!ClienteFrecuente && montoCompra >= 350) {
            descuento = montoCompra * 0.05;
        } else {
            descuento = 0;
        }

        // final
        montoFinal = montoCompra - descuento;
        System.out.println("Descuento aplicado:" + descuento);
        System.out.println("Monto final a pagar:" + montoFinal);



    }
}
