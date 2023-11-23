import java.util.Scanner;
public class exercico14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int TAM = 10;
		int[] A = new int[TAM];
		int[] B = new int[TAM];

		for (int i = 0; i < TAM; i++) {
			System.out.print("Digite o valor de A[" + i + "]: ");
			A[i] = ler.nextInt();
		}
		int somatorio = 0;
		for (int i = TAM - 1; i >= 0; i--) {
			somatorio += A[i];
			B[i] = somatorio;
		}
		System.out.println("Vetor B (Somatório):");
		for (int i = 0; i < TAM; i++) {
			System.out.println("B[" + i + "] = " + B[i]);
		}
		ler.close();
	}
}
