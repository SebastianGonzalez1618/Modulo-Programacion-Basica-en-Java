package td2021_05_25_constructores.java_fantasy;

import java.util.Scanner;

/*
Ejercicio de creación de una clase con atributos y métodos,
y creación de instancias de esa clase usando diferentes constructores.

Simulación básica de juego de rol.

Esta clase se encarga de:
- Entregar atributos predefinidos para la creación de 2 personajes.
- Permitir crear personajes adicionales con algunos atributos
  ingresados por teclado y otros predefinidos.
- Manejar la mecánica del juego.

La creación de personajes en sí y la ejecución de sus acciones está a cargo
de Personaje.java.
 */

public class JavaFantasy
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		String opcion = "";
		int maxPersonajes = 5;
		Personaje[] personajes = new Personaje[maxPersonajes];
		int indice = -1;
		int dano;
		int contPersonajes = 2;
		
		String nombre;
		String habilidadEspecial;
		
		// Crear 2 personajes con atributos predefinidos.
		personajes[0] = new Personaje("Juanin", 100, 0, 3, "¡Estamos al aire!");
		personajes[1] = new Personaje("Policarpo", 100, 0, 2, "¡Top top top top top!");
		
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
					if (contPersonajes < maxPersonajes)
					{
						indice = contPersonajes;
						++contPersonajes;
						System.out.println();
						System.out.println("--CREAR PERSONAJE--");
						System.out.print("Nombre: ");
						nombre = leer.nextLine();
						System.out.print("Habilidad especial: ");
						habilidadEspecial = leer.nextLine();
						personajes[indice] = new Personaje(nombre, habilidadEspecial);
					}
					else
					{
						System.out.println();
						System.out.println("Se alcanzó la cantidad máxima de personajes permitidos.");
					}
					break;
				case "2": // Seleccionar entre los personajes existentes.
					System.out.println();
					System.out.println("--SELECCIONAR PERSONAJE--");
					for (int i = 0; i < contPersonajes; i++)
					{
						System.out.println("> " + (i + 1) + ". " + personajes[i].getNombre());
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
					System.out.println("Has seleccionado a " + personajes[indice].getNombre());
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
								
								if (personajes[indice].getVida() <= 0)
								{
									System.out.println(personajes[indice].getNombre() + " ha muerto.");
									System.out.println("Selecciona a otro personaje.");
								}
								else
								{
									System.out.println("A " + personajes[indice].getNombre() + " le quedan " + personajes[indice].getVida() + " puntos de vida.");
									System.out.print("Puntos de daño a recibir: ");
									dano = Integer.parseInt(leer.nextLine());
									System.out.println();
									personajes[indice].recibirDano(dano);
								}
								System.out.println();
								break;
							case "4": // Volver al menú principal.
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
}
