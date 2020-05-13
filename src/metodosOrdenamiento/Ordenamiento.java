package metodosOrdenamiento;

public class Ordenamiento {

	//Todos los algoritmos tienen una complegidad de O(N*N)
	//SENSIBLE = MODIFICA SU TIEMPO EN EJECUCION SEGUN EL TIPO DE ENTRADA.
	//ESTABLE = ANTE CLAVES IGUALES MANTIENE EL MISMO ORDEN.
	
	//SENSIBLE-ESTABLE
	//si el que sigue es menor al actual lo cambia
	public void ordenamientoBurbuja(int[] vec) {
		int i = 1, aux;
		boolean ordenado = false;
		while (i < vec.length && ordenado == false) {
			i++;
			ordenado = true;
			for (int j = 0; j < vec.length - 1; j++) {
				if (vec[j] > vec[j + 1]) {
					ordenado = false;
					aux = vec[j + 1];
					vec[j + 1] = vec[j];
					vec[j] = aux;
				}
			}
		}
	}
	
	//NO ESTABLE-NO SENSIBLE
	//elige el menor y lo manda adelante de todo
	public void ordenamientoSeleccion(int[] vec) {
		int n = vec.length;
		for (int i = 0; i < n - 1; i++) {
			int menor = i;
			for (int j = i + 1; j < n; j++)
				if (vec[j] < vec[menor])
					menor = vec[j];
			int aux = vec[i];
			vec[i] = vec[menor];
			vec[menor] = aux;

		}
	}
	
	//SENSIBLE-ESTABLE
	//ordeno desde una posicion todos los anteriores
	public void OrdenarPorInsercion(int[] vec) {
		int i, j; // Índices sobre la lista.
		int aux; // Variable auxiliar para el intercambio de valores.

		for (i = 1; i < 100; i++) { // ¡Ojo! Empezamos en 1
			aux = vec[i]; // Guardamos el valor a ordenar.
			j = i - 1;
			while ((j >= 0) && vec[j] > aux) // Siempre que sea mayor que aux.
				// ordenamos de menor a mayor.
				vec[j + 1] = vec[j--]; // Trasladamos el valor y movemos el indice.
			vec[j + 1] = aux; // Ponemos el valor a ordenar en su sitio.
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

}
