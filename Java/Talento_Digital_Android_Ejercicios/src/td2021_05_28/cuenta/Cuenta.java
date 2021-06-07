package td2021_05_28.cuenta;

/*
Crear una clase Cuenta para representar una cuenta bancaria.

Los datos de la cuenta son:
- nombre del cliente (String)
- número de cuenta (String)
- saldo (double).

Sus métodos son:
- Constructor por defecto.
- Constructor con todos los parámetros.
- Setters y getters.
- Depósito.
- Giro. Debe comprobar que haya saldo suficiente.
- Transferencia. Permite pasar dinero de una cuenta a otra, siempre que
en la cuenta de origen haya dinero suficiente para poder hacerlo.
 */

public class Cuenta {
	String nombre;
	String numero;
	double saldo;
	
	public Cuenta()	{}
	
	public Cuenta(String nombre, String numero, double saldo)
	{
		this.nombre = nombre;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNumero(String numero)
	{
		this.numero = numero;
	}
	
	public String getNumero()
	{
		return numero;
	}
	
	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}
	
	public double getSaldo()
	{
		return saldo;
	}

	
	public void verSaldo()
	{
		System.out.println("Su saldo es: " + this.getSaldo());
	}
	
	public void deposito(double monto)
	{
		if (monto < 0)
		{
			System.out.println("No puede depositar montos negativos.");
		}
		else
		{
			this.setSaldo(this.getSaldo() + monto);
			this.verSaldo();
		}
	}
	
	public void giro(double monto)
	{
		this.verSaldo();
		if (monto < 0)
		{
			System.out.println("No puede girar montos negativos.");
		}
		else
		{
			if (monto > this.getSaldo())
			{
				System.out.println("No cuenta con saldo suficiente.");
			}
			else
			{
				this.setSaldo(this.getSaldo() - monto);
			}
		}
	}
	
	
/*
Transferencia. Permite pasar dinero de una cuenta a otra, siempre que
en la cuenta de origen haya dinero suficiente para poder hacerlo.
 */

	public void transferencia(Cuenta destino, double monto)
	{
		if (monto < 0)
		{
			System.out.println("No puede transferir montos negativos.");
		}
		else
		{
			this.setSaldo(this.getSaldo() - monto);
			destino.setSaldo(destino.getSaldo() + monto);
		}
	}
	
}