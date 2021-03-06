package td2021_05_24_POO;

import java.util.Scanner;

/*
Ejercicio de creación de una clase con atributos y métodos,
y creación de instancias de esa clase.

- Simulación básica de juego de rol, con las opciones de crear un personaje
y asignarle atributos o seleccionar uno entre 2 personajes preestablecidos.

Cada personaje tiene atributos nombre, vida, experiencia, energia y habilidadEspecial,
y métodos para mostrar sus atributos, invocar su habilidad especial,
recibir daño o morir.
 */

public class Personaje
{
	private String nombre;
	private double vida;
	private double experiencia;
	private double energia;
	private String habilidadEspecial;
	
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		String opcion = "";
		Personaje[] personajes = new Personaje[10];
		int indice = -1;
		int dano;
		int contPersonajes = 2;
		
		// Crear 2 personajes con atributos preestablecidos.
		personajes[0] = new Personaje();
		personajes[0].nombre = "Juanín";
		personajes[0].vida = 100;
		personajes[0].experiencia = 0;
		personajes[0].energia = 3;
		personajes[0].habilidadEspecial = "¡Estamos al aire!";
		
		personajes[1] = new Personaje();
		personajes[1].nombre = "Policarpo";
		personajes[1].vida = 100;
		personajes[1].experiencia = 0;
		personajes[1].energia = 2;
		personajes[1].habilidadEspecial = "¡Top top top top top!";
		
		do
		{
			// Menú principal del juego.
			System.out.println();
			System.out.println("-- JAVA FANTASY --");
			System.out.println("1. Crear personaje.");
			System.out.println("2. Seleccionar personaje.");
			System.out.println("3. Jugar.");
			System.out.println("4. Salir.");
			System.out.print("Opcion: ");
			opcion = leer.nextLine();
			
			switch (opcion)
			{
				case "1": // Crear personaje.
					indice = contPersonajes;
					++contPersonajes;
					System.out.println();
					System.out.println("--CREAR PERSONAJE--");
					personajes[indice] = new Personaje();
					System.out.print("Nombre: ");
					personajes[indice].nombre = leer.nextLine();
					System.out.print("Habilidad especial: ");
					personajes[indice].habilidadEspecial = leer.nextLine();
					personajes[indice].vida = 100;
					personajes[indice].experiencia = 0;
					personajes[indice].energia = 10;
					break;
				case "2": // Seleccionar entre los personajes existentes.
					System.out.println();
					System.out.println("--SELECCIONAR PERSONAJE--");
					for (int i = 0; i < contPersonajes; i++)
					{
						System.out.println("> " + (i + 1) + ". " + personajes[i].nombre);
					}
					do
					{
						System.out.print("Número del personaje seleccionado: ");
						indice = Integer.parseInt(leer.nextLine()) - 1;
						if (indice >= contPersonajes)
						{
							System.out.println("Opción no valida.");
						}
					} while (indice >= contPersonajes);
					System.out.println();
					System.out.println("Has seleccionado a " + personajes[indice].nombre);
					break;
				case "3": // Jugar. Sólo disponible luego de crear o seleccionar personaje.
					if (indice == -1)
					{
						System.out.println();
						System.out.println("Primero selecciona o crea un personaje.");
						
					}
					else
					{
						System.out.println();
						// Menú de acciones disponibles.
						do
						{
							System.out.println("--ACCIONES--");
							System.out.println("1. Mostrar atributos.");
							System.out.println("2. Activar habilidad especial.");
							System.out.println("3. Recibir daño.");
							System.out.println("4. Volver al menú principal.");
							System.out.print("Opcion: ");
							opcion = leer.nextLine();
	
							switch(opcion)
							{
							case "1":
								System.out.println();
								personajes[indice].mostrarAtributos();
								System.out.println();
								break;
							case "2":
								System.out.println();
								personajes[indice].invocarHabilidadEspecial();
								System.out.println();
								break;
							case "3":
								System.out.println();
								
								if (personajes[indice].vida <= 0)
								{
									System.out.println(personajes[indice].nombre + " ha muerto.");
									System.out.println("Selecciona a otro personaje.");
								}
								else
								{
									System.out.println("A " + personajes[indice].nombre + " le quedan " + personajes[indice].vida + " puntos de vida.");
									System.out.print("Puntos de daño a recibir: ");
									dano = Integer.parseInt(leer.nextLine());
									System.out.println();
									personajes[indice].recibirDano(dano);
								}
								System.out.println();
								break;
							case "4":
								break;
							default:
								System.out.println("Opción no válida.");
								System.out.println();
								break;
							}
						} while (!opcion.equals("4"));
					
						opcion = "";
					}
					break;
				case "4": // Salir.
					System.out.println();
					System.out.println("GAME OVER");
					break;
				default:
					System.out.println();
					System.out.println("Opción no válida.");
					break;
			}
			
		} while (!opcion.equals("4"));
		

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
			experiencia += dano * 0.1;
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