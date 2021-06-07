package td2021_05_31_herencia;

public class Lavadora extends Electrodomestico
{
	private String carga;
	private double capacidad;
	
	public Lavadora(String marca, String modelo, String carga, double capacidad)
	{
		super(marca, modelo);
		this.carga = carga;
		this.capacidad = capacidad;
	}

	public String getCarga()
	{
		return carga;
	}

	public void setCarga(String carga)
	{
		this.carga = carga;
	}

	public double getCapacidad()
	{
		return capacidad;
	}

	public void setCapacidad(double capacidad)
	{
		this.capacidad = capacidad;
	}
	
	public void lavar()
	{
		System.out.println("La lavadora ha terminado de lavar.");
	}
	
	public void enjuagar()
	{
		System.out.println("La lavadora ha terminado de enjuagar.");
	}
	
	public void centrifugar()
	{
		System.out.println("La lavadora ha terminado de centrifugar.");
	}
	
	public void cicloCompleto()
	{
		lavar();
		enjuagar();
		centrifugar();
		System.out.println("La lavadora ha terminado el ciclo completo.");
	}
}
