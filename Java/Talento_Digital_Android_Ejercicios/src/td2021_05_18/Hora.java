package td2021_05_18;

import java.util.Scanner;

/*
Realizar un programa que lea por teclado tres números enteros H, M y S,
correspondientes a hora, minutos y segundos respectivamente,
y compruebe si la hora que indicada es válida.
Supondremos que leeremos una hora en modo 24 horas, es decir,
el valor válido para las horas será mayor o igual que cero y menor que 24.
El valor válido para los minutos y segundos estará comprendido entre 0 y 59,
ambos incluidos. 
 */

public class Hora
{

	public static void main(String[] args)
	{
		int H, M, S;
		boolean H_valido = false;
		boolean M_valido = false;
		boolean S_valido = false;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese una hora válida en formato de 24 horas:\n");
		System.out.print("Horas: ");
		H = Integer.parseInt(leer.nextLine());
		System.out.print("Minutos: ");
		M = Integer.parseInt(leer.nextLine());
		System.out.print("Segundos: ");
		S = Integer.parseInt(leer.nextLine());
		
		if ( H >= 0 && H < 24 )
		{
			H_valido = true;
		}
		
		if ( M >= 0 && M < 60 )
		{
			M_valido = true;
		}
		
		if ( S >= 0 && S < 60 )
		{
			S_valido = true;
		}
		
		System.out.println("\nHora ingresada: " + H + ":" + M + ":" + S);
		
		if ( H_valido && M_valido && S_valido)
		{
			System.out.println("\nLa hora ingresada es válida.");
		}
		else
		{
			System.out.println("\nLa hora ingresada no es válida.");
		}
	}
}
