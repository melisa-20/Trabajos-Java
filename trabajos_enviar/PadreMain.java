package trabajos_enviar;

public class PadreMain {
    public static void main(String[] args) {
        //biblioteca
        acti1 lb1=new acti1("odisea","homero",1920);
        libro1 lb=new libro1("romeo julieta","rosa",1970,200,"pdf");
        lb.descargar();
        lb.mostrarDetalles();

        System.out.println("=======================================================");
        Vehiculo auto1=new Vehiculo("toyota","4x4",27500);
        auto1.mostrarInfo();
        auto1.arrancar();
        System.out.println("==========================================================");

        EmpleadoHospital usuario=new EmpleadoHospital("juan","area de limpieza",1300);
        doctor user=new doctor("rosa","gefe",12400,"medico cirujano",20);
        user.atenderPaciente();
        usuario.mostrarDatos();



    }

}
