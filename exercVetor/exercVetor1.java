package listaExercVetor;
import java.util.Scanner;
public class exercVetor1 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM=10;
        int a[],b[],i;
        a = new int[TAM];
        b = new int[TAM];
        for(i=0;i<TAM;i++){
            System.out.println("Digite o "+(i+1)+"° Numero:");
            a[i]=ler.nextInt();
            b[i]=a[i]*a[i];
        }
        System.out.print("\nC =");
        for(i=0;i<TAM;i++){
            System.out.print(b[i]+ "");
        }
    }
}
