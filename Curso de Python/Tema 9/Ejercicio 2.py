#En este segundo ejercicio, tenéis que crear una aplicación que obtendrá los elementos impares de una lista pasada
#por parámetro con filter y realizará una suma de todos estos elementos obtenidos mediante reduce.

from functools import reduce

listaNumeros = list(range(72))

def impares(x):
    if x % 2 == 0:
        return False
    return True

resultado = list(filter(impares, listaNumeros))

def suma(a, b):
    return a + b

resFinal = reduce(suma, resultado)

print(resFinal)