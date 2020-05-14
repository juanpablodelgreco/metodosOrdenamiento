package metodosOrdenamiento;

public class Main {
	public static void main(String[] args) {
		int[] vec = { 4, 2, 1, 7,9,11,3,1,5,8,17,1,25,99,191 };
		int[] vec2 = { 1,2,3,4,5,6,7};
		Ordenamiento ordenar = new Ordenamiento(vec);
		ordenar.ordenamientoInsercion();
		System.out.println(ordenar);
	}
}
