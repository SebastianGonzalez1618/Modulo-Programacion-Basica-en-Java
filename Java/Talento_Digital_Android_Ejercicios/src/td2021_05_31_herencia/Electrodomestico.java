package td2021_05_31_herencia;

/*
Crear una superclase Electrodomestico con sus respectivos atributos
y métodos propios de la clase. Luego, a partir de esa clase crear
como mínimo 3 subclases.
 */

public class Electrodomestico
{
	private String marca;
	private String modelo;
	private boolean prendido;
	
	public Electrodomestico(String marca, String modelo)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.prendido = false;
	}

	public String getMarca()
	{
		return marca;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public String getModelo()
	{
		return modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public boolean isPrendido()
	{
		return prendido;
	}

	public void setPrendido(boolean prendido)
	{
		this.prendido = prendido;
	}
	
	public void prender()
	{
		setPrendido(true);
	}
	
	public void apagar()
	{
		setPrendido(false);
	}
	
}
