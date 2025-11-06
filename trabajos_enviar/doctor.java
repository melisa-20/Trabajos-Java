package trabajos_enviar;

public class doctor extends EmpleadoHospital{
    String especialidad;
    int pacientesAtendidos;

    public doctor(String nombre, String cargo, double salario, String especialidad, int pacientesAtendidos) {
        super(nombre, cargo, salario);
        this.especialidad = especialidad;
        this.pacientesAtendidos = pacientesAtendidos;
    }
    void atenderPaciente() {
        System.out.println(nombre + " está atendiendo un paciente.");
    }

    void mostrarEspecialidad() {
        System.out.println("Especialidad: " + especialidad + ", Pacientes atendidos: " + pacientesAtendidos);
    }
}
