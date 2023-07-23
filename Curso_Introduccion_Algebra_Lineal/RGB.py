import numpy as np

rojo = [255, 0, 0]
verde = [0, 255, 0]
azul = [0, 0, 255]
negro = [0, 0, 0]

print('concatenar el rojo con el negro resulta en', rojo+negro)

def suma_vectores(a,b):
    return [i+j for i,j in zip(a,b)]

print('suma de los vectores rojo y verde nos devuelve', suma_vectores(rojo,verde))