package td2021_05_19;

import java.util.Scanner;

/*
Hacer un programa que simule una calculadore,
donde se seleccione entre las 4 operaciones básicas
(suma, resta, multiplicación y división)
y que además permita poder volver a seleccionar una nueva operación.
 */

public class Calculadora
{

	public static void main(String[] args)
	{
		String opcion;
		String opciones_validas = "12345";
		double num1 = 0.0;
		double num2 = 0.0;
		double resultado = 0.0;
		String operacion = "";
		boolean operacion_valida;
		
		Scanner leer = new Scanner(System.in);
		
		do
		{
			operacion_valida = true;
			
			System.out.println("---CALCULADORA---");
			System.out.println("1.- Suma.");
			System.out.println("2.- Resta.");
			System.out.println("3.- Multiplicación.");
			System.out.println("4.- División.");
			System.out.println("5.- Salir.");
			System.out.print("Opción: ");
			opcion = leer.nextLine();
			System.out.println();

			if (opciones_validas.contains(opcion) && !opcion.equals("5"))
			{
				System.out.print("Ingrese el primer número: ");
				num1 = Double.parseDouble(leer.nextLine());
				System.out.print("Ingrese el segundo número: ");
				num2 = Double.parseDouble(leer.nextLine());
			}
			
			switch (opcion)
			{
			case "1":
				operacion = " + ";
				resultado = num1 + num2;
				break;
			case "2":
				operacion = " - ";
				resultado = num1 - num2;
				break;
			case "3":
				operacion = " * ";
				resultado = num1 * num2;
				break;
			case "4":
				if (num2 == 0)
				{
					operacion_valida = false;
					System.out.println("\nLa división por 0 no está definida.");
				}
				else
				{
					operacion = " / ";
					resultado = num1 / num2;
				}
				break;
			case "5":
				System.out.println("Adiós.");
				break;
			default:
				System.out.println("Opción no válida.");
			}

			if (opciones_validas.contains(opcion) && operacion_valida)
			{
				System.out.println();
				System.out.println(num1 + operacion + num2 + " = " + resultado);
			}
			
			System.out.println();
		} while (!opcion.equals("5"));

	}
}
