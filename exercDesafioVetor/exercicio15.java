public class exercicio15 {
	  public static void main(String[] args) {
	       
	        final int TAM= 5;
	        int i, a[], t, j;
	        a = new int[TAM];
	        
	        for(i=0; i < TAM; i++){
	        a[i] = i+1;
	        for(j=1; j<=10; j++){
	        System.out.println("O valores da tabuada do " +(i + 1)+ " são: " +a[i]+" x " +j+ "=" +(t=j*a[i]));
	        System.out.println();
	        }
	        }
	    }
	}

