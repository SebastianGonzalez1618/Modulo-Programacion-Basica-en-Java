package td2021_05_20;

import java.util.Scanner;

/*
Un número es perfecto si es igual a la suma de todos sus divisores positivos
sin incluir el propio número. Por ejemplo, el 6 es perfecto.
El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor
para comprobar si es perfecto.

Si sumamos 1 + 2 + 3 = 6

Por lo tanto, 6 es un número perfecto. 
Los siguientes números perfectos después del 6 son 28, 8128, 33550336, 8589869056.
Realizar un programa que pida por teclado un número y muestre si es perfecto o no.
 */

public class NumerosPerfectos
{
	public static void main(String[] args)
	{
		long num;
		long suma = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
		num = Long.parseLong(leer.nextLine());
		
		System.out.println("\nLos divisores de " + num + " son:\n");
		
		for (long i = 1; i <= num / 2; i++)
		{
			if (num % i == 0)
			{
				suma += i;
				System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println("La suma de los divisores de 28 es: " + suma);
		System.out.print("Por lo tanto, ");
		
		if (suma == num)
		{
			System.out.println( num + " es un número perfecto.");
		}
		else
		{
			System.out.println( num + " no es un número perfecto.");
		}

	}

}
