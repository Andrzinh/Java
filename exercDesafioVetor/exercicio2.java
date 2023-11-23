import java.util.*;
public class exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int[] A = new int[TAM];
		int[] B = new int[TAM];
		int[] C = new int[TAM];
		int k = 0;
		
		System.out.println("escreva 10 numeros para o conjunto A: ");
		for (int i = 0; i < TAM; i++) {
			A[i] = in.nextInt();
		}
		System.out.println("escreva 10 numeros para o conjunto B: ");
		for (int i = 0; i < TAM; i++) {
			B[i] = in.nextInt();
			in.close();
		}

		for (int i = 0; i < TAM; i++) {
			int j;
			for (j = 0; j < TAM; j++) {
				if (A[i] == B[j]) {
					break;
				}
			}
			if (j == TAM) {
				C[k] = A[i];
				k++;
			}
		}

		System.out.println("Vetor C (diferença dos conjuntos A e B): ");
		for (int i = 0; i < k; i++) {
			System.out.print(C[i] + " ");
		}
	}
}
