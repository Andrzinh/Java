import java.util.Scanner;
public class exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final int TAM = 10;
		int i, a[], n;
		a = new int[TAM];
		for (i = 0; i < TAM; i++) {
			System.out.print("Entre com o " + (i + 1) + "°. número:");
			a[i] = in.nextInt();
		}
		for (i = 0; i < TAM; i++) {
			System.out.println("Elemento " + (i + 1) + " do vetor A: " + a[i]);
			System.out.println(" Pares de 0 até o elemento " + a[i] + ": ");

			for (n = 0; n <= a[i]; n++) {
				if (n % 2 == 0) {
					System.out.println(n + " ");
				}
				System.out.println();
			}
		}
	}
}
