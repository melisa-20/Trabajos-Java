package trabajos_enviar;

public class EmpleadoHospital {
    String nombre;
    String cargo;
    double salario;
    static int contadorObjetos = 0;

    public EmpleadoHospital(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }
    void mostrarDatos() {
        System.out.println("Empleado: " + nombre + ", Cargo: " + cargo + ", Salario: " + salario);
    }

    void trabajar() {
        System.out.println(nombre + " está trabajando en el hospital.");
    }
}
