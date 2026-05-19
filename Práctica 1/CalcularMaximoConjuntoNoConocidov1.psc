Algoritmo MaximoConjuntoNoConocidov1
	Escribir "Introduzca un valor"
	Leer maximo
	continua = Verdadero
	
	Mientras continua Hacer
		
		Escribir "Introduzca un valor"
		Leer valor
		Si valor  > -999
			Si maximo < valor 
				maximo = valor	
			FinSi
		SiNo
			Si valor == -999
				continue = Falso
			FinSi
		FinSi
		
	FinMientras 
FinAlgoritmo
