package netflix;

/**
 *
 * @author Angelus
 */
public class Video implements Ivisualizable{
    private String titulo;
    private String genero;
    private String creador;
    private int duracion; 
    private boolean visto; 

    public Video() {
        this.visto = false;
    }

    public Video(String titulo, String genero, String creador, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
        this.visto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void marcarVisto() {
        this.visto=true;
    }

    @Override
    public boolean esVisto() {
    return visto;
    }

    @Override
    public int tiempoVisto() {
        return duracion;
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Titulo:"+titulo+"\n");
        cadena.append("Genero:"+genero+"\n");
        cadena.append("Creador:"+creador+"\n");
        cadena.append("Duración:"+duracion+" minutos \n");
        return cadena.toString();
    }
    
    
    
}
