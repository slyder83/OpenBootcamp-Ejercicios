#En este segundo ejercicio, tendréis que crear un archivo py y dentro crearéis una clase Vehículo,
#haréis un objeto de ella, lo guardaréis en un archivo y luego lo cargamos.

import pickle

class Vehiculo:
    marca = ""
    color = ""

    def __init__(self, marca, color):
        self.marca = marca
        self.color = color

    def getMarca(self):
        return self.marca

    def getColor(self):
        return self.color

coche = Vehiculo("Seat", "Negro")
print(coche.getMarca(), coche.getColor())

f = open('datos.bin', 'wb')
pickle.dump(coche, f)
f.close()

f = open('datos.bin', 'rb')
coche2 = pickle.load(f)
f.close()

print(type(coche2))
print(coche2.getMarca())
print(coche2.getColor())