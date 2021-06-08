package td2021_06_01.clase_abstracta;

public abstract class Persona
{
	private String nombre;
	private int anioNacimiento;
	
	public abstract void actuar();
	
	public Persona(String nombre, int anioNacimiento)
	{
		this.nombre = nombre;
		this.anioNacimiento = anioNacimiento;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getAnioNacimiento()
	{
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento)
	{
		this.anioNacimiento = anioNacimiento;
	}
}
