from django.db import models

# Create your models here.

class Director(models.Model):
    nombre = models.CharField(max_length=25, help_text="Nombre del director")
    apellido = models.CharField(max_length=50, help_text="Apellidos del director")
    fecha_nacimiento = models.DateField()
    fecha_defuncion = models.DateField(null= True, blank = True)

    def __str__(self):
        return self.nombre + " " + self.apellido

class Pelicula(models.Model):
    director = models.ForeignKey('Director', on_delete=models.CASCADE)
    nombre = models.CharField(max_length=25, help_text="Titulo de la pelicula")
    sinopsis = models.TextField(help_text="Resumen de la pelicula")
    duracion = models.PositiveIntegerField()
    year = models.PositiveIntegerField()

    def __str__(self):
        return self.nombre
