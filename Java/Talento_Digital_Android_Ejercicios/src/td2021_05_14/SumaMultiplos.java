package td2021_05_14;

import java.util.Scanner;

/*
Calcular la suma de los números que sean múltiplos de X entre 1 e Y.
X e Y deben ser ingresados por teclado.
 */

public class SumaMultiplos
{
	public static void main(String[] args)
	{
		int num;
		int suma = 0;
		int multiplo = 0;
		int x;
		int y;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Encontrar los múltiplos de un número X entre 1 e Y.");
		System.out.println();
		System.out.print("Ingrese un valor para X: ");
		x = Integer.parseInt(leer.nextLine());
		System.out.print("Ingrese un valor para Y: ");
		y = Integer.parseInt(leer.nextLine());		
		
		System.out.println();
		System.out.println("Múltiplos de " + x + " entre 1 y " + y);
		
		for (int i = 1; (multiplo = x * i) <= y; i++)
		{
			System.out.println("> " + multiplo);
			suma += multiplo;
		}
		
		System.out.println();
		System.out.println("La suma de los múltiplos de " + x + " entre 1 y " + y + " es: " + suma);
	}
}