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
	}
}
