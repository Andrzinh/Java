import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a=0, b=1, c, n, i=2;
		
		System.out.print("Digite um numero:");
		n=ler.nextInt();
		if (n>=1){
			System.out.print(b+"");
		}
		while (i<n){
			c=a+b;
			a=b;
			b=c;
			
			i=i+1;
			System.out.print(c+"");
		}
	}
}

