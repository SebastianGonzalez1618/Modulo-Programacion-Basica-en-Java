package td2021_06_01.clase_abstracta;

public class MalaPersona extends Persona
{
	public MalaPersona(String nombre, int anioNacimiento)
	{
		super(nombre, anioNacimiento);
	}
	
	public void actuar()
	{
		System.out.println(this.getNombre() + ": ¡Te vengo a atacar! o=(¬_¬ o)");
	}
}
