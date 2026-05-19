Algoritmo OrdenacionInsercion
    Definir cantidad, i, j Como Entero
    Definir clave, A Como Real
    
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
    
    Para i = 2 Hasta cantidad Hacer
        clave = A[i]
        j <- i - 1 
        Mientras j >= 1 Y A[j] > clave Hacer
            A[j + 1] = A[j] 
            j = j - 1
        FinMientras
        
        A[j + 1] = clave 
    FinPara
    
    Escribir "Array ordenado:"
    Para i = 1 Hasta cantidad Hacer
        Escribir A[i]
    FinPara
FinAlgoritmo