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
	public void ordenamientoInsercion(int[] vec) {
		int p, j;
		int aux;
		for (p = 1; p < vec.length; p++) { // desde el segundo elemento hasta
			aux = vec[p]; // el final, guardamos el elemento y
			j = p - 1; // empezamos a comprobar con el anterior
			while ((j >= 0) && (aux < vec[j])) { // mientras queden posiciones y el // valor de aux sea menor que los
				vec[j + 1] = vec[j]; // de la izquierda, se desplaza a
				j--; // la derecha
			}
			vec[j + 1] = aux; // colocamos aux en su sitio
		}
	}
	
	
}
