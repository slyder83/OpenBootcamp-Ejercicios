#En este segundo ejercicios tendréis que crear un script que nos diga si es la hora de ir a casa.
#Tendréis que hacer uso del modulo time. Necesitaréis la fecha del sistema y poder comprobar la hora.
#En el caso de que sean más de las 7, se mostrará un mensaje y en caso contrario, haréis una operación para calcular el tiempo que queda de trabajo.

import time

horaLocal = time.localtime()
horas = time.strftime("%H", horaLocal)
minutos = time.strftime("%M",horaLocal)

print("Local time:", time.ctime())

if horas >= "19":
    print("No estas trabajando")
else:
    print("Aun te quedan por trabajar: {}:{}". format(18 - int(horas), 59 - int(minutos)))