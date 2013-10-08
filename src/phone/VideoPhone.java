package phone;

class VideoPhone implements Phone
{
    
private int numero;  

public VideoPhone (int numero)
{
dialNumber(numero);
}
public  void dialNumber(int num)
{
numero = num;
}
public  boolean isCallInProgress()
  {
  return true;  
  }

public String llamadActual()
{
if( isCallInProgress() == true)
return "La video llamada esta en progreso al numero :" + numero ;
else
return "No hay llamada entrante en su celular";
}

}