package td2021_06_01.clase_abstracta;

public class BuenaPersona extends Persona
{
	public BuenaPersona(String nombre, int anioNacimiento)
	{
		super(nombre, anioNacimiento);
	}
	
	public void actuar()
	{
		System.out.println(this.getNombre() + ": ¡Te vengo a ayudar! \\(^_^)/");
	}
}
