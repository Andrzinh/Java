public class exercicio9 {
	public static void main(String[] args) {

		final int TAM = 10;
		int i, a[], b[];
		a = new int[TAM];
		b = new int[TAM];

		for (i = 0; i < TAM; i++) {
			a[i] = i + 1;
			System.out.println("Vetor A[ " + a[i] + " ].");

			if (a[i] % 2 == 0) {
				b[i] = 1;
				System.out.println("Par. Vetor B[ " + b[i] + " ].");
			} else {
				b[i] = 0;
				System.out.println("Impar. Vetor B[ " + b[i] + " ].");
			}
			System.out.println();
		}
	}
}
