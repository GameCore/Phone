package phone;

class CellPhone implements Phone
{
    private int numero;
    
    public CellPhone(int numero)
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
return "La llamada en celular esta en progreso al numero :" + numero ;
else
return "No hay llamada entrante en su celular";
}

}
