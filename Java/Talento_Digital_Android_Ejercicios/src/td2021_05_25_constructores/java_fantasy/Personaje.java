package td2021_05_25_constructores.java_fantasy;

/*
Ejercicio de creación de una clase con atributos y métodos,
y creación de instancias de esa clase usando diferentes constructores.

Simulación básica de juego de rol.

Esta clase es llamada desde JavaFantasy.java y se encarga de
crear cada personaje y administrar sus atributos y acciones.
Cada personaje tiene atributos nombre, vida, experiencia, energia y
habilidadEspecial, y métodos para mostrar sus atributos,
invocar su habilidad especial, recibir daño o morir.
 */

public class Personaje
{
	private String nombre;
	private double vida;
	private double experiencia;
	private double energia;
	private String habilidadEspecial;
	
	
	public Personaje(String nombre, double vida, double experiencia, double energia, String habilidadEspecial)
	{
		this.nombre = nombre;
		this.vida = vida;
		this.experiencia = experiencia;
		this.energia = energia;
		this.habilidadEspecial = habilidadEspecial;
	}
	
	public Personaje(String nombre, String habilidadEspecial)
	{
		this.nombre = nombre;
		this.habilidadEspecial = habilidadEspecial;
		this.vida = 100;
		this.experiencia = 0;
		this.energia = 10;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setVida(double vida)
	{
		this.vida = vida;
	}
	
	public double getVida()
	{
		return vida;
	}
	
	public void setExperiencia(double experiencia)
	{
		this.experiencia = experiencia;
	}
	
	public double getExperiencia()
	{
		return experiencia;
	}
	
	public void setEnergia(double energia)
	{
		this.energia = energia;
	}
	
	public double getEnergia()
	{
		return energia;
	}
	
	public void mostrarAtributos()
	{
		System.out.println("Nombre: " + nombre);
		System.out.println("Habilidad especial: " + habilidadEspecial);
		System.out.println("Vida: " + vida);
		System.out.println("Experiencia: " + experiencia);
		System.out.println("Energía: " + energia);
	}
	
	public void invocarHabilidadEspecial()
	{
		if (vida <= 0)
		{
			System.out.println(nombre + " ha muerto.");
			System.out.println("Selecciona a otro personaje.");
		}
		else
		{
			if (energia >= 1)
			{
				System.out.println(nombre + " invoca " + habilidadEspecial);
				energia -= 1;
				System.out.println("A " + nombre + " le quedan " + energia + " puntos de energía.");
				experiencia += 1;
			}
			else
			{
				System.out.println(nombre + " no cuenta con suficiente energía.");
			}
		}
		
	}
	
	public void recibirDano(int dano)
	{
		System.out.println(nombre + " recibe " + dano + " puntos de daño.");
		vida = vida - dano;
		if (vida <= 0)
		{
			morir();
		}
		else
		{
			System.out.println("A " + nombre + " le quedan " + vida + " puntos de vida.");
			experiencia += dano * 0.2;
		}
	}
	
	public void morir()
	{
		vida = 0;
		System.out.println();
		System.out.println("¡ARGHHHHHHHHHHHHH!  x_x");
		System.out.println(nombre + " ha muerto.");
		System.out.println("F por " + nombre + ".");
	}
}