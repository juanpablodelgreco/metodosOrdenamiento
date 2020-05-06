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
	
	
	
	
	 public int partition(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1); // index of smaller element 
	        for (int j=low; j<high; j++) 
	        { 
	            // If current element is smaller than the pivot 
	            if (arr[j] < pivot) 
	            { 
	                i++; 
	  
	                // swap arr[i] and arr[j] 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        // swap arr[i+1] and arr[high] (or pivot) 
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	    } 
	  
	//NO SENSIBLE -> DEPENDE DE LA ELECCION DEL PIVOTE
	//NO ESTABLE
	 //O(n*log n)
	 public void quickSort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            /* pi is partitioning index, arr[pi] is  
	              now at right place */
	            int pi = partition(arr, low, high); 
	  
	            // Recursively sort elements before 
	            // partition and after partition 
	            quickSort(arr, low, pi-1); 
	            quickSort(arr, pi+1, high); 
	        } 
	    } 
	 
//	 public void sort(int arr[], int left, int right){
//		    if(left < right){
//		      //Encuentra el punto medio del vector.
//		      int middle = (left + right) / 2;
//		      
//		      //Divide la primera y segunda mitad (llamada recursiva).
//		      sort(arr, left, middle);
//		      sort(arr, midddle+1, right);
//
//		      //Une las mitades.
//		      merge(arr, left, middle, right);
//		    }
//		}
//	 
//	 public void merge(int arr[], int left, int middle, int right) {
//		  //Encuentra el tamaño de los sub-vectores para unirlos.
//		  int n1 = middle - left + 1;
//		  int n2 = right - middle;
//
//		  //Vectores temporales.
//		  int leftArray[] = new int [n1];
//		  int rightArray[] = new int [n2];
//
//		  //Copia los datos a los arrays temporales.
//		  for (int i=0; i < n1; i++) {
//		    leftArray[i] = arr[left+i];
//		  }
//		  for (int j=0; j < n2; j++) {
//		    rightArray[j] = arr[middle + j + 1];
//		  }
//		  /* Une los vectorestemporales. */
//
//		  //Índices inicial del primer y segundo sub-vector.
//		  int i = 0, j = 0;
//
//		  //Índice inicial del sub-vector arr[].
//		  int k = left;
//
//		  //Ordenamiento.
//		  while (i < n1 && j < n2) {
//		    if (leftArray[i] <= rightArray[j]) {
//		      arr[k] = leftArray[i];
//		      i++;
//		    } else {
//		        arr[k] = rightArray[j];
//		        j++;
//		    }
//		    k++;
//		  }//Fin del while.
//
//		  /* Si quedan elementos por ordenar */
//		  //Copiar los elementos restantes de leftArray[].
//		  while (i < n1) {
//		    arr[k] = leftArray[i];
//		    i++;
//		    k++;
//		  }
//		  //Copiar los elementos restantes de rightArray[].
//		  while (j < n2) {
//		    arr[k] = rightArray[j];
//		    j++;
//		    k++;
//		  }
//		}
	
}
