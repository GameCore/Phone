package phone;

public class PruebaPhone
{
    
  static void tipoLlamada(Phone a)
 {
 System.out.println( a.llamadActual() );
 }
    
    public static void main( String [] args )
    {
    Phone t1 = new CellPhone(55141201);
    Phone t2 = new LandlinePhone(55141202);
    Phone t3 = new VideoPhone(55141203);
    
     tipoLlamada( t1 );
     tipoLlamada( t2 );
     tipoLlamada( t3 );
    
    }

 

}