import tkinter
from tkinter import ttk

ventana = tkinter.Tk()

ventana.columnconfigure(0, weight=1)
ventana.columnconfigure(1, weight=5)

def reset():
    return numeros.set(0)

numeros = tkinter.StringVar()

rBNone = ttk.Radiobutton(ventana, text='None', value='0',variable=numeros)
rB1 = ttk.Radiobutton(ventana, text='1', value='1', variable=numeros)
rB2 = ttk.Radiobutton(ventana, text='2', value='2', variable=numeros)
rB3 = ttk.Radiobutton(ventana, text='3', value='3', variable=numeros)
rB4 = ttk.Radiobutton(ventana, text='4', value='4', variable=numeros)
rB5 = ttk.Radiobutton(ventana, text='5', value='5', variable=numeros)

rB1.grid(column=1, row=1, padx=10, pady=10)
rB2.grid(column=1, row=2, padx=10, pady=10)
rB3.grid(column=1, row=3, padx=10, pady=10)
rB4.grid(column=1, row=4, padx=10, pady=10)
rB5.grid(column=1, row=5, padx=10, pady=10)

botonReinicio = tkinter.Button(ventana, text='Reiniciar', command=reset, padx=10, pady=10)
botonReinicio.grid(column=1)

ventana.mainloop()