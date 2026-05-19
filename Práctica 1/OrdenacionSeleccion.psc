Algoritmo OrdenacionSeleccion
    Definir cantidad, i, j, indiceMin Como Entero
    Definir aux, A Como Real
    
    cantidad = 0
    Mientras cantidad <= 0 Hacer
        Escribir "Cantidad de elementos [Mayor que 0]"
        Leer cantidad
    FinMientras
    
    Dimension A[cantidad]
    
    Para i = 1 Hasta cantidad Hacer
        Escribir "Escriba el número para la posición ", i
        Leer A[i]
    FinPara
    
    Para i = 1 Hasta cantidad - 1 Hacer
        indiceMin = i 
        
        Para j = i + 1 Hasta cantidad Hacer
            Si A[j] < A[indiceMin] Entonces
                indiceMin = j
            FinSi
        FinPara
        
        Si indiceMin <> i Entonces
            aux = A[i]
            A[i] = A[indiceMin]
            A[indiceMin] = aux
        FinSi
    FinPara
    
    Escribir "Array ordenado por Selección:"
    Para i = 1 Hasta cantidad Hacer
        Escribir A[i]
    FinPara
FinAlgoritmo