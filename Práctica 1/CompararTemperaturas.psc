Algoritmo CompararTemperaturas
    Leer t1, t2, t3
    
    Si t1 == t2 Y t2 == t3 Entonces
        Escribir "Las tres temperaturas son iguales"
    SiNo 
        Si t1 == t2 Entonces
            Escribir "Hay dos temperaturas iguales: primera y segunda"
        SiNo Si t2 == t3 Entonces
				Escribir "Hay dos temperaturas iguales: segunda y tercera"
			SiNo Si t1 == t3 Entonces
					Escribir "Hay dos temperaturas iguales: primera y tercera"
				SiNo
					Escribir "Las tres temperaturas son distintas"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo