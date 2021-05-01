Actividades del día 5, semana 1.

(Viernes 30 de abril de 2021)

---

### Elaborar un algoritmo para realizar una compra en una tienda virtual. Determinar además los elementos de entrada y salida.

#### Entrada.

- Dispositivo con acceso a internet.
- Tienda virtual.
- Medio de pago aceptado por la tienda virtual con saldo suficiente.


#### Procesos.

1. Ingresar a la tienda virtual usando el dispositivo con acceso a internet.
2. Buscar productos de interés.
3. Seleccionar productos a comprar.
4. Agregar productos seleccionados al carrito.
5. Ingresar al carrito.
6. Seleccionar la opción de realizar compra.
7. Ingresar información de despacho.
8. Realizar pago usando el medio de pago aceptado por la tienda.
9. Confirmar la compra.

#### Salida.

- Compra en tienda virtual realizada.

---

# Tipos de datos primitivos en Java.

Nombre 	| Tamaño 	| Tipo de datos
-------	|--------	|--------------
byte 	| 1 byte	| Números enteros entre -128 y 127.
short 	| 2 bytes	| Números enteros entre -32768 y 32767.
int 	| 4 bytes	| Números enteros entre -214748368 y 214748367.
long 	| 8 bytes	| Números enteros entre -9223372036854775808 y 9223372036854775807.
float 	| 4 bytes	| Números con decimales con coma flotante.
double 	| 8 bytes	| Números con decimales con coma flotante.
char	| 2 bytes	| 1 carácter Unicode.
boolean	|			| Valores lógicos: verdadero o falso.

---

### Repetir el algoritmo anterior de compra en tienda virtual, ahora incluyendo variables, constantes y tipos de datos.

#### Entrada.

- Dispositivo con acceso a internet.
- Tienda virtual.
- Medio de pago aceptado por la tienda virtual con saldo suficiente.

> ##### Variables.

- String: Nombre de producto.
- int: Precio de cada producto.
- long: Saldo disponible en medio de pago.
- String: Dirección de despacho.

> ##### Constantes.

- double: tasa del IVA.


#### Procesos.

1. Ingresar a la tienda virtual usando el dispositivo con acceso a internet.
2. Buscar productos de interés.
3. Seleccionar productos a comprar.
4. Agregar productos seleccionados al carrito.
5. Ingresar al carrito.
6. Calcular el costo del IVA por cada producto.
7. Sumar el costo de todos los productos, incluyendo el IVA.
8. Seleccionar la opción de realizar compra.
9. Ingresar dirección de despacho.
10. Realizar pago usando el medio de pago aceptado por la tienda.
11. Si el saldo disponible en el medio de pago es superior al total de la compra, confirmar la compra.
12. Si el saldo disponible en el medio de pago es inferior al total de la compra, avisar que la compra no puede realizarse por falta de saldo.

#### Salida.

- Compra en tienda virtual realizada.
