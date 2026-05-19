Algoritmo MaximoConjuntoNoConocidoV2
	cantidad = 0
	suma = 0
	sumaCuadrada = 0
	continua = Verdadero
	
	Mientras continua Hacer
		
		Escribir "Introduzca un valor"
		Leer valor
			Si -50 <= valor  Y valor <= 50
				cantidad = cantidad + 1
				suma = suma + valor
				sumaCuadrada = sumaCuadrada + valor^2
				Si maximo < valor 
					maximo = valor	
				FinSi
			SiNo
				Si valor == -99
					continue = Falso
				SiNo
					Escribir "El valor está fuera del intervalo [-50, 50]"
				FinSi
			FinSi
			
			
		
	FinMientras 
	
	Si cantidad <> 0
		Escribir "La media equivale a ", media = suma/cantidad
		Escribir "La desviación equivale a ", Raiz(sumaCuadrada/cantidad - media^2)
	FinSi
FinAlgoritmo
