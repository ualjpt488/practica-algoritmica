package Clases;

import java.util.Random;

public class Subsecuencia {
    private int[] array;

    private int primer;
    private int ultimo;
    private int suma;

    public Subsecuencia(int numeroElementos) {
        this.array = new int[numeroElementos];
        Random dado = new Random();
        for (int i = 0; i < numeroElementos; i++) {
            this.array[i] = dado.nextInt(199) - 99; //Esto va desde el 0 hasta el 198, restamos 99 para que el rango sea de -99 a 99
        }
    }

    public Subsecuencia(int[] arrayEnteros) {
        this.array = arrayEnteros.clone(); 
    }

    public int getPrimer() { return primer; }
    public int getUltimo() { return ultimo; }
    public int getSuma() { return suma; }
    
    public void maxSubsecuenciaSum() {
        this.suma = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) 
                    currentSum += array[k];
                
                if (currentSum > this.suma) {
                    this.suma = currentSum;
                    this.primer = i;
                    this.ultimo = j;
                }
            }
        }
    }

    public void SubsecuenciaMejorado() {
        this.suma = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;
            for (int j = i; j < array.length; j++) {
                currentSum += array[j];
                if (currentSum > this.suma) {
                    this.suma = currentSum;
                    this.primer = i;
                    this.ultimo = j;
                }
            }
        }
    }

    public void SubsecuenciaLineal() {
        this.suma = Integer.MIN_VALUE;
        int currentSum = 0;
        int tempStart = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];

            if (currentSum > this.suma) {
                this.suma = currentSum;
                this.primer = tempStart;
                this.ultimo = i;
            }

            if (currentSum < 0) {
                tempStart = i + 1;
                currentSum = 0;
            }
        }
    }
}