Actividades del día 4, semana 3.

(Jueves 13 de mayo de 2021)

---

#### 1."La Langosta Ahumada" es una empresa dedicada a ofrecer banquetes. Sus tarifas son las siguientes: el costo de un platillo por persona es de $9500, pero si el número de personas es mayor a 200 pero menor o igual a 300, el costo es de $8500. Para más de 300 personas el costo por platillo es de $7500. Se requiere un programa que ayude a determinar el presupuesto que se debe presentar a las personas que deseen realizar un evento.


```Java
import java.util.Scanner;

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
```

---


#### 2. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de la uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto ésta es de un sólo tipo y tamaño. Se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo A, se le cargan $20 al precio inicial cuando es de tamaño 1 y $30 si es de tamaño 2. Si es de tipo B, se rebajan $30 cuando es de tamaño 1 y $50 cuando es de tamaño 2. Realice un programa para determinar la ganancia obtenida.


```Java
import java.util.Scanner;

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
```

---


#### 3. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada estudiante y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 estudiantes o más, el costo por estudiante es de %6500. De 50 a 99 estudiantes, el costo es de $7000. De 30 a 49, de $9500. Si son menos de 30, el costo de la renta del autobús es de $400000, sin importar el número de estudiantes. Realice un programa que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada estudiante por el viaje.


```Java
import java.util.Scanner;

public class ViajeDeEstudios
{
  public static void main(String[] args)
  {
    int maximo_personas_tarifa_A = 29;
    int maximo_personas_tarifa_B = 49;
    int maximo_personas_tarifa_C = 99;

    int tarifa_A_fija = 400000;
    int tarifa_B_por_persona = 9500;
    int tarifa_C_por_persona = 7000;
    int tarifa_D_por_persona = 6500;

    int estudiantes;
    int costo_total;
    int costo_por_estudiante;
      
    Scanner leer = new Scanner(System.in);
      
    System.out.print("Ingrese cantidad de estudiantes: ");
    estudiantes = Integer.parseInt(leer.nextLine());
      
    if (estudiantes <= maximo_personas_tarifa_A)
    {
      costo_total = tarifa_A_fija;
      costo_por_estudiante = costo_total / estudiantes;
    }
    else if (estudiantes <= maximo_personas_tarifa_B)
    {
      costo_por_estudiante = tarifa_B_por_persona;
      costo_total = estudiantes * costo_por_estudiante;
    }
    else if (estudiantes <= maximo_personas_tarifa_C)
    {
      costo_por_estudiante = tarifa_C_por_persona;
      costo_total = estudiantes * costo_por_estudiante;
    }
    else
    {
      costo_por_estudiante = tarifa_D_por_persona;
      costo_total = estudiantes * costo_por_estudiante;
    }
    
    System.out.println();
    System.out.println("El pago total a la compañía es de $" + costo_total);
    System.out.println("El costo por cada estudiante es de $" + costo_por_estudiante);  
  }
}
```

---


#### 4. La política de la compañía telefónica "Chismefón" es "Chismea + x -". Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, de tal forma que los primeros 5 minutos cuestan $100 cada uno, los siguientes 3, $80, los siguientes 2 minutos $70 y a partir del décimo minuto, $50. Además, se carga un impuesto de 3% cuando es domingo, y si es día hábil, en turno matutino, 15%, y en turno vespertino, 10%. Realice un programa para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.

