Algoritmo Taxi
	Definir kilometros Como Real
	Repetir
		Escribir "Kilómetros recorridos :"
		Leer kilometros
	Hasta Que kilometros > 0
	
	Si kilometros <= 30 Entonces
		Escribir "Cantidad a pagar: ", 30 
	SiNo 
		Si kilometros <= 100 Entonces
			Escribir "Cantidad a pagar: ", 30 + 15*(kilometros-30)
		SiNo
			Escribir "Cantidad a pagar: ", 30 + (70 * 15) + 10*(kilometros-100) 
		FinSi
	FinSi
	
FinAlgoritmo
