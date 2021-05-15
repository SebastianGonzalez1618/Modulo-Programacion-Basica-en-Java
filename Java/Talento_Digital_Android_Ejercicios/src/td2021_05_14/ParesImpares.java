package td2021_05_14;

import java.util.Scanner;

/*
Sumar los números pares e impares ingresados por un usuario,
contar la cantidad de números pares y de impares,
y determinar si se ingreso más números de un tipo u otro.
La cantidad de números que se ingresan debe ser ingresada por teclado.
*/
public class ParesImpares
{
	public static void main(String[] args)
	{
		int cantidad;
		int num;
		int cont_pares = 0;
		int suma_pares = 0;
		int cont_impares = 0;
		int suma_impares = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de números a ingresar: ");
		cantidad = Integer.parseInt(leer.nextLine());
		System.out.println();
		System.out.println("Ingrese los " + cantidad + " números: ");
		System.out.println();
		
		for(int i = 1; i <= cantidad; i++)
		{
			System.out.print("> ");
			num = Integer.parseInt(leer.nextLine());
			
			if (num % 2 == 0)
			{
				++cont_pares;
				suma_pares += num;
			}
			else
			{
				++cont_impares;
				suma_impares += num;
			}
		}
		
		System.out.println();
		System.out.println("La suma de los números pares ingresados es: " + suma_pares);
		System.out.println("La suma de los números impares ingresados es: " + suma_impares);
		System.out.println("Cantidad de números pares: " + cont_pares);
		System.out.println("Cantidad de números impares: " + cont_impares);
		
		if (cont_pares == cont_impares)
		{
			System.out.println("Usted ingresó igual cantidad de números pares e impares.");
		}
		else if (cont_pares > cont_impares)
		{
			System.out.println("Usted ingresó más números pares que impares.");
		}
		else if (cont_impares > cont_pares)
		{
			System.out.println("Usted ingresó más números impares que pares.");
		}
		
	}
}
