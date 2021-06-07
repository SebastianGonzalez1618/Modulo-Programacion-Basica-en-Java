package td2021_05_31_herencia;

public class Refrigerador extends Electrodomestico
{
	private int temperaturaMinima;
	private int temperaturaMaxima;
	
	
	public Refrigerador(String marca, String modelo, int temperaturaMinima, int temperaturaMaxima)
	{
		super(marca, modelo);
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
	}


	public int getTemperaturaMinima()
	{
		return temperaturaMinima;
	}


	public void setTemperaturaMinima(int temperaturaMinima)
	{
		this.temperaturaMinima = temperaturaMinima;
	}


	public int getTemperaturaMaxima()
	{
		return temperaturaMaxima;
	}


	public void setTemperaturaMaxima(int temperaturaMaxima)
	{
		this.temperaturaMaxima = temperaturaMaxima;
	}
	
	public void refrigerar()
	{
		System.out.println("Lo que usted puso en el refrigerados se está refrigerando.");
	}
	
	public void congelar()
	{
		System.out.println("Lo que usted puso en el congelador se está congelando.");
	}
	
}
