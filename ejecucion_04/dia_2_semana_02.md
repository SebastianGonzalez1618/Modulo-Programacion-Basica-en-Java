Actividades del día 2, semana 2.

(Martes 4 de mayo de 2021)

---

### Pseudocódigo.

  En cada ejercicio, determinar las variables y/o constantes involucradas.


#### 1. Realizar un algoritmo en pseudocódigo que permita sumar dos números.

```
    declarar variable numero1
    declarar variable numero2
    declarar variable suma
    escribir "Ingrese un número: "
    leer numero1
    escribir "Ingrese otro número: "
    leer numero2
    suma = numero1 + numero 2
    escribir "La suma de " + numero1 + " y " + numero2 + "es: " + suma
```


#### 2. Realizar un algoritmo en pseudocódigo que permita calcular el promedio de 3 notas.

```
    declarar variable nota1
    declarar variable nota2
    declarar variable nota3
    declarar variable promedio
    escribir "Ingrese primera nota: "
    leer nota1
    escribir "Ingrese segunda nota: "
    leer nota2
    escribir "Ingrese tercera nota: "
    leer nota3
    promedio = (nota1 + nota2 + nota3) / 3
    escribir "El promedio es: ", promedio
```


#### 3. Realizar un algoritmo en pseudocódigo que permita calcular el cuadrado de un número.

```
    declarar variable numero
    declarar variable cuadrado
    escribir "Ingrese un numero: "
    leer numero
    cuadrado = numero * numero
    escribir "El cuadrado de ", numero, " es: ", cuadrado
```


#### 4. Realizar un algoritmo en pseudocódigo para resolver el siguiente problema. Suponga que un individuo desea invertir un capital en un banco y desea saber cuánto dinero ganará después de un mes si el banco le paga a razón de 2% mensual.

```
    declarar variable monto_inicial
    declarar constante interes = 0,02
    declarar variable monto_final
    escribir "Ingrese monto inicial: "
    leer monto inicial
    monto_final = monto_inicial * (1 + interes)
    escribir "El monto final será de: ", monto_final
```


#### 5. Realizar un algoritmo en pseducodigo que pida ingresar el modelo y la marca de un vehículo y me muestre los datos ingresados

```
    declarar variable marca
    declarar variable modelo
    escribir "Ingrese marca del vehículo: "
    leer marca
    escribir "Ingrese modelo del vehículo: "
    leer modelo
    escribir "La marca del vehículo es: " + marca
    escribir "El modelo del vehículo es: " + modelo
```


#### 6. Realizar un algoritmo en pseudocódigo que permita calcular el porcentaje solicitado de un número ingresado.

```
    declarar variable numero
    declarar variable porcentaje
    declarar variable resultado
    escribir "Ingrese un número: "
    leer numero
    escribir "Ingrese el porcentaje a calcular: "
    leer porcentaje
    resultado = numero * (porcentaje / 100)
    escribir "El resultado final es: " + resultado
```


#### 7. Realizar un algoritmo en pseudocódigo para resolver el siguiente problema: un vendedor recibe un sueldo base más un 10% de comisión de sus ventas. El vendedor desea saber cuánto dinero obtendrá por concepto de comisiones por tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.


```
    declarar variable sueldo_base
    declarar variable venta1
    declarar variable venta2
    declarar variable venta3
    declarar variable ventas_totales
    declarar constante tasa_comision = 0,1
    declarar variable valor_comision
    declarar variable sueldo_final

    escribir "Ingrese sueldo base: "
    leer sueldo_base
    escribir "Ingrese valor de venta 1: "
    leer venta1
    escribir "Ingrese valor de venta 2: "
    leer venta2
    escribir "Ingrese valor de venta 3: "
    leer venta3
    valor_comision = (venta1 + venta2 + venta3) * tasa_comision
    sueldo_final = sueldo_base + valor_comision
    escribir "Su sueldo final es: ", sueldo_final
```


#### 8. Realizar un algoritmo que intercambie el valor de dos variables. Por ejemplo, al inicio del problema los valores de las variables son A=2 y B=3, y al final del algoritmo A=3 y B=2

```
    declarar A
    declarar B
    declarar temporal
    escribir "Ingrese un valor para A: "
    leer A
    escribir "Ingrese un valor para B: "
    leer B
    temporal = B
    B = A
    A = temporal
    escribir "Ahora el valor de A es " + A + "."
    escribir "Ahora el valor de B es " + B + "."
```


#### 9. Hacer el mismo ejercicio anterior, pero sin usar una variable auxiliar.

```
    declarar A
    declarar B
    escribir "Ingrese un valor para A: "
    leer A
    escribir "Ingrese un valor para B: "
    leer B
    A = A + B
    B = A - B
    A = A - B
```