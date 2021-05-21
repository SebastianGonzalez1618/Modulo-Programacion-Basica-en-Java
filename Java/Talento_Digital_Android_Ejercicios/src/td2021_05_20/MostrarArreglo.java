package td2021_05_20;

import java.util.Scanner;

/*
Crear un arreglo, ingresar valores y mostrarlos por pantalla.
 */

public class MostrarArreglo
{
	public static void main(String[] args)
	{
		int largo;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de valores a ingresar: ");
		largo = Integer.parseInt(leer.nextLine());

		String[] arreglo = new String[largo];
		
		for (int i = 0; i < largo; i++)
		{
			System.out.print((i + 1) + ". ");
			arreglo[i] = leer.nextLine();
		}
		
		System.out.println();
		System.out.println("--VALORES INGRESADOS--");
		
		for (int i = 0; i < largo; i++)
		{
			System.out.println((i + 1) + ". " + arreglo[i]);
		}
			
	}
}
