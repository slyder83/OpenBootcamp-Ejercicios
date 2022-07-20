#En este segundo ejercicio, tendréis que crear una interfaz sencilla la cual debe de contener una lista de elementos
#seleccionables, también debe de tener un label con el texto que queráis.

import tkinter

ventana = tkinter.Tk()

labelTitulo = tkinter.Label(ventana, text='Lista de juegos')
labelTitulo.pack(pady=15)

listaJuegos = ['Resident Evil', 'God of War', 'Spider-Man', 'Metroid', 'Super Mario bros.']
listaItems = tkinter.StringVar(value=listaJuegos)
listbox = tkinter.Listbox(ventana, listvariable=listaItems)
listbox.pack()

ventana.mainloop()