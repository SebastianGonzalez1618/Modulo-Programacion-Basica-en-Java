package td2021_05_13_ejercicios;

import java.util.Scanner;

/*
"La Langosta Ahumada" es una empresa dedicada a ofrecer banquetes.
Sus tarifas son las siguientes:
el costo de un platillo por persona es de $9500, 
pero si el número de personas es mayor a 200 pero menor o igual a 300,
el costo es de $8500.
Para más de 300 personas el costo por platillo es de $7500.
Se requiere un algoritmo y diagrama de flujo que ayude a determinar
el presupuesto que se debe presentar a las personas
que deseen realizar un evento.
*/


public class LaLangostaAhumada
{
	public static void main(String[] args)
	{
	    int tarifa_A = 9500;
	    int tarifa_B = 8500;
	    int tarifa_C = 7500;

	    int max_personas_tarifa_A = 200;
	    int max_personas_tarifa_B = 300;
	    // max_personas_tarifa_C: sin limite
	    
	    int personas;
	    
	    int tarifa;
	    int total;
	    
	    Scanner leer = new Scanner(System.in);
	    
	    System.out.print("Ingrese cantidad de personas a atender: ");
	    personas = Integer.parseInt(leer.nextLine());
	    
	    if (personas <= max_personas_tarifa_A)
	    {
	    	tarifa = tarifa_A;
		}
	    else if (personas <= max_personas_tarifa_B)
	    {
	    	tarifa = tarifa_B;
		}
	    else
	    {
	    	tarifa = tarifa_C;
	    }
	    
	    total = personas * tarifa;
	    
	    System.out.println("El costo final es $" + total);
	}
}