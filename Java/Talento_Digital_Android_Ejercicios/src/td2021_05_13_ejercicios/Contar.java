package td2021_05_13_ejercicios;

import java.util.Scanner;

// Contar hasta un número ingresado por teclado.

public class Contar
{
	public static void main(String[] args)
	{
		int numero;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("¿Hasta qué número desea contar?: ");
		
		numero = Integer.parseInt(leer.nextLine());
		
		for (int i = 1; i <= numero; i++)
		{
			System.out.println(i);
		}
	}
}
