import java.util.Locale;
import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);

	    int v[] = new int[10], i, soma = 0, menor = v[0], maior = v[0];

	    for (i = 0; i < 10; ++i) {
	      System.out.printf("Informe o " + (i+1) + "º valor: ");
	      v[i] = sc.nextInt();
	    }

	    for (i = 0; i < 10; ++i) {
	      soma = soma + v[i];

	      if (v[i] < menor)
	         menor = v[i];

	      if (v[i] > maior)
	         maior = v[i];
	    }

	    System.out.printf("\nSoma = %d\n", soma);
	    System.out.printf("\nMédia = %d\n", soma/10);
	    System.out.printf("\nMaior número = %d\n", maior);
	    System.out.printf("\nMenor número = %d\n", menor);

		sc.close();
	}

}
