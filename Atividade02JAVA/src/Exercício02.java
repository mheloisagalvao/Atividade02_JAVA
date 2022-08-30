import java.util.Locale;
import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int i, maisVendido = 0, quant[]= new int[10];
		double valorTotal = 0, valorParcial, valor[]= new double[10];

		    for(i = 0; i < 10; i++){
		        System.out.printf ("Digite valor unitário do " + (i+1) + "º objeto: ");
		        valor[i] = Integer.parseInt(sc.nextLine());
		        
		        System.out.printf ("Digite a quantidade vendida do " + (i+1) + "º objeto: ");
		        quant[i] = Integer.parseInt(sc.nextLine());
		    }
		    
		    
		    for(i = 0; i < 10; i++){
		        valorParcial = quant[i] * valor[i];
		        System.out.printf ("Vendido: %d\tValor unitário R$%.2f\tValor total R$%.2f\n", quant[i], valor[i], valorParcial);
		        valorTotal += valorParcial;
		    }
		    
		    System.out.printf ("\nVALOR GERAL das vendas foi de R$%.2f\n", valorTotal); 
		    System.out.printf ("\nCOMISSÃO paga ao vendedor R$%.2f\n", valorTotal * 0.05);

		    for(i = 0; i < 10; i++){
		        if(quant[i] > maisVendido)
		            maisVendido = quant[i];
		    }

		    for(i = 0; i < 10; i++){
		        if(quant[i] == maisVendido){
		        	System.out.printf ("\nO objeto mais vendido está na posição %d\nPelo valor de R$%.2f\n", i, valor[i]);
		        }
		    }

		sc.close();
	}

}
