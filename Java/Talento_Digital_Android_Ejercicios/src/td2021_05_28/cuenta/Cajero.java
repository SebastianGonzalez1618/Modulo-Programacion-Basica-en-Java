package td2021_05_28.cuenta;

import java.util.ArrayList;
import java.util.Scanner;

public class Cajero {
	private static Scanner leer = new Scanner(System.in);
	private static ArrayList<Cuenta> cuentas = new ArrayList<>();

	public static void main(String[] args)
	{
		String opcion;
		String numeroCuenta;
		
		do
		{
			System.out.println("--CAJERO--");
			System.out.println("1. Crear cuenta.");
			System.out.println("2. Ingresar a cuenta.");
			System.out.println("3. Salir.");
			System.out.print("Seleccione una opción: ");
			opcion = leer.nextLine();
			
			switch (opcion)
			{
				case "1":
					crearCuenta();
					break;
				case "2":
					System.out.print("\nIngrese el número de cuenta: ");
					numeroCuenta = leer.nextLine();
					Cuenta cuenta = encontrarCuentaPorNumero(numeroCuenta);
					if (cuenta != null)
					{
						System.out.println("\nHola, " + cuenta.nombre + ".\n");
						operaciones(cuenta);
					}
					else
					{
						System.out.println("\nNúmero de cuenta incorrecto.\n");
					}
					break;
				case "3":
					System.out.println("\nAdiós.");
					break;
	
				default:
					System.out.println("\nOpción no válida.\n");
					break;
			}
		} while (!opcion.equals("3"));
	}
	
	
	// Al crear una cuenta nueva ésta es agregara a un ArrayList,
	// y sú número de índice + 1 se usa para identificar la cuenta.
	public static void crearCuenta()
	{
		String nombre;
		System.out.print("\nIngrese su nombre: ");
		nombre = leer.nextLine();
		Cuenta cuenta = new Cuenta(nombre, String.valueOf((cuentas.size()) + 1), 0);
		cuentas.add(cuenta);
		System.out.println("\nEl número de su cuenta es " + cuenta.numero + "\n");
	}
	
	
	// Recibe un número de cuenta y verifica si corresponde a una cuenta registrada.
	// Si es así, entrega la cuenta registrada. De lo contrario, entrega null.
	public static Cuenta encontrarCuentaPorNumero(String numero)
	{
		for (Cuenta cuenta: cuentas)
		{
			if (cuenta.getNumero().equals(numero))
			{
				return cuenta;
			}
		}
		return null;
	}

	
	public static void operaciones(Cuenta cuenta)
	{
		String opcion;
		double monto;
		String numeroDestino;
	
		do
		{
			System.out.println("--OPERACIONES--");
			System.out.println("1. Consultar saldo.");
			System.out.println("2. Depósito.");
			System.out.println("3. Giro.");
			System.out.println("4. Transferencia.");
			System.out.println("5. Salir de la cuenta.");
			System.out.print("Opción: ");
			opcion = leer.nextLine();
			
			switch (opcion)
			{
				case "1":
					System.out.println();
					cuenta.verSaldo();
					System.out.println();
					break;
				case "2":
					System.out.print("\nMonto a depositar: ");
					monto = Double.parseDouble(leer.nextLine());
					cuenta.deposito(monto);
					System.out.println();
					break;
				case "3":
					System.out.print("\nMonto a girar: ");
					monto = Double.parseDouble(leer.nextLine());
					cuenta.giro(monto);
					System.out.println();
					break;
				case "4":
					System.out.print("\nMonto a transferir: ");
					monto = Double.parseDouble(leer.nextLine());
					if (cuenta.getSaldo() < monto)
					{
						System.out.println("\nNo cuenta con saldo suficiente.");
						break;
					}
					
					System.out.print("\nNúmero de cuenta de destino: ");
					numeroDestino = leer.nextLine();
					
					Cuenta cuentaDestino = encontrarCuentaPorNumero(numeroDestino);
					if (cuentaDestino == cuenta)
					{
						System.out.println("\nNo puede realizar transferencias a su propia cuenta.");
					}
					else if (cuentaDestino == null)
					{
						System.out.println("\nCuenta de destino incorrecta.");
					}
					else
					{
						cuenta.transferencia(cuentaDestino, monto);
						System.out.println("\nTransferencia exitosa.");
						cuenta.verSaldo();
					}
					System.out.println();
					break;
				case "5":
					System.out.println();
					break;
				default:
					System.out.println("\nOpción no válida.\n");
					break;
			}
		} while (!opcion.equals("5"));
	}
}