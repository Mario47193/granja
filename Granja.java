
public class Granja
{
   private Granjero granjero;
   private String nombre;
   private String ubicacion;
   
   public Granja (Granjero propietario)
   {
       this.granjero = granjero;
   }
   
   public Granja ( String nombre, String ubicacion, Granjero granjero) {
       
       this.nombre= nombre;
       this.ubicacion= ubicacion;
       this.granjero = granjero;
       
   }
   public String toString() {
       StringBuilder resultado = new StringBuilder();
       
       resultado.append ("\nDatos de laGranja");
       resultado.append ("\n=====================");
       resultado.append ("\nNombre:");
       resultado.append (nombre);
       resultado.append ("\nUbicacio:");
       resultado.append (ubicacion);
       resultado.append ("\nGranjero:");
       resultado.append (granjero.toString());
       
       
       return resultado.toString();
   }
   
   
}
