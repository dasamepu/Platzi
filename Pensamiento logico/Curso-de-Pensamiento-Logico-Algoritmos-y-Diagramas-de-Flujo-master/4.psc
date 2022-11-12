Algoritmo Login
	Repetir
		Escribir 'Ingrese Usuario'
		Leer usuario
		Si usuario = 'MyUser' Entonces
			Escribir ''
		SiNo
			Escribir 'Este usuario no está en nuestra base de datos'
			Escribir 'Ingrese el usuario otra vez'
		FinSi
	Hasta Que usuario='MyUser'
	Repetir
		Escribir 'Ingrese contraseña'
		Leer contraseña
		Si contraseña='MyPassword' Entonces
			Escribir ''
		SiNo
			Escribir 'Contraseña incorrecta'
			Escribir 'Ingresela otra vez'
		FinSi
	Hasta Que contraseña='MyPassword'
	Escribir 'Bienvenido'
FinAlgoritmo
