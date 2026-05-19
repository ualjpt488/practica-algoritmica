Algoritmo ÁreaTriángulo
	Definir a, b, c Como Entero
	Repetir
		Escribir "Ingrese el lado A: "
		Leer a
	Hasta Que a > 0
	Repetir
		Escribir "Ingrese el lado B: "
		Leer b
	Hasta Que b > 0
	Repetir
		Escribir "Ingrese el lado C: "
		Leer c
	Hasta Que c > 0
	
	Si a + b > c y a + c > b  y b + c >a
		s = (a + b + c) / 2
		area = rc(s *(s - a) * (s - b) * (s - c))
		Escribir "Es un triángulo válido. El área es: ", area
    SiNo
        Escribir "Estas medidas no pueden formar un triángulo."
	FinSi
	
FinAlgoritmo
