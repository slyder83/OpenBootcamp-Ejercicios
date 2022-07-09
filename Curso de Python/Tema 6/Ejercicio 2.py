#En este segundo ejercicio, tendréis que crear un programa que tenga una clase llamada Alumno
#que tenga como atributos su nombre y su nota. Deberéis de definir los métodos para inicializar sus atributos,
#imprimirlos y mostrar un mensaje con el resultado de la nota y si ha aprobado o no.

class Alumno:
    def inicializar(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def imprimir(self):
        print("Nombre del alumno:", self.nombre)
        print("Nota del examen:", self.nota)

    def resultado(self):
        if self.nota > 4:
            print("Examen aprobado")
        else:
            print("Examen suspendido")

alumno1 = Alumno()
alumno2 = Alumno()
alumno3 = Alumno()
alumno4 = Alumno()

alumno1.inicializar("Juan", 5)
alumno2.inicializar("Alejandro", 7)
alumno3.inicializar("Paula", 8)
alumno4.inicializar("Alberto", 4)

alumno1.imprimir()
alumno1.resultado()
alumno2.imprimir()
alumno2.resultado()
alumno3.imprimir()
alumno3.resultado()
alumno4.imprimir()
alumno4.resultado()