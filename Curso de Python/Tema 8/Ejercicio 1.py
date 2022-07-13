# En este ejercicio, tendréis que crear un archivo py donde creéis un archivo txt, lo abráis y escribáis dentro del archivo.
# Para ello, tendréis que acceder dos veces al archivo creado.

f = open('archivotexto.txt', 'w')
f.write("Prueba de escritura de texto después de crear un archivo.\n")
f.close()

f = open('archivotexto.txt', 'r+')
f.read()
f.write("Escritura por segunda vez.")
f.close()

f= open('archivotexto.txt', 'r')
print(f.read())
f.close()