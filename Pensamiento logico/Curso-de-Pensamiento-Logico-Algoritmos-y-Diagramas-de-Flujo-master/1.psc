Algoritmo encender_luz
	Escribir 'Luz encendida?'
	luz <- falso
	Si luz=falso Entonces
		Escribir 'Interruptor encendido?'
		interruptor <- falso
		Si interruptor=falso Entonces
			Escribir 'Encendiendo interruptor'
			interruptor <- verdadero
			Escribir 'Interruptor encendido'
			Escribir 'Encendiendo luz'
			luz <- verdadero
		SiNo
			Escribir 'Interruptor encendido y luz apagada?'
			Escribir 'Hay que arreglar la luz'
		FinSi
	FinSi
	Si luz=verdadero Entonces
		Escribir 'Luz encendida'
	FinSi
FinAlgoritmo
