package trabajos_enviar;

public class acti1 {

    String titulo;
    String autor;
    int anio;
    static int contadorObjetos = 0;

    public acti1(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        contadorObjetos++;
    }

    void obra(){
        System.out.println("el nombre de la obra :"+titulo+" el autor "+autor);
    }
    void anio(){
        System.out.println("el año creado de la obra es" +anio);
    }


}




