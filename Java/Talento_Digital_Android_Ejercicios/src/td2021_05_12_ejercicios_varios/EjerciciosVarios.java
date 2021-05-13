package td2021_05_12_ejercicios_varios;

import java.util.Scanner;

public class EjerciciosVarios
{

	public static void main(String[] args)
	{
		System.out.println("1. Calcular el promedio de 4 notas predefinidas.");
		double nota1 = 4, nota2 = 6, nota3 = 5, nota4 = 6;
		double promedio = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Primera nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Tercera nota: " + nota3);
		System.out.println("Cuarta nota: " + nota4);
		System.out.println("El promedio es: " + promedio);
		System.out.printf("El promedio es: %f%n", promedio);
		
		System.out.println("\n----------\n");
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("2. Calcular el promedio de 4 notas ingresadas por teclado.");
		System.out.print("Ingrese primera nota: ");
		nota1 = Double.parseDouble(leer.nextLine());
		System.out.print("Ingrese segunda nota: ");
		nota2 = Double.parseDouble(leer.nextLine());
		System.out.print("Ingrese tercera nota: ");
		nota3 = Double.parseDouble(leer.nextLine());
		System.out.print("Ingrese cuarta nota: ");
		nota4 = Double.parseDouble(leer.nextLine());
		
		promedio = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("El promedio es: %f%n", promedio);
		
		
		System.out.println("\n----------\n");

		System.out.println("3. Intercambiar el valor de dos variables.");
		System.out.print("Ingrese un valor para A: ");
		String A = leer.nextLine();
		System.out.print("Ingrese un valor para B: ");
		String B = leer.nextLine();
				
		System.out.println("A = " + A + " | " + "B = " + B);
		String temp = A;
		A = B;
		B = temp;
		System.out.println("Vueeeeelta...");
		System.out.println("A = " + A + " | " + "B = " + B);

		System.out.println("\n----------\n");

		System.out.println("4. Ejemplo de uso de if.");
		System.out.print("Ingrese un número entero: ");
		int num = Integer.parseInt(leer.nextLine());
		if (num % 2 == 0)
		{
			System.out.print(num + " es par.");
		}
		else
		{
			System.out.print(num + " es impar.");
		}

	}
}
