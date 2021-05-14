package td2021_05_13_ejercicios;

import java.util.Scanner;

/*
Calcular promedio de notas ingresadas por teclado.
 */

public class Promedio
{
	public static void main(String[] args)
	{
		double suma = 0;
		int contador = 0;
		double nota;
		double promedio;
		
		Scanner leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Ingrese nota (o valor menor a 1 para terminar): ");
			nota = Double.parseDouble(leer.nextLine());
			
			if (nota >= 1)
			{
				++contador;
				suma += nota;
			}
			
		} while (nota >= 1);
		
		promedio = suma / contador;
		
		System.out.println("El promedio es: " + promedio);
	}
}