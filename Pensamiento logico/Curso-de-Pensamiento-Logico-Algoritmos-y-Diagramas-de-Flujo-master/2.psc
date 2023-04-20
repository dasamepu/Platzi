Algoritmo Verificar_dinero_en_el_cajero
	Escribir 'Esta en el cajero?'
	Estar_cajero <- falso
	Mientras Estar_cajero=falso Hacer
		Escribir 'no está en el cajero'
		Escribir 'llendo al cajero...'
		Estar_cajero <- Verdadero
	FinMientras
	Escribir 'Ya en el cajero'
	Escribir 'pidiendo dinero...'
	Escribir 'Tiene dinero el cajero?'
	dinero_suficiente <- falso
	Escribir 'el cajero no tiene dinero suficiente'
	Mientras dinero_suficiente=falso Hacer
		Escribir 'ir a otro cajero'
		Estar_otro_cajero <- falso
		Mientras Estar_otro_cajero=falso Hacer
			Escribir 'no está en el otro cajero'
			Escribir 'llendo al cajero...'
			Estar_otro_cajero <- Verdadero
		FinMientras
		Escribir 'Ya en el cajero'
		Escribir 'pidiendo dinero...'
		Escribir 'Tiene dinero el cajero?'
		dinero_suficiente <- Verdadero
		Escribir 'este otro cajero sí tiene dinero suficiente'
	FinMientras
	Escribir 'retirando el dinero...'
	Escribir 'dinero retirado'
FinAlgoritmo
