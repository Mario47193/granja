
public class Principal
{
    public static void main (){
        
        Granjero paco = new Granjero(" Francisco ",
                            " Martinez ", 72 , 'M');
     
        Granja granjaDePaco = new Granja(" Pacoland ", " Corea del norte ", paco);
        
        Mascota mascota = new Mascota(" Rex ", 13, " perro ");
        paco.setMascota(mascota);
        
        System.out.println(granjaDePaco);
    }
}
