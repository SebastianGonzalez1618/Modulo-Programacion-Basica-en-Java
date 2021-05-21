package td2021_05_20;

import java.util.Scanner;

/*
Leer dos arreglos y calcular la suma de sus elementos
(1er elemento A + 1er elemento B...),
almacenar las sumas en un nuevo arreglo y mostrar los resultados.
 */

public class Sumar2Arreglos
{
	public static void main(String[] args)
	{
		int largo;
		double[] arregloA;
		double[] arregloB;
		double[] sumas;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de pares de números a sumar: ");
		largo = Integer.parseInt(leer.nextLine());
		arregloA = new double[largo];
		arregloB = new double[largo];
		sumas = new double[largo];
		
		for (int i = 0; i < largo; i++)
		{
			System.out.print("\n> ");
			arregloA[i] = Double.parseDouble(leer.nextLine());
			System.out.print(" + ");
			arregloB[i] = Double.parseDouble(leer.nextLine());
			sumas[i] = arregloA[i] + arregloB[i];
		}
		
		System.out.println();
		System.out.println("--RESULTADOS--");
		
		for (int i = 0; i < largo; i++)
		{
			System.out.println("> " + arregloA[i] + " + " + arregloB[i] + " = " + sumas[i]);
		}
				
	}
}