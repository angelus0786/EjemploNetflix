
package netflix;

/**
 *
 * @author Angelus
 */
public class Serie  extends Video {
    private int noTemporadas;
  
    public Serie() {
        this.noTemporadas = 1;
    }

    public Serie(int noTemporadas, String titulo, String genero, String creador, int duracion) {
        super(titulo, genero, creador, duracion);
        this.noTemporadas = noTemporadas;
    }

    public int getNoTemporadas() {
        return noTemporadas;
    }

    public void setNoTemporadas(int noTemporadas) {
        this.noTemporadas = noTemporadas;
    }

    @Override
    public String toString() {
        return super.toString()+
                "N°Temporadas: "+noTemporadas+"\n";
    }

    @Override
    public int tiempoVisto() {
        return super.tiempoVisto(); //To change body of generated methods, choose Tools | Templates.
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
