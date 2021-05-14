package td2021_05_13_ejercicios;

import java.util.Scanner;

/*
La asociación de vinicultores tiene como política fijar un precio inicial
al kilo de la uva, la cual se clasifica en tipos A y B,
y además en tamaños 1 y 2.
Cuando se realiza la venta del producto ésta es de un sólo tipo y tamaño.
Se requiere determinar cuánto recibirá un productor
por la uva que entrega en un embarque, considerando lo siguiente:
si es de tipo A, se le cargan $20 al precio inicial cuando es de tamaño 1
y $30 si es de tamaño 2.
Si es de tipo B, se rebajan $30 cuando es de tamaño 1 y
$50 cuando es de tamaño 2.
Realice un programa para determinar la ganancia obtenida.
*/

public class Uvas
{
	public static void main(String[] args)
	{
		int tarifa_A_1 =  20;
		int tarifa_A_2 =  30;
		int tarifa_B_1 = -30;
		int tarifa_B_2 = -50;
		int kilos;
		int precio_inicial_kilo;
		String tipo_uva;
		String tamano_uva;
		int tarifa = 0;
		int precio_final_kilo;
		int precio_final_total;
		
		Scanner leer = new Scanner(System.in);
				
	    System.out.print("Ingrese la cantidad de kilos de uva: ");
	    kilos = Integer.parseInt(leer.nextLine());
	    System.out.print("Ingrese el precio inicial por kilo de uva: ");
	    precio_inicial_kilo = Integer.parseInt(leer.nextLine());
	    
	    System.out.print("Seleccione el tipo de uva [A/B]: ");
	    tipo_uva = leer.nextLine();
	    System.out.print("Seleccione el tamaño de uva [1/2]: ");
	    tamano_uva = leer.nextLine();
	    
		if (tipo_uva.equalsIgnoreCase("A") && tamano_uva.equals("1"))
	    {
	    	tarifa = tarifa_A_1;
		}
		
		if (tipo_uva.equalsIgnoreCase("A") && tamano_uva.equals("2"))
	    {
	    	tarifa = tarifa_A_2;
		}
		
		if (tipo_uva.equalsIgnoreCase("B") && tamano_uva.equals("1"))
	    {
	    	tarifa = tarifa_B_1;
		}
		
		if (tipo_uva.equalsIgnoreCase("B") && tamano_uva.equals("2"))
	    {
	    	tarifa = tarifa_B_2;
		}

		precio_final_kilo = precio_inicial_kilo + tarifa;
		precio_final_total = precio_final_kilo * kilos;

		System.out.println();
	    System.out.println("La tarifa a aplicar será de $" + tarifa + " por kilo de uva.");
	    System.out.println("El precio final por kilo de uva será de $" + precio_final_kilo);
	    System.out.println("El precio total por " + kilos + " kilos de uva será de $" + precio_final_total);

	}
}