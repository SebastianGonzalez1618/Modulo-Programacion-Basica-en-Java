Actividades del día 1, semana 6.

(Lunes 31 de mayo de 2021)

---

Hoy practicamos la herencia en Java. Para indicar que una clase hereda de otra, usamos la palabra `extends`, y para invocar un constructor de la superclase desde una subclase usamos `super()`.

---

### Ejercicio:

Crear una superclase Electrodomestico con sus respectivos atributos y métodos propios de la clase. Luego, a partir de esa clase crear como mínimo 3 subclases.

---

**1. `Electrodomestico.java`**
```Java
public class Electrodomestico
{
	private String marca;
	private String modelo;
	private boolean prendido;
	
	public Electrodomestico(String marca, String modelo)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.prendido = false;
	}

	public String getMarca()
	{
		return marca;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public String getModelo()
	{
		return modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public boolean isPrendido()
	{
		return prendido;
	}

	public void setPrendido(boolean prendido)
	{
		this.prendido = prendido;
	}
	
	public void prender()
	{
		setPrendido(true);
	}
	
	public void apagar()
	{
		setPrendido(false);
	}
	
}

```


**2. Lavadora.java**
```Java
public class Lavadora extends Electrodomestico
{
	private String carga;
	private double capacidad;
	
	public Lavadora(String marca, String modelo, String carga, double capacidad)
	{
		super(marca, modelo);
		this.carga = carga;
		this.capacidad = capacidad;
	}

	public String getCarga()
	{
		return carga;
	}

	public void setCarga(String carga)
	{
		this.carga = carga;
	}

	public double getCapacidad()
	{
		return capacidad;
	}

	public void setCapacidad(double capacidad)
	{
		this.capacidad = capacidad;
	}
	
	public void lavar()
	{
		System.out.println("La lavadora ha terminado de lavar.");
	}
	
	public void enjuagar()
	{
		System.out.println("La lavadora ha terminado de enjuagar.");
	}
	
	public void centrifugar()
	{
		System.out.println("La lavadora ha terminado de centrifugar.");
	}
	
	public void cicloCompleto()
	{
		lavar();
		enjuagar();
		centrifugar();
		System.out.println("La lavadora ha terminado el ciclo completo.");
	}
}

```


**3. Refrigerador.java**
```Java
public class Refrigerador extends Electrodomestico
{
	private int temperaturaMinima;
	private int temperaturaMaxima;
	
	
	public Refrigerador(String marca, String modelo, int temperaturaMinima, int temperaturaMaxima)
	{
		super(marca, modelo);
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
	}


	public int getTemperaturaMinima()
	{
		return temperaturaMinima;
	}


	public void setTemperaturaMinima(int temperaturaMinima)
	{
		this.temperaturaMinima = temperaturaMinima;
	}


	public int getTemperaturaMaxima()
	{
		return temperaturaMaxima;
	}


	public void setTemperaturaMaxima(int temperaturaMaxima)
	{
		this.temperaturaMaxima = temperaturaMaxima;
	}
	
	public void refrigerar()
	{
		System.out.println("Lo que usted puso en el refrigerados se está refrigerando.");
	}
	
	public void congelar()
	{
		System.out.println("Lo que usted puso en el congelador se está congelando.");
	}
	
}
```


**4. AireAcondicionado.java**
```Java
public class AireAcondicionado extends Electrodomestico
{
	private int temperatura;

	public AireAcondicionado(String marca, String modelo, int temperatura)
	{
		super(marca, modelo);
		this.temperatura = temperatura;
	}
	
	
	public int getTemperatura()
	{
		return temperatura;
	}

	public void setTemperatura(int temperatura)
	{
		this.temperatura = temperatura;
	}

	public void subirTemperatura()
	{
		temperatura++;
	}
	
	public void bajarTemperatura()
	{
		temperatura--;
	}	
	
}
```