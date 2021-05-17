package td2021_05_17;

import java.util.Scanner;

/*
 * Utilizando los ciclos iterativos, crear un programa que permita
 * determinar el mayor de N números ingresados por teclado. 
 */

public class Mayor
{
	public static void main(String[] args)
	{
		double numero;
		double mayor = 0;
		int cont = 0;
		String seguir = "1";
		Scanner leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Ingrese un número: ");
			numero = Double.parseDouble(leer.nextLine());
			System.out.print("¿Seguir? 1. Sí   2. No: ");
			seguir = leer.nextLine();
			++cont;
			
			if (cont == 1)
			{
				mayor = numero;
			}
			else
			{
				if (numero > mayor)
				{
					mayor = numero;
				}
			}
		} while (seguir.equals("1"));
		
		System.out.println();
		System.out.println("El número mayor ingresado es: " + mayor);
	}
}
