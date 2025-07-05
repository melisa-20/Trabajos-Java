package actividades;

public class ejercicio03 {
    public static void main(String[] args) {

        double producto1 = 12.0;
        double producto2 = 81.5;
        double producto3 = 10.9;


        double subtotal = producto1 + producto2 + producto3;
        double propina = subtotal * 0.10;
        double igv = subtotal * 0.18;
        double totalPagar = subtotal + propina + igv;

        System.out.println("Subtotal:" + subtotal);
        System.out.println("Propina (10%): " + propina);
        System.out.println("IGV (18%):" + igv);
        System.out.println("Total a pagar: " + totalPagar);
    }
}
