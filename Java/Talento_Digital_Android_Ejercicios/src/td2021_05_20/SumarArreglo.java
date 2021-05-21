package td2021_05_20;

/*
Crear un arreglo, ingresar números y obtener la suma de todos los números ingresados.
 */

import java.util.Scanner;

public class SumarArreglo
{
	public static void main(String[] args)
	{
		int largo;
		double suma = 0.0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de números a ingresar: ");
		largo = Integer.parseInt(leer.nextLine());
		double[] arreglo = new double[largo];
		
		for (int i = 0; i < largo; i++)
		{
			System.out.print((i + 1) + ". ");
			arreglo[i] = Double.parseDouble(leer.nextLine());
		}
		
		System.out.println();
		System.out.println("--VALORES INGRESADOS--");
		
		for (int i = 0; i < largo; i++)
		{
			System.out.println((i + 1) + ". " + arreglo[i]);
			suma += arreglo[i];
		}
		
		System.out.println();
		System.out.println("La suma de los números ingresados es: " + suma);
				
	}
}