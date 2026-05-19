Algoritmo MaximoConjuntoConocido
    Definir cantidad, i Como Entero
    Definir maximo, temperatura Como Real
    
    cantidad = 0
    Mientras cantidad <= 0 Hacer
        Escribir "Introduce la cantidad de temperaturas (mayor a 0):"
        Leer cantidad
    FinMientras
    
    Escribir "Introduzca la temperatura 1:"
    Leer temperatura
    maximo = temperatura
    
    Para i = 2 Hasta cantidad Con Paso 1 Hacer
        Escribir "Introduzca la temperatura ", i, ":"
        Leer temperatura
        
        Si temperatura > maximo Entonces
            maximo = temperatura
        FinSi
    FinPara
    
    Escribir "La temperatura máxima es: ", maximo
FinAlgoritmo