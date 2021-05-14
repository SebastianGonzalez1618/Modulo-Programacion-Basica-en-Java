package td2021_05_13_ejercicios;

import java.util.Scanner;

/*
La política de la compañía telefónica "Chismefón" es "Chismea + x -".
Cuando se realiza una llamada, el cobro es por el tiempo que esta dura,
de tal forma que los primeros 5 minutos cuestan $100 cada uno,
los siguientes 3, $80,
los siguientes 2 minutos $70
y a partir del décimo minuto, $50.
Además, se carga un impuesto de 3% cuando es domingo,
y si es día hábil, en turno matutino, 15%,
y en turno vespertino, 10%.

Realice un programa para determinar cuánto debe pagar por cada concepto
una persona que realiza una llamada.
*/

public class Chismefon
{
	public static void main(String[] args)
	{
		int largo_tramo_A = 5;
		int largo_tramo_B = 3;
		int largo_tramo_C = 2;
		// largo_tramo_D: sin límite

		int costo_minuto_tramo_A = 100;
		int costo_minuto_tramo_B =  80;
		int costo_minuto_tramo_C =  70;
		int costo_minuto_tramo_D =  50;

		double impuesto_domingo = 0.03;
		double impuesto_dia_habil_matutino = 0.15;
		double impuesto_dia_habil_vespertino = 0.1;
		double impuesto = 0;
		double costo_impuesto;
		double costo_final;
		
		int minutos_en_tramo_A = 0;
		int minutos_en_tramo_B = 0;
		int minutos_en_tramo_C = 0;
		int minutos_en_tramo_D = 0;
		int costo_neto;
		
		Scanner leer = new Scanner(System.in);
		
		int minutos;
		String dia;
		String horario = "";
		
		System.out.print("Ingrese la duración de la llamada en minutos: ");
		minutos = Integer.parseInt(leer.nextLine());
		System.out.println("Ingrese el día de la llamada: ");
		System.out.println(" [1] Día hábil.");
		System.out.println(" [2] Domingo.");
		System.out.println(" [3] Otro.");
		System.out.print(" Opción [1, 2, 3]: ");
		dia = leer.nextLine();
		
		if (dia.equals("1"))
		{
			System.out.println("Ingrese el horario de la llamada: ");
			System.out.println(" [M] Matutino.");
			System.out.println(" [V] Vespertino.");
			System.out.print(" Opción [M, V]: ");
			horario = leer.nextLine();	
		}
		
		
		if (minutos <= largo_tramo_A)
		{
			minutos_en_tramo_A = minutos;
		}
		else
		{
			minutos_en_tramo_A = largo_tramo_A;
			if (minutos <= (largo_tramo_A + largo_tramo_B) )
			{
				minutos_en_tramo_B = minutos - largo_tramo_A;
			}
			else
			{
				minutos_en_tramo_B = largo_tramo_B;
				if (minutos <= (largo_tramo_A + largo_tramo_B + largo_tramo_C) )
				{
					minutos_en_tramo_C = minutos - (largo_tramo_A + largo_tramo_B);
				}
				else
				{
					minutos_en_tramo_C = largo_tramo_C;
					minutos_en_tramo_D = minutos - (largo_tramo_A + largo_tramo_B + largo_tramo_C);
				}
			}
		}
		
		costo_neto =  (minutos_en_tramo_A * costo_minuto_tramo_A)
					+ (minutos_en_tramo_B * costo_minuto_tramo_B)
					+ (minutos_en_tramo_C * costo_minuto_tramo_C)
					+ (minutos_en_tramo_D * costo_minuto_tramo_D);

		if (dia.equals("1"))
		{		
			if (horario.equalsIgnoreCase("M"))
			{
				impuesto = impuesto_dia_habil_matutino;
			}
			else if (horario.equalsIgnoreCase("V"))
			{
				impuesto = impuesto_dia_habil_vespertino;
			}
		}
		
		if (dia.equals("2"))
		{
			impuesto = impuesto_domingo;
		}
		
		costo_impuesto = costo_neto * impuesto;
		costo_final = costo_neto + costo_impuesto;
	
		System.out.println();
		System.out.println("Costo neto de la llamada: $" + costo_neto);
		System.out.println("Impuesto a pagar: $" + costo_impuesto);
		System.out.println("Total a pagar: $" + costo_final);
	}
}

