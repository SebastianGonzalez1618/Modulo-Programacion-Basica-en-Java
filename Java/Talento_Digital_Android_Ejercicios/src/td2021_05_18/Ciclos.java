package td2021_05_18;

import java.util.Scanner;

/*
 * Inventar algún ejercicio donde se use los 3 tipos de ciclo y switch.
 
	Menú con 3 opciones:
	1. Generar una pirámide.
	2. Generar una pirámide invertida.
	3. Salir.
 */

public class Ciclos
{
	public static void main(String[] args)
	{
		String opcion = "";
		int altura;
		int cont;
		int piso;
		Scanner leer = new Scanner(System.in);
		
		do
		{
			System.out.println("1. Dibujar una pirámide.");
			System.out.println("2. Dibujar una pirámide invertida.");
			System.out.println("3. Salir");
			System.out.println();
			System.out.print("Opción: ");
			opcion = leer.nextLine();
			System.out.println();
			
			switch (opcion) {

			case "1":
				System.out.print("La altura de la pirámide: ");
				altura = Integer.parseInt(leer.nextLine());
				System.out.println();
				
				piso = altura;
				while (piso >= 1)
				{
					cont = 1;
					while (cont <= altura - piso + 1)
					{
						System.out.print("#");
						++cont;
					}
					System.out.println();
					--piso;
				}
				System.out.println();
				break;

			case "2":
				System.out.print("La altura de la pirámide invertida: ");
				altura = Integer.parseInt(leer.nextLine());
				System.out.println();
				
				for (int i = 1; i <= altura; i++)
				{
					for (int j = altura; j >= i; j--)
					{
						System.out.print("#");
					}
					System.out.println();
				}

				System.out.println();
				break;

			case "3":
				break;
        
			default:
				System.out.println("Opción no válida.");
				System.out.println();
				break;
			}
					
		} while (!opcion.equals("3"));
		System.out.println("Adiós.");
	}
}