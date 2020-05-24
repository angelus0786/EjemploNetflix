package netflix;

/**
 *
 * @author Angelus
 */
public class Pelicula extends Video{
    
    private int anio; 

    public Pelicula() {
    }

    public Pelicula(int anio, String titulo, String genero, String creador, int duracion) {
        super(titulo, genero, creador, duracion);
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Año:"+ anio+"\n"; 

    }

    @Override
    public int tiempoVisto() {
        return super.getDuracion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esVisto() {
        return super.esVisto(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void marcarVisto() {
        super.marcarVisto(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
