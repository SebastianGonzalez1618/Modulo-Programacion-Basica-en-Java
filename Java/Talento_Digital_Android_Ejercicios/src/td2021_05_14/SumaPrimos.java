package td2021_05_14;

import java.util.Scanner;

/*
Calcular la suma de los números primos hasta un número ingresado por teclado.
 */

public class SumaPrimos
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
		int num;
		long suma = 0;
		boolean compuesto;
		int limite;
		
		System.out.println("Calcular la suma de los números primos hasta X.");
		System.out.print("Ingrese X: ");
		num = Integer.parseInt(leer.nextLine());
		
		for (int candidato = 2; candidato <= num; candidato++)
		{
			compuesto = false;
			limite = (int) Math.floor(Math.pow(num, 0.5)) ;
			
			for (int i = 2; i <= limite && compuesto == false; i++) // ***
			{
				if ( (candidato % i == 0) && (candidato != i) )
				{
					compuesto = true;
				}
			}
			
			if (compuesto == false)
			{
				System.out.println(candidato);
				suma += candidato;
			}
		}
		
		System.out.println("La suma de los números primos hasta " + num + " es: " + suma);		
	}
}
