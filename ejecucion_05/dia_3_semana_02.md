Actividades del día 3, semana 2.

(Miércoles 5 de mayo de 2021)

---

### Crear algoritmos en pseudocódigo para resolver los siguientes problemas:

#### 1. Determinar si un número ingresado es par o impar.

```
    escribir "Ingrese un número: "
    leer numero
    si numero mod 2 = 0
    	escribir numero + " es par."
    si no
    	escribir numero + " es impar."
    fin si
```


#### 2. Determinar si un número ingresado es o no múltiplo de 3.

```
    escribir "Ingrese un número: "
    leer numero
    si numero mod 3 = 0
    	escribir numero + " es múltiplo de 3."
    si no
	    escribir numero + " no es múltiplo de 3."
    fin si
```


#### 3. Determinar cuál es el mayor de 2 números ingresados.

```
    escribir "Ingrese un número: "
    leer num1
    escribir "Ingrese otro número: "
    leer num2
	
    si num1 > num2
      escribir num1 + " es mayor que " + num2 + "."
    si no
      si num2 > num1
        escribir num2 + " es mayor que " + num1 + "."
      si no
        escribir num1 + " y " + num2 + " son iguales."
      fin si
    fin si
```


#### 4.  Determinar si la suma de dos números ingresados es positiva, negativa o cero.

```
    escribir "Ingrese un número: "
    leer num1
    escribir "Ingrese otro número: "
    leer num2
	
    suma = num1 + num2
	
    si suma > 0
      mensaje = "positiva"
    si no
      si suma < 0
        mensaje = "negativa"
      si no
    mensaje = "cero"
      fin si
    fin si
	
    escribir "La suma de " + num1 + " y " + num2 + " es " + suma + " (" + mensaje + ")."
```


#### 5. Indicar si un número es divisible por 2 y por 5 al mismo tiempo.

```
    escribir "Ingrese un número: "
    leer num
    si num mod 10 = 0
      escribir num + " es divisible por 2 y por 5."
    fin si
	
```


#### 6. Determinar cuál es el mayor de 3 números ingresados.

```
    escribir "Ingrese el primer número: "
    leer num1
    escribir "Ingrese el segundo número: "
    leer num2
    escribir "Ingrese el tercer número: "
    leer num3
	
    mayor = num1
	
    si num2 > mayor
      mayor = num2
    fin si
    si num3 > mayor
      mayor = num3
    fin si
	
    escribir "El numero mayor es " + mayor + "."
```

#### 7.Solicitar ingresar dos números y seleccionar una operación matemática. Realizar la operación matemática seleccionada con los números entregados.

```
    escribir "Ingrese un número: "
    leer num1
    escribir "Ingrese otro número: "
    leer num2
	
    escribir "Seleccione una operación [+,-,*,/]: "
    leer operacion
    operacion_valida = verdadero
	
    segun operacion
      caso "+"
        resultado = num1 + num2
      caso "-"
        resultado = num1 - num2
      caso "*"
        resultado = num1 * num2
      caso "/"
        si num2 = 0
    	  operacion_valida = falso
          escribir "La división por 0 no está definida."
        si no
          resultado = num1 / num2
        fin si
    fin segun
	
    si operacion_valida
      escribir "El resultado es: " + resultado
    fin si
```