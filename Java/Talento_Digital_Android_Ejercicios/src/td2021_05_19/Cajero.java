package td2021_05_19;

import java.util.Scanner;

/*
Hacer un programa que simule un cajero bancario.
Este cajero tendrá una cuenta con un saldo inicial
y deberá poder realizar las siguientes operaciones:

1. Consultar saldo.
2. Realizar un abono o depósito.
3. Realizar giros.
4. Salir del programa.

- Por cada transacción debe indicar el saldo disponible en la cuenta.
- Las operaciones se deben poder realizar cuantas veces la persona quiera.
 */

public class Cajero
{
	public static void main(String[] args)
	{
		String opcion;
		long saldo = 1000000L;
		long monto;
		
		Scanner leer = new Scanner(System.in);
								
		do
		{
			System.out.println("--- CAJERO AUTOMÁTICO ---");
			System.out.println("1.- Consultar saldo.");
			System.out.println("2.- Realizar un depósito.");
			System.out.println("3.- Realizar un giro.");
			System.out.println("4.- Salir del programa.");
			System.out.print("Opción: ");
			opcion = leer.nextLine();
			System.out.println();
			
			switch (opcion)
			{
			case "1":
				System.out.println("1. Consulta de saldo.");
				System.out.println("Saldo disponible: $" + saldo);
				break;
			case "2":
				System.out.println("2. Depósito.");
				do
				{
					System.out.print("Ingrese monto a depositar: $");
					monto = Long.parseLong(leer.nextLine());
					
					if (monto < 0)
					{
						System.out.println("No se admite valores negativos.");
					}
				} while (monto < 0);
				saldo += monto;
				System.out.println("Saldo disponible: $" + saldo);
				break;
			case "3":
				System.out.println("3. Giro.");
				do
				{
					System.out.print("Ingrese monto a girar: $");
					monto = Long.parseLong(leer.nextLine());
					
					if (saldo < monto)
					{
						System.out.println("Saldo insuficiente.");
						System.out.println("Saldo disponible: $" + saldo);
					}
					
					if (monto < 0) {
						System.out.println("No se admite valores negativos.");
					}
				} while (monto > saldo || monto < 0);
				saldo -= monto;
				System.out.println("Saldo disponible: $" + saldo);
				break;
			case "4":
				System.out.println("Adiós.");
				break;
			default:
				System.out.println("Opción no válida.");
			}
			
			System.out.println();
		} while (!opcion.equals("4"));

	}
}
