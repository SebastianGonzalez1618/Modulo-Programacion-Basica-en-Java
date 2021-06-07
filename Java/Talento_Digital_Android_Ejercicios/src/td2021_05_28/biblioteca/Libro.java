package td2021_05_28.biblioteca;

/*
Crea una clase llamada Libro que guarde la información de cada uno
de los libros de una biblioteca.

Atributos:
- título
- autor
- número de ejemplares del libro
- número de ejemplares prestados.

Métodos:
- constructor por defecto.
- Constructor con parámetros.
- Setters y getters.
- prestamo(): incrementa el atributo correspondiente cada vez que se realice
  un préstamo del libro. No se podrá prestar libros de los que no queden
  ejemplares disponibles. Devuelve true si se ha podido realizar la operación
  y false en caso contrario.
- devolucion(): decrementa el atributo correspondiente cuando se produzca
  la devolución de un libro. No se podrá devolver libros que no se hayan prestado.
  Devuelve true si se ha podido realizar la operación y false en caso contrario.
 */

public class Libro
{
	private String titulo;
	private String escritoPor;
	private int cantDisponibles;
	private int cantPrestados;
	
	public Libro() {}
	
	public Libro(String titulo, String autor, int cantDisponibles, int cantPrestados)
	{
		this.titulo = titulo;
		this.escritoPor = autor;
		this.cantDisponibles = cantDisponibles;
		this.cantPrestados = cantPrestados;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public String getAutor()
	{
		return escritoPor;
	}

	public void setAutor(String autor)
	{
		this.escritoPor = autor;
	}

	public int getCantDisponibles()
	{
		return cantDisponibles;
	}

	public void setCantDisponibles(int cantDisponibles)
	{
		this.cantDisponibles = cantDisponibles;
	}

	public int getCantPrestados()
	{
		return cantPrestados;
	}

	public void setCantPrestados(int cantPrestados)
	{
		this.cantPrestados = cantPrestados;
	}

	
	public boolean prestamo()
	{
		if (cantDisponibles > 0)
		{
			--cantDisponibles;
			++cantPrestados;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean devolucion()
	{
		if (cantPrestados > 0)
		{
			++cantDisponibles;
			--cantPrestados;
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	
	@Override
	public String toString()
	{
		return  escritoPor	+ ", " + titulo
				+ " Disponibles: " + cantDisponibles
				+ " Prestados: " + cantPrestados;
	}
	
}
