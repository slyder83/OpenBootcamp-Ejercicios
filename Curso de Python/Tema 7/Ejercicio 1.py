#En este ejercicio tendréis que crear un módulo que contenga las operaciones básicas de una calculadora: sumar, restar, multiplicar y dividir.
#Este módulo lo importaréis a un archivo python y llamaréis a las funciones creadas. Los resultados tenéis que mostrarlos por consola.

import Operaciones

res1 = Operaciones.Sumar(145, 75)
print("La suma es", res1)

res2 = Operaciones.Restar(7, 8)
print("La resta es", res2)

res3 = Operaciones.Multiplicar(4, 8)
print("La multiplicación es", res3)

res4 = Operaciones.Dividir(55, 5)
print("La división es", res4)