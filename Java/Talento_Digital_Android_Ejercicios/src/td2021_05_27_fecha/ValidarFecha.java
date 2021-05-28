package td2021_05_27_fecha;

import java.util.Scanner;


/*
Crear una clase Fecha. La clase tendrá tres atributos privados: día, mes y año
de tipo int. La clase contendrá los siguientes métodos:

- Constructor por defecto.
- Constructor con tres parámetros para crear objetos con valores iniciales.
- Métodos set y get para asignar y obtener los valores de los atributos de la clase.
- Método fechaCorrecta() que comprueba si la fecha es correcta o no.
- Método diaSiguiente() que cambia la fecha actual por la del día siguiente.

El objeto de la clase Fecha al que se le aplique este método deberá quedar siempre
en un estado consistente, es decir, la nueva fecha deberá ser correcta.
Escribe un programa para probar la clase Fecha. Prueba el método diaSiguiente() dentro
de un bucle que imprima la fecha durante cada iteración del bucle.

- Como extra, ya que el programa confirma si el año es bisiesto para validar
la fecha, también muestra ese dato por pantalla.
*/


public class ValidarFecha
{
	public static void main(String[] args)
	{
		Fecha fecha = new Fecha();
		Scanner leer = new Scanner(System.in);
		String opcion;
				
		do
		{
			System.out.println("Ingrese una fecha válida:");
			System.out.print("Día: ");
			fecha.setDia(Integer.parseInt(leer.nextLine()));
			System.out.print("Mes (1 a 12): ");
			fecha.setMes(Integer.parseInt(leer.nextLine()));
			System.out.print("Año: ");
			fecha.setAnio(Integer.parseInt(leer.nextLine()));
			
			System.out.println();
			
			if (!fecha.fechaCorrecta())
			{
				System.out.println("La fecha ingresada no es válida.");
				System.out.println();
			}
			else
			{
				System.out.println(fecha);
				System.out.println("La fecha ingresada es válida.");
				if (fecha.esBisiesto())
				{
					System.out.println(fecha.getAnio() + " es bisiesto.");
				}
				else
				{
					System.out.println(fecha.getAnio() + " no es bisiesto.");
				}
			}
		} while (!fecha.fechaCorrecta());	
		
		do
		{
			System.out.println();
			System.out.println("Ingrese \"1\" para ver la fecha siguiente.");
			System.out.print("Ingrese cualquier otro valor para salir: ");
			opcion = leer.nextLine();
			
			if (opcion.equals("1"))
			{
				System.out.println();
				fecha.diaSiguiente();
				System.out.println(fecha);
			}
			
		} while (opcion.equals("1"));
		
		System.out.println();
		System.out.println("Adiós.");
		
	}
}
