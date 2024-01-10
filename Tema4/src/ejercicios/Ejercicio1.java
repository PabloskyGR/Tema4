package ejercicios;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos un nuevo objeto de tipo random
		Random random = new Random();

		// Creamos una tabla de tipo entero con una longitud de 10
		int numerosAleatorios[] = new int[10];

		// Con un bucle for recorremos la tabla añadiendole un número aleatorio a cada
		// posición
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = random.nextInt(100) + 1;
		}

		// Mostramos un mensaje antes de mostrar los números
		System.out.println("Los números dentro de la tabla son:  ");
		System.out.print("[ ");

		// Con otro bucle for vamso recorriendo la tyabla y mostrando el valor de cada
		// posición
		for (int i = 0; i < numerosAleatorios.length; i++) {
			System.out.print(numerosAleatorios[i] + " ");
		}

		System.out.print("]");

	}

}
