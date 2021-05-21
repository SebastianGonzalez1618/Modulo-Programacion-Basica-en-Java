package td2021_05_20;

import java.util.Scanner;

/*
Implementar un algoritmo de búsqueda u ordenamiento.
Ordenar una lista de 5 números ingresados por teclado
usando el algoritmo de ordenamiento de la burbuja.
 */

public class OrdenamientoBurbuja
{
	public static void main(String[] args)
	{
		int largo = 5;
		double temp;
		double[] datos = new double[largo];
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese " + largo + " números: ");

		// Llenar el arreglo con números ingresados por teclado.
		for (int i = 0; i < largo; i++)
		{
			System.out.print("> ");
			datos[i] = Double.parseDouble(leer.nextLine());
		}

		// Ordenar el arreglo usando el algoritmo de la burbuja.
		for (int i = largo - 1; i >= 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (datos[j] > datos[j + 1])
				{
					temp = datos[j + 1];
					datos[j + 1] = datos[j];
					datos[j] = temp;
				}
			}
		}
		
		// Mostrar el arreglo ordenado.
		System.out.println("\nNúmeros ordenados:");
		
		for (int i = 0; i < largo; i++)
		{
			System.out.println("> " + datos[i]);
		}
	}
}
