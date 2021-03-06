package td2021_05_26;

import java.util.Scanner;

/*
Crea una clase llamada Contador que contenga un único atributo entero llamado cont.
La clase tendrá los siguientes constructores:

- Constructor por defecto
- Constructor con parámetros para inicializar el contador con un valor no negativo.

Si el valor inicial que se recibe es negativo, el contador tomará cero
como valor inicial.

Además de los métodos getter y setter,
la clase contendrá los métodos:

- incrementar: incrementa el contador en una unidad.
- decrementar: decrementa el contador en una unidad.

El contador nunca podrá tener un valor negativo. Si al decrementar se alcanza
un valor negativo, el contador toma el valor cero.

Una vez creada la clase, escribe un método main para probarla.
 */

public class Contador
{
    private int cont;

    public static void main(String[] args)
    {
		Scanner leer = new Scanner(System.in);
		String opcion = "";
		Contador contador;
		int inicio;
		
		do
		{
			System.out.println("1. Crear contador por defecto (desde 0).");	
			System.out.println("2. Crear contador con otro valor inicial.");
			System.out.println("3. Salir.");
			System.out.print("Opción: ");
			opcion = leer.nextLine();
			
			switch(opcion)
			{
			case "1":
				contador = new Contador();
				break;
			case "2":
				System.out.print("\nIngrese valor inicial para el contador: ");
				inicio = Integer.parseInt(leer.nextLine());
				contador = new Contador(inicio);				
				break;
			case "3":
				System.out.println("\nAdiós.\n");
				return;
			default:
				System.out.println("\nOpción no válida.\n");
				contador = null;
				break;			
			}
		} while (!"12".contains(opcion));

		do
		{
			System.out.println();
			System.out.println("1. Incrementar.");	
			System.out.println("2. Decrementar.");	
			System.out.println("3. Salir.");
			System.out.print("Opción: ");
			opcion = leer.nextLine();
			System.out.println();
			
			switch(opcion)
			{
			case "1":
				contador.incrementar();
				break;
			case "2":
				contador.decrementar();
				break;
			case "3":
				System.out.println("\nAdiós.");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
			}
		} while (!opcion.equals("3"));
		
	}
    
    // Por defecto el contador se inicializa en 0.
	public Contador()
	{
		System.out.println("\nEl contador se ha inicializado en: " + this.cont);
	}

    // Si el valor inicial que se recibe es negativo,
    // el contador tomará l valor cero como valor inicial.
    public Contador(int valorInicial)
    {
        if (valorInicial < 0)
        {
        	System.out.println("\nNo se admiten valores negativos.");
        	this.cont = 0;
		}
        else
        {
        	this.cont = valorInicial;
		}
        System.out.println("\nEl contador se ha inicializado en: " + this.cont);
    }
    
    // incrementar: incrementa el contador en una unidad.
    public void incrementar()
    {
    	cont++;
    	System.out.println("El contador va en: " + this.cont);
    }

    // decrementar: decrementa el contador en una unidad.
    // Si al decrementar se alcanza un valor negativo, el contador toma el valor cero.
    public void decrementar()
    {
    	if (cont > 0)
    	{
    		cont--;
    		System.out.println("El contador va en: " + this.cont);
    	}
    	else
    	{
    		System.out.println("El contador ya ha llegado a 0.");
    	}
    }
}