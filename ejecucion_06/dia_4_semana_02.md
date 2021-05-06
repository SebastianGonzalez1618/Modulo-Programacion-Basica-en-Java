Actividades del día 4, semana 2.

(Jueves 6 de mayo de 2021)

---

### Realizar algoritmos en pseudocódigo que resuelvan los siguientes problemas utilizando las tres estructuras que hemos visto (mientras, hacer mientras, para):


#### 1. Mostrar por pantalla los números de 1 al 100 y del 100 al 1.

- #### para
```
    para x = 1 hasta 100
      escribir x
    fin para
	
    para x = 100 hasta 1
      escribir x
    fin para
```

- #### mientras
```
    x = 1
    mientras x >= 1 y x <= 100
      escribir x
      x = x + 1
    fin mientras
	
    mientras x > 1
      x = x - 1
      escribir x
    fin mientras
```

- #### hacer mientras
```
    x = 0
    hacer
      x = x + 1
      escribir x
      mientras x < 100
	
    hacer
      escribir x
      x = x - 1
    mientras  x >= 1	
```


### 2. Sumar sólo los números pares ingresados por una persona (la cantidad de números que se ingresan debe ser determinada por dicha persona).

- #### para
```
    escribir "Ingrese la cantidad de números que quiere ingresar: "
    leer cantidad
    suma = 0
  
    para i = 1 hasta cantidad
      escribir "Ingrese un número: "
      leer numero
      si numero mod 2 = 0
        suma = suma + numero
      fin si
    fin para
  
    escribir "La suma de los números pares ingresados es " + suma + "."
```


- #### mientras
```
    escribir "Ingrese la cantidad de números que quiere ingresar: "
    leer cantidad
    suma = 0
  
    i = 0
    mientras i < cantidad
      escribir "Ingrese un número: "
      leer numero
      si numero mod 2 = 0
        suma = suma + numero
      fin si
      i = i + 1
    fin mientras
  
    escribir "La suma de los números pares ingresados es " + suma + "."
```


- #### hacer mientras
```
    escribir "Ingrese la cantidad de números que quiere ingresar: "
    leer cantidad
    suma = 0
  
    i = 0
    hacer
      escribir "Ingrese un número: "
      leer numero
      si numero mod 2 = 0
        suma = suma + numero
      fin si
      i = i + 1
    mientras i < cantidad
  
    escribir "La suma de los números pares ingresados es " + suma + "."
```


#### 3. Sumar los números pares e impares ingresados por una persona y contar la cantidad de números pares e impares (la cantidad de números que se ingresan debe ser determinado por dicha persona).

```
    escribir "Ingrese la cantidad de números que quiere ingresar: "
    leer cantidad
    
    suma_pares = 0
    suma_impares = 0
    cont_pares = 0
    cont_impares = 0
  
    para i = 1 hasta cantidad
      escribir "Ingrese un número: "
      leer numero
      si numero mod 2 = 0
        con_pares = cont_pares + 1
        suma_pares = suma_pares + numero
      si no
        con_impares = cont_impares + 1
        suma_impares = suma_impares + numero
      fin si
    fin para
	
    escribir "La cantidad de números pares ingresados es " + cont_pares + "."
    escribir "La cantidad de números impares ingresados es " + cont_impares + "."
    escribir "La suma de los números pares ingresados es " + suma_impares + "." 
    escribir "La suma de los números impares ingresados es " + suma_impares + "." 
```


#### 4. Se ingresa una cantidad de números:

> #### - Calcular la suma de todos los números pares ingresados y la multiplicación de los impares ingresados.
> #### - Determinar si de los números ingresados fueron más pares o impares (la cantidad de números que se ingresan debe ser determinada por la persona que ingresa los números).
> #### - Determinar el mayor de los números ingresados.

```
    escribir "Ingrese la cantidad de números a ingresar: "
    leer cantidad
	
    cont_pares = 0
    cont_impares = 0
    suma_pares = 0
    producto_impares = 1
	
    para i = 1 hasta cantidad
      escribir "Ingrese un número: "
      leer numero
	  
      si numero mod 2 = 0
        cont_pares = cont_pares + 1
       	suma_pares = suma_pares + numero
      si no
        cont_impares = cont_impares + 1
        producto_impares = producto_impares * numero
      fin si
      
      si i = 1
        mayor = numero
      si no
        si numero > mayor
          mayor = numero
        fin si
      fin si
    fin para
	
    escribir "La suma de todos los números pares ingresados es " + suma_pares + "."
    escribir "El producto de todos los números impares ingresados es: " + prod_impares + "."
	
    si cont_pares > cont_impares
      escribir "Los números ingresados fueron en su mayoría pares."
    fin si
	
    si cont_pares < cont_impares
      escribir "Los números ingresados fueron en su mayoría impares."
    fin si
	
    si cont_pares = cont_impares
      escribir "Ingresó la misma cantidad de números pares que impares."
    fin si
	
    escribir "El mayor número ingresado es: " + mayor + "."
```