package netflix;

import java.util.ArrayList;

/**
 *
 * @author Angelus
 */
public class Netflix {

     public static ArrayList<Video>lista;
     
    public static void main(String[] args) {
      lista=new ArrayList<>();
      
         Video v1 = new Pelicula(2018,"Infinity Wars", "Ciencia Ficcion","Marvel", 135);
         Video v2 = new Pelicula(2018,"El discurso del Rey","Ficción/Historica","Tom Hopper",118);
         Video v3 = new Serie(10,"Smallville","Ciencia Ficcion","Alfred Gough",40);
         Video v4 = new Pelicula(1994,"Mentes Brillantes","Drama"," Ron Howard",120);
         Video v5 = new Serie(6,"The Originals","Fantacia", "Julie Plec", 60);
         Video v6 = new Serie(4,"The Flash","Ciencia Ficción", "David Nutter",45);
         Video v7 = new Pelicula(2010,"Harry Potter","Ciencia Ficcion","J.K Rowling",120);
         
         lista.add(v1);
         lista.add(v2);
         lista.add(v3);
         lista.add(v4);
         lista.add(v5);
         lista.add(v6);
         lista.add(v7);
         
         v1.marcarVisto();
         v2.marcarVisto();
         v3.marcarVisto();
         v4.marcarVisto();
         v5.marcarVisto();
         
         visualizados();
        System.out.println("Pelicula más Resiente:\n"+
                peliculaMasResiente(lista));
        System.out.println("Serie con más Temporadas:\n"+
                serieMasTemporadas(lista));
         
         
    }
    public static  void visualizados(){
             double tiempoVisualizado=0;
             double tvP=0;
             double tvS=0;
        try{
                 
         System.out.println("--->Listado Videos vistos");
         for (Video seleccion : lista) {
             if (seleccion.esVisto()==true && seleccion.getClass().getSimpleName().equals("Pelicula")) {
                 tiempoVisualizado+=seleccion.getDuracion();
                 tvP+=seleccion.getDuracion();
                 System.out.println(seleccion.getClass().getSimpleName());
                 System.out.println(seleccion.toString());
               
             }else if(seleccion.esVisto()==true && seleccion.getClass().getSimpleName().equals("Serie")){
                 tiempoVisualizado+=seleccion.getDuracion();
                 tvS+=seleccion.getDuracion();
                 System.out.println(seleccion.getClass().getSimpleName());
                 System.out.println(seleccion.toString());
               
             }
             
            }// fin for
             System.out.println("Resumen de Visualización");
             System.out.println("Tiempo de Peliculas: "+(tvP/60)+" horas");
             System.out.println("Tiempo de Series: "+(tvS/60)+" horas");
             System.out.println("Total Visualizado: "+
                 (tiempoVisualizado/60)+ " horas\n");
            } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Ocurrio un error");
             e.printStackTrace();
            }
    }
    public static String peliculaMasResiente(ArrayList<Video> lista) {
       int masResiente=0;
       Pelicula p=null;
        try {
          for (Video seleccion : lista) {
            if (seleccion.getClass().getSimpleName().equals("Pelicula")) {
                if(((Pelicula)seleccion).getAnio()>masResiente){
                    masResiente = ((Pelicula)seleccion).getAnio();
                    p=((Pelicula)seleccion);
                }
            }
          }
          return p.toString();

        } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Ocurrio un Error");
             e.printStackTrace();  
             return null;
        }
      
    }
    public static String serieMasTemporadas(ArrayList<Video> lista) {
      int masTemporadas=0;
       Serie s=null;
        try {
          for (Video seleccion : lista) {
            if (seleccion.getClass().getSimpleName().equals("Serie")) {
                if(((Serie)seleccion).getNoTemporadas()>masTemporadas){
                    masTemporadas = ((Serie)seleccion).getNoTemporadas();
                    s=((Serie)seleccion);
                }
            }
          }
          return s.toString();

        } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Ocurrio un Error");
             e.printStackTrace();  
             return null;
        }  
    }
    
    
}
