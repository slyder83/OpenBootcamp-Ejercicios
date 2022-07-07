#Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.

year = int(input("¿Escribe un año? "))

def bisiesto(year):
    if year % 4 != 0:
        return False
    elif year % 4 == 0 and year % 100 != 0:
        return True
    elif year % 4 == 0 and year % 100 == 0 and year % 400 != 0:
        return False
    elif year % 4 == 0 and year % 100 == 0 and year % 400 == 0:
        return True

resultado = bisiesto(year)

if resultado == True:
    print(year, "es un año bisiesto.")
else:
    print(year, "no es un año bisiesto.")