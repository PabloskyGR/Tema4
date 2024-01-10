package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable donde guardaremos la suma total de los números de la tabla
		int suma = 0;

		// Variable donde guardaremos los números que vaya introduciendo el usuario
		int num;

		// Creamos una tabla de tipo entero y con uan longitud de 10
		int tabla[] = new int[10];

		// Bucle for donde iremos guardando en la tabla los números que vaya
		// introduciendo el usuario
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Dime un número:");
			num = sc.nextInt();
			tabla[i] = num;
		}

		// Bucle donde iremos recorriendo la tabla e iremos sumando los valores de cada
		// posición
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}

		// Mostramos la suma de los valores de cada posición
		System.out.println(suma);

		// Cerramos el scanner
		sc.close();

	}

}
