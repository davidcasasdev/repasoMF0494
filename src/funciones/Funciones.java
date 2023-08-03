package funciones;

import java.util.Scanner;

import excepciones.MatricesNoCompatiblesException;

public class Funciones {

	public static void pedirMatriz( int m[][] ) {
		Scanner teclado = new Scanner(System.in);
		
		for (int fila = 0; fila < m.length; fila++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.printf("Introduce el elemento (%d,%d): ",fila,col);
				m[fila][col]=teclado.nextInt();
			}
		}
	}
	
	public static void mostrarMatriz(int m[][]) {
		for (int fila = 0; fila < m.length; fila++) {
			for (int col = 0; col < m[0].length; col++) {
				System.out.print(m[fila][col]+"\t");
			}
			System.out.println();
		}
	}
	
	public static int [][] sumaMatrices ( int m1[][], int m2[][]) 
			throws MatricesNoCompatiblesException {
		
		if (m1.length!=m2.length || m1[0].length!=m2[0].length) {
			throw new MatricesNoCompatiblesException();
		}
		
		int res [][] = new int[m1.length][m1[0].length];
		
		for (int fila = 0; fila < m1.length; fila++) {
			for (int col = 0; col < m1[0].length; col++) {
				res[fila][col]=m1[fila][col]+m2[fila][col];
			}
		}
		return res;
	}
	
}
