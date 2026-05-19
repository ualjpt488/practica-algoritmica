Algoritmo ClasificarHuracanes
	Definir velocidad Como Entero
	Escribir "Ingrese la velocidad del viento:"
	Leer velocidad 
	
	Si velocidad < 119 Entonces
		Mostrar "Categoría no identificada"
	SiNo
		Si velocidad <= 153 Entonces
			Mostrar "Categoría 1. Daños mínimos"
		SiNo
			Si velocidad <= 177 Entonces
				Mostrar "Categoría 2. Daños moderados"
			SiNo
				Si velocidad <= 209 Entonces
					Mostrar "Categoría 3. Daños extensos"
				SiNo
					Si velocidad <= 250 Entonces
						Mostrar "Categoría 4. Daños extremos"
					SiNo
						Mostrar "Categoría 5. Daños catastróficos"
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi	
FinAlgoritmo