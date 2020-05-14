package metodosOrdenamiento;

public class Main {
	public static void main(String[] args) {
		int[] vec = { 4, 2, 1, 7,9,11,3,1,5,8,17,1,25,99,191 };
		int[] vec2 = { 3,2,1,10,5};
		Ordenamiento ordenar = new Ordenamiento(vec2);
		System.out.println(ordenar);
		System.out.println();
		ordenar.ordenamientoQuickSort();
		System.out.println();
		System.out.println(ordenar);
	}
}
