package td2021_05_27_fecha;

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

 La clase que llama a Fecha se llama ValidarFecha.

 - Como extra, ya que el programa confirma si el año es bisiesto para validar
 la fecha, también muestra ese dato por pantalla.
 */

public class Fecha
{
	private int dia;
	private int mes;
	private int anio;
		
	public Fecha()	{}
	
	public Fecha(int dia, int mes, int anio)
	{
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public void setDia(int dia)
	{
		this.dia = dia;
	}
	
	public int getDia()
	{
		return dia;
	}
	
	public void setMes(int mes)
	{
		this.mes = mes;
	}
	
	public int getMes()
	{
		return mes;
	}
	
	public void setAnio(int anio)
	{
		this.anio = anio;
	}
	
	public int getAnio()
	{
		return anio;
	}
	
	public boolean fechaCorrecta()
	{
		boolean diaCorrecto = true;
		boolean mesCorrecto = true;
		boolean anioCorrecto = true;
				
		if (mes < 1 || mes > 12)
		{
			mesCorrecto = false;
		}
		
		if (anio == 0 || mes <= 0 || dia <= 0)
		{
			anioCorrecto = false;
		}
		
		switch (mes)
		{
			case 2:
				if (dia == 29)
				{
					if (!this.esBisiesto())
					{
						diaCorrecto = false;
					}
				}
				else if (dia > 28)
				{
					diaCorrecto = false;
				}
				break;
			case 4: case 6: case 9: case 11:
				if (dia > 30)
				{
					diaCorrecto = false;
				}
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (dia > 31)
				{
					diaCorrecto = false;
				}
				break;
			default:
				mesCorrecto = false;
		}
		return (diaCorrecto && mesCorrecto && anioCorrecto);
	}

	public void diaSiguiente()
	{
		++dia;
		if (!fechaCorrecta())
		{
			dia = 1;
			mes++;
			if (!fechaCorrecta())
			{
				mes = 1;
				anio++;
			}
			
		}
	}
	
	
	/*
		Año bisiesto es el divisible entre 4,
		salvo que sea año secular -último de cada siglo, terminado en «00»-,
		en cuyo caso también ha de ser divisible entre 400.
	 */
	public boolean esBisiesto()
	{
		return ( (anio % 4 == 0) && (anio % 100 != 0) ) || (anio % 400 == 0);

	}
	
	@Override
	public String toString()
	{
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio"
							, "julio", "agosto", "septiembre", "octubre"
							, "noviembre", "diciembte"};
		return dia + " de " + meses[mes - 1] + " de " + anio + "."; 
	}
}
