package actividades;

public class ejercicio01 {
    public static void main(String[] args) {
        int edad = 14;
        boolean tieneMochila = false;


        if (edad > 18 && edad < 60 && !tieneMochila) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("Acceso denegado.");
        }

    }
}
