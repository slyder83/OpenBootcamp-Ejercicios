#Escribe una función que calcule el área de un triángulo, recibiendo la altura y la base como parámetros
# y otra función que calcule el área de un círculo recibiendo el radio del mismo.

def areaTriangulo(y, x):
    return (y * x) / 2

resultado = areaTriangulo(25.2, 65.3)
print("El area del triangulo es ", resultado)

def areaCirculo(r):
    pi = 3.141592
    return pi * r **2

resultado2 = areaCirculo(25.2)
print("El area del circulo es ", resultado2)