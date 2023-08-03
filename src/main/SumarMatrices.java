package main;

import java.util.Scanner;

import excepciones.MatricesNoCompatiblesException;
import funciones.Funciones;

public class SumarMatrices {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Program aque suma dos matrices");
		
		
		int filas=0, cols=0; 
		do {
			System.out.println("introduce las filas (debe ser positivo): ");
			filas = teclado.nextInt();
		} while (filas<=0 );
		do {
			System.out.println("introduce las columnas: ");
			cols = teclado.nextInt();
		} while (cols <=0);
		
		int m1 [][] = new int [filas][cols];
		System.out.println("introduce la matriz 1");
		Funciones.pedirMatriz(m1);
		
		int m2 [][] = new int [filas][cols];
		System.out.println("introduce la matriz 2");
		Funciones.pedirMatriz(m2);
		
		System.out.println("La matriz 1 es ");
		Funciones.mostrarMatriz(m1);
		
		System.out.println("La matriz 2 es ");
		Funciones.mostrarMatriz(m2);
		
		try {
			int m3 [][] = Funciones.sumaMatrices(m1,m2);
			
			System.out.println("La matriz suma es ");
			Funciones.mostrarMatriz(m3);
		} catch (MatricesNoCompatiblesException e) {
			
		}
		
		
		
		
		
	}
}
