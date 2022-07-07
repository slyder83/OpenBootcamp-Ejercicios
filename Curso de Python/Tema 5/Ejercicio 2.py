#Escribe una función que pueda decirte si un número (número entero) es primo o no.

def numeroPrimo(num):
    if num < 2:
        return False

    elif num == 2:
        return True

    else:
        for i in range(2, num):
            if (num % i) == 0:
                return False
        return True

resultado = numeroPrimo(19)
print(resultado)