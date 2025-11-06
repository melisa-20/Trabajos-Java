package actividades;

public class ejercicio04 {
    public static void main(String[] args) {
        int horasTrabajadas = 20;
        double salario;

        // Lógica de cálculo
        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 20;
        } else {
            int horasExtras = horasTrabajadas - 40;
            salario = (40 * 20) + (horasExtras * 40);
        }

        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Salario semanal: S/ " + salario);
    }
}
