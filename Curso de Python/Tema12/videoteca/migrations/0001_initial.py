# Generated by Django 4.0.6 on 2022-07-22 21:16

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Director',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nombre', models.CharField(help_text='Nombre del director', max_length=25)),
                ('apellido', models.CharField(help_text='Apellidos del director', max_length=50)),
                ('fecha_nacimiento', models.DateField()),
                ('fecha_defuncion', models.DateField(blank=True, null=True)),
            ],
        ),
        migrations.CreateModel(
            name='Pelicula',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('nombre', models.CharField(help_text='Titulo de la pelicula', max_length=25)),
                ('sinopsis', models.TextField(help_text='Resumen de la pelicula')),
                ('duracion', models.PositiveIntegerField()),
                ('year', models.PositiveIntegerField()),
                ('director', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='videoteca.director')),
            ],
        ),
    ]
