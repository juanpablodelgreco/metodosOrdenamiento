package metodosOrdenamiento;

public class Main {
	public static void main(String[] args) {
		Ordenamiento ordenar = new Ordenamiento();
		int[] vec = {3,1,2,6,4,5};
		for(int v : vec)
			System.out.print(v);
		System.out.println();
		System.out.println("---------------");
		//ordenar.ordenamientoBurbuja(vec);
		//ordenar.ordenamientoSeleccion(vec);
		ordenar.ordenamientoInsercion(vec);
		for(int v : vec)
			System.out.print(v);
		System.out.println();
		  int arr[] = {10, 7, 8, 9, 1, 5}; 
	        int n = arr.length; 
	        ordenar.quickSort(arr, 0, n-1);
	   
			for(int v : arr)
				System.out.print(v);
	 
	    } 
	}
