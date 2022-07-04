#Escribe un programa capaz de mostrar todos los números impares desde un número de inicio y otro final.

#Por ejemplo: teniendo numero_inicial = 2 y numero_final = 8, el programa debe imprimir por consola: [3, 5, 7]

contadorInicial = 2
contadorFinal = 8

while contadorInicial <= contadorFinal:
    if contadorInicial % 2 != 0:
        print(contadorInicial, " es un numero impar")

    contadorInicial += 1