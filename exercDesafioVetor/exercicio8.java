import java.util.Scanner;
public class exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final int TAM = 20;
		int i, a[], b[];
		a = new int[TAM];
		b = new int[TAM];

		for (i = 0; i < TAM; i++) {
			System.out.print("Entre com o " + (i + 1) + "o. número:");
			a[i] = in.nextInt();
			if (a[i] % 2 == 0) {
				b[i] = a[i];
				System.out.println("Par.");
			} else {
				System.out.println("Impar.");
			}

		}
	}
}
