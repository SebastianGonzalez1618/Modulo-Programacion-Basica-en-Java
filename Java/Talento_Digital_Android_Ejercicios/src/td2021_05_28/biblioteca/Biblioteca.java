package td2021_05_28.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca
{
	private static Scanner leer = new Scanner(System.in);
	private static ArrayList<Libro> libros = new ArrayList<>();
		
	public static void main(String[] args)
	{
		String opcion;
		
		// Agregar algunos libros por defecto.
		Libro libro1 = new Libro("El Conde de Montecristo", "Alexandre Dumas", 5, 0);
		Libro libro2 = new Libro("El ingenioso hidalgo don Quijote de la Mancha", "Miguel de Cervantes", 10, 0);
		Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 8, 0);
		
		libros.add(libro1);
		libros.add(libro2);
		libros.add(libro3);
		
		do
		{
			System.out.println("--BIBLIOTECA--");
			System.out.println("1. Registrar libro.");
			System.out.println("2. Listar libros.");
			System.out.println("3. Prestar libro.");
			System.out.println("4. Devolver libro.");
			System.out.println("5. Salir.");
			System.out.print("Seleccione una opción: ");
			opcion = leer.nextLine();
			
			switch (opcion)
			{
				case "1":
					registrarLibro();
					break;
				case "2":
					listarLibros();
					break;
				case "3":
					prestarLibro();
					break;
				case "4":
					devolverLibro();
					break;
				case "5":
					System.out.println("\nAdiós.");
					break;
	
				default:
					System.out.println("\nOpción no válida.\n");
					break;
			}
			
		} while (!opcion.equals("5"));
		
	}

	
	public static void registrarLibro()
	{
		String titulo;
		String escritoPor;
		int cantDisponibles;
		int cantPrestados;
		System.out.print("\nTítulo: ");
		titulo = leer.nextLine();
		System.out.print("\nEscrito por: ");
		escritoPor = leer.nextLine();
		System.out.print("\nEjemplares disponibles: ");
		cantDisponibles = Integer.parseInt(leer.nextLine());
		System.out.print("\nEjemplares prestados: ");
		cantPrestados = Integer.parseInt(leer.nextLine());
		libros.add(new Libro(titulo, escritoPor, cantDisponibles, cantPrestados));
		System.out.println();
	}
	
	
	public static void listarLibros()
	{
		System.out.println();
		for (int i = 0; i < libros.size(); i++)
		{
			System.out.println((i + 1) + ".- " + libros.get(i));
		}
		System.out.println();
	}

	
	public static void prestarLibro()
	{
		listarLibros();
		int indice;
		do
		{
			System.out.print("Número del libro a prestar: ");
			indice = Integer.parseInt(leer.nextLine());
			if (indice < 1 || indice > libros.size())
			{
				System.out.println("Opción no válida.");
			}
		} while (indice < 1 || indice > libros.size());
		
		if (libros.get(indice - 1).prestamo())
		{
			System.out.println("\nPrestamo exitoso.\n");
		}
		else
		{
			System.out.println("\nNo quedan ejemplares para préstamo.\n");
		}
	}
	
	
	public static void devolverLibro()
	{
		listarLibros();
		int indice;
		do
		{
			System.out.print("Número del libro a devolver: ");
			indice = Integer.parseInt(leer.nextLine());
			if (indice < 1 || indice > libros.size())
			{
				System.out.println("Opción no válida.");
			}
		} while (indice < 1 || indice > libros.size());

		if (libros.get(indice - 1).devolucion())
		{
			System.out.println("\nDevolución exitosa.\n");
		}
		else
		{
			System.out.println("\nTodos los ejemplares ya han sido devueltos.");
			System.out.println("\nCerciórese de si este libro realmente corresponde a esta biblioteca.\n");
		}
	}
	
}