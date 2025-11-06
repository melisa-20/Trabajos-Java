package trabajos_enviar;

public class libro1 extends acti1 {
   private double paginas;
   private String formato;

    public libro1(String titulo, String autor, int anio, double paginas, String formato) {
        super(titulo, autor, anio);
        this.paginas = paginas;
        this.formato = formato;
    }

    void descargar() {
        System.out.println("Descargando el libro web de paginas: " +paginas);
    }

    void mostrarDetalles() {
        System.out.println("Formato: " + formato );
    }
}

