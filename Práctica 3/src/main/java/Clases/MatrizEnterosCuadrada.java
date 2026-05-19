package Clases;

import java.util.Random;

public class MatrizEnterosCuadrada {

	private int[][] matriz;

	public MatrizEnterosCuadrada(int n) {
		matriz = new int[n][n];
		Random dado = new Random();

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				matriz[i][j] = dado.nextInt(100);

	}

	public MatrizEnterosCuadrada(int[][] otraMatriz) {
		int n = otraMatriz.length;
		matriz = new int[n][n];

		for (int i = 0; i < n; i++)
			System.arraycopy(otraMatriz[i], 0, matriz[i], 0, n);

	}

	public int[][] getMatriz() {
		return matriz;
	}

	public static void ordenaSeleccion(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < n; j++)
				if (array[j] < array[minIndex])
					minIndex = j;

			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}


	public MatrizEnterosCuadrada matrizOrdenadaPorFilas() {
		int n = matriz.length;

		int[][] nueva = new int[n][n];

		for (int i = 0; i < n; i++) {
			nueva[i] = matriz[i].clone();

			ordenaSeleccion(nueva[i]);
		}

		return new MatrizEnterosCuadrada(nueva);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int[] fila : matriz) {
			for (int val : fila) {
				sb.append(String.format("%3d ", val));
			}
			sb.append("\n");
		}

		return sb.toString();
	}
}