```Java
import java.util.Scanner;

public class Chismefon
{
  public static void main(String[] args)
  {
    int largo_tramo_A = 5;
    int largo_tramo_B = 3;
    int largo_tramo_C = 2;
    // largo_tramo_D: sin límite

    int costo_minuto_tramo_A = 100;
    int costo_minuto_tramo_B =  80;
    int costo_minuto_tramo_C =  70;
    int costo_minuto_tramo_D =  50;

    double impuesto_domingo = 0.03;
    double impuesto_dia_habil_matutino = 0.15;
    double impuesto_dia_habil_vespertino = 0.1;
    double impuesto = 0;
    double costo_impuesto;
    double costo_final;
    
    int minutos_en_tramo_A = 0;
    int minutos_en_tramo_B = 0;
    int minutos_en_tramo_C = 0;
    int minutos_en_tramo_D = 0;
    int costo_neto;
    
    Scanner leer = new Scanner(System.in);
    
    int minutos;
    String dia;
    String horario = "";
    
    System.out.print("Ingrese la duración de la llamada en minutos: ");
    minutos = Integer.parseInt(leer.nextLine());
    System.out.println("Ingrese el día de la llamada: ");
    System.out.println(" [1] Día hábil.");
    System.out.println(" [2] Domingo.");
    System.out.println(" [3] Otro.");
    System.out.print(" Opción [1, 2, 3]: ");
    dia = leer.nextLine();
    
    if (dia.equals("1"))
    {
      System.out.println("Ingrese el horario de la llamada: ");
      System.out.println(" [M] Matutino.");
      System.out.println(" [V] Vespertino.");
      System.out.print(" Opción [M, V]: ");
      horario = leer.nextLine();  
    }
        
    if (minutos <= largo_tramo_A)
    {
      minutos_en_tramo_A = minutos;
    }
    else
    {
      minutos_en_tramo_A = largo_tramo_A;
      if (minutos <= (largo_tramo_A + largo_tramo_B) )
      {
        minutos_en_tramo_B = minutos - largo_tramo_A;
      }
      else
      {
        minutos_en_tramo_B = largo_tramo_B;
        if (minutos <= (largo_tramo_A + largo_tramo_B + largo_tramo_C) )
        {
          minutos_en_tramo_C = minutos - (largo_tramo_A + largo_tramo_B);
        }
        else
        {
          minutos_en_tramo_C = largo_tramo_C;
          minutos_en_tramo_D = minutos - (largo_tramo_A + largo_tramo_B + largo_tramo_C);
        }
      }
    }
    
    costo_neto =  (minutos_en_tramo_A * costo_minuto_tramo_A)
          + (minutos_en_tramo_B * costo_minuto_tramo_B)
          + (minutos_en_tramo_C * costo_minuto_tramo_C)
          + (minutos_en_tramo_D * costo_minuto_tramo_D);

    if (dia.equals("1"))
    {   
      if (horario.equalsIgnoreCase("M"))
      {
        impuesto = impuesto_dia_habil_matutino;
      }
      else if (horario.equalsIgnoreCase("V"))
      {
        impuesto = impuesto_dia_habil_vespertino;
      }
    }
    
    if (dia.equals("2"))
    {
      impuesto = impuesto_domingo;
    }
    
    costo_impuesto = costo_neto * impuesto;
    costo_final = costo_neto + costo_impuesto;
  
    System.out.println();
    System.out.println("Costo neto de la llamada: $" + costo_neto);
    System.out.println("Impuesto a pagar: $" + costo_impuesto);
    System.out.println("Total a pagar: $" + costo_final);
  }
}
```

---

#### 5. Contar hasta un número ingresado por teclado.

```Java
import java.util.Scanner;

public class Contar
{
  public static void main(String[] args)
  {
    int numero;
    
    Scanner leer = new Scanner(System.in);
    System.out.print("¿Hasta qué número desea contar?: ");
    numero = Integer.parseInt(leer.nextLine());
    
    for (int i = 1; i <= numero; i++)
    {
      System.out.println(i);
    }
  }
}
```

---

#### 6. Calcular promedio de notas ingresadas por teclado.


```Java
import java.util.Scanner;

public class Promedio
{
  public static void main(String[] args)
  {
    double suma = 0;
    int contador = 0;
    double nota;
    double promedio;
    
    Scanner leer = new Scanner(System.in);
    
    do
    {
      System.out.print("Ingrese nota (o valor menor a 1 para terminar): ");
      nota = Double.parseDouble(leer.nextLine());
      
      if (nota >= 1)
      {
        ++contador;
        suma += nota;
      }
      
    } while (nota >= 1);
    
    promedio = suma / contador;
    
    System.out.println("El promedio es: " + promedio);
  }
}
```