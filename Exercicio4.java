import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		a = 0;
		b = 1;
		
		System.out.print("Digite um numero:  ");
		int n = ler.nextInt();
		int i = 2;
		
		if (n >= 1) {
			System.out.print(b+"  ");
		}
		
		while (i < n) {
			c = a + b;
		    a = b;
		    b = c;
			
			i = i + 1;
			System.out.print(c+"  ");
		}
		ler.close();
	}

}

