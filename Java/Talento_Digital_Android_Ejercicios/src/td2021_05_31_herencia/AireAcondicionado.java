package td2021_05_31_herencia;

public class AireAcondicionado extends Electrodomestico
{
	private int temperatura;

	public AireAcondicionado(String marca, String modelo, int temperatura)
	{
		super(marca, modelo);
		this.temperatura = temperatura;
	}
	
	
	public int getTemperatura()
	{
		return temperatura;
	}

	public void setTemperatura(int temperatura)
	{
		this.temperatura = temperatura;
	}

	public void subirTemperatura()
	{
		temperatura++;
	}
	
	public void bajarTemperatura()
	{
		temperatura--;
	}	
	
}