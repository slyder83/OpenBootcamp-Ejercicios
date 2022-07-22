from django.shortcuts import render

from django.views import generic

from .models import *

def index(request):
    num_director = Director.objects.all().count()
    num_peliculas = Pelicula.objects.all().count()

    return render(
        request,
        'index.html',
        context={
            'num_director': num_director,
            'num_peliculas': num_peliculas
        }
    )