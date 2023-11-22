import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=0, x, exp;
		long n=1;
		
		System.out.println("Digite o numero");
		x = ler.nextInt();
		System.out.println("Digite o expoente");
		exp = ler.nextInt();
		while(i<exp){
			 n *= x;
             i++;
		}
		 System.out.println("A potência de " + x + " é " + n);
	}
}
