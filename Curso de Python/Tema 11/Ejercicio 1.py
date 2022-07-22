#En este ejercicio tendréis que crear una tabla llamada Alumnos que constará de tres columnas:
#la columna id de tipo entero, la columna nombre que será de tipo texto y la columna apellido que también será de tipo texto.

#Una vez creada la tabla, tenéis que insertarle datos, como mínimo tenéis que insertar 8 alumnos a la tabla.

#Por último, tienes que realizar una búsqueda de un alumno por nombre y mostrar los datos por consola.

import sqlite3

conn = sqlite3.connect('midb.db')

cursor = conn.cursor()

cursor.execute('CREATE TABLE Alumnos(id INT, nombre TEXT, apellido TEXT)')

cursor.execute('INSERT INTO Alumnos VALUES(1, "Paco", "Garcia")')
cursor.execute('INSERT INTO Alumnos VALUES(2, "Alberto", "Gomez")')
cursor.execute('INSERT INTO Alumnos VALUES(3, "José", "Fernandez")')
cursor.execute('INSERT INTO Alumnos VALUES(4, "Laura", "Martin")')
cursor.execute('INSERT INTO Alumnos VALUES(5, "Maria", "Lupez")')
cursor.execute('INSERT INTO Alumnos VALUES(6, "Antonio", "Albeti")')
cursor.execute('INSERT INTO Alumnos VALUES(7, "Beatriz", "Martinez")')
cursor.execute('INSERT INTO Alumnos VALUES(8, "Carlos", "Candiz")')
cursor.execute('INSERT INTO Alumnos VALUES(9, "Daniela", "Gonzalez")')
cursor.execute('INSERT INTO Alumnos VALUES(10, "Fran", "Mondo")')
cursor.execute('INSERT INTO Alumnos VALUES(11, "Lucia", "Torrez")')

conn.commit()

cursor.execute('SELECT * FROM alumnos WHERE nombre = "Carlos"')

dato = cursor.fetchone()

if dato != None:
    print(dato)
else:
    print("No existe el dato.")

cursor.close()
conn.close()

