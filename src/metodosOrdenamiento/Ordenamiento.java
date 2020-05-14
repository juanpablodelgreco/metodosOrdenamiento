package metodosOrdenamiento;

import java.util.Arrays;

public class Ordenamiento {
	private int[] vec;
	
	public Ordenamiento(int[] vec) {
		this.vec = vec;
	}
	//Todos los algoritmos tienen una complegidad de O(N*N)
	//SENSIBLE = MODIFICA SU TIEMPO EN EJECUCION SEGUN EL TIPO DE ENTRADA.
	//ESTABLE = ANTE CLAVES IGUALES MANTIENE EL MISMO ORDEN.
	
	//SENSIBLE-ESTABLE
	//Si el que sigue es menor al actual lo cambia
	public void ordenamientoBurbuja() {
		int i = 0, huboCambio = 1, aux = 0;
		while (i < vec.length - 1 && huboCambio == 1) {
			huboCambio = 0;
			for (int j = 0; j < vec.length - 1; j++) {
				if (vec[j] > vec[j + 1]) {
					aux = vec[j];
					vec[j] = vec[j + 1];
					vec[j + 1] = aux;
					huboCambio = 1;
				}
			}
			i++;
		}
	}
	
	//NO SENSIBLE-NO ESTABLE
	//Elige el menor y lo manda adelante de todo
	public void ordenamientoSeleccion() {
		int menor, aux;
		for (int i = 0; i < vec.length - 1; i++) {
			menor = i;
			for (int j = i + 1; j < vec.length; j++)
				if (vec[j] < vec[menor])
					menor = j;
			aux = vec[i];
			vec[i] = vec[menor];
			vec[menor] = aux;
		}
	}

	//SENSIBLE-ESTABLE
	//ordeno desde una posicion todos los anteriores
	public void ordenamientoInsercion() {
		int actual, aux;
		for (int i = 0; i < vec.length; i++) {
			actual = i;
			for (int j = 0; j < i; j++) {
				if (vec[actual] < vec[j]) {
					aux = vec[actual];
					vec[actual] = vec[j];
					vec[j] = aux;
				}
			}
		}
	}
	
	//NO SENSIBLE -> DEPENDE DE LA ELECCION DEL PIVOTE
	//NO ESTABLE
	 //O(n*log n)
		public static void quicksort(int vec[], int izq, int der) {

			int pivote = vec[izq]; // tomamos primer elemento como pivote
			int i = izq; // i realiza la búsqueda de izquierda a derecha
			int j = der; // j realiza la búsqueda de derecha a izquierda
			int aux;

			while (i < j) { // mientras no se crucen las búsquedas
				while (vec[i] <= pivote && i < j)
					i++; // busca elemento mayor que pivote
				while (vec[j] > pivote)
					j--; // busca elemento menor que pivote
				if (i < j) { // si no se han cruzado
					aux = vec[i]; // los intercambia
					vec[i] = vec[j];
					vec[j] = aux;
				}
			}
			vec[izq] = vec[j]; // se coloca el pivote en su lugar de forma que tendremos
			vec[j] = pivote; // los menores a su izquierda y los mayores a su derecha
			if (izq < j - 1)
				quicksort(vec, izq, j - 1); // ordenamos subarray izquierdo
			if (j + 1 < der)
				quicksort(vec, j + 1, der); // ordenamos subarray derecho
		}

		@Override
		public String toString() {
			return "Ordenamiento [vec=" + Arrays.toString(vec) + "]";
		}
		
		

}
