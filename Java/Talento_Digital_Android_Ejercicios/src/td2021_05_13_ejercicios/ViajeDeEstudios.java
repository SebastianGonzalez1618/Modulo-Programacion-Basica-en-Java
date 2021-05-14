package td2021_05_13_ejercicios;

import java.util.Scanner;

/*
El director de una escuela está organizando un viaje de estudios
y requiere determinar cuánto debe cobrar a cada estudiante
y cuánto debe pagar a la compañía de viajes por el servicio.
La forma de cobrar es la siguiente:
si son 100 estudiantes o más, el costo por estudiante es de %6500.
De 50 a 99 estudiantes, el costo es de $7000.
De 30 a 49, de $9500.
Si son menos de 30, el costo de la renta del autobús es de $400000,
sin importar el número de estudiantes.
 
Realice un programa que permita determinar el pago a la compañía de autobuses
y lo que debe pagar cada estudiante por el viaje.
 */

public class ViajeDeEstudios
{
	public static void main(String[] args)
	{
	    int maximo_personas_tarifa_A = 29;
	    int maximo_personas_tarifa_B = 49;
	    int maximo_personas_tarifa_C = 99;

	    int tarifa_A_fija = 400000;
	    int tarifa_B_por_persona = 9500;
	    int tarifa_C_por_persona = 7000;
	    int tarifa_D_por_persona = 6500;

	    int estudiantes;
	    int costo_total;
	    int costo_por_estudiante;
	    
	    Scanner leer = new Scanner(System.in);
	    
	    System.out.print("Ingrese cantidad de estudiantes: ");
	    estudiantes = Integer.parseInt(leer.nextLine());
	    
	    if (estudiantes <= maximo_personas_tarifa_A)
	    {
	    	costo_total = tarifa_A_fija;
	    	costo_por_estudiante = costo_total / estudiantes;
		}
	    else if (estudiantes <= maximo_personas_tarifa_B)
	    {
	    	costo_por_estudiante = tarifa_B_por_persona;
	    	costo_total = estudiantes * costo_por_estudiante;
		}
	    else if (estudiantes <= maximo_personas_tarifa_C)
	    {
	    	costo_por_estudiante = tarifa_C_por_persona;
	    	costo_total = estudiantes * costo_por_estudiante;
	    }
	    else
	    {
	    	costo_por_estudiante = tarifa_D_por_persona;
	    	costo_total = estudiantes * costo_por_estudiante;
	    }
		
	    System.out.println();
	    System.out.println("El pago total a la compañía es de $" + costo_total);
	    System.out.println("El costo por cada estudiante es de $" + costo_por_estudiante);
	    
	}
}