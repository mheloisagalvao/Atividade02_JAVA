import java.util.Locale;
import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int vetores = 10;
		int vetorA[]= new int[vetores];
		int vetorB[] = new int[vetores];
		int i = 0; 
		
		int intercalacao[] =  new int[vetores*2];
		int j = 0; 
		
		for (i = 0; i < vetores; ++i) {
			System.out.printf("Digite o " + (i+1) + "º valor da sequência A: ");
			vetorA[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (i = 0; i < vetores; ++i) {
			System.out.printf("Digite o " + (i+1) + "º valor da sequência B: ");
			vetorB[i] = Integer.parseInt(sc.nextLine());
		}
		
		for (i = 0; i < vetores; ++i) {
			intercalacao[j] = vetorA[i];
			j++;
			intercalacao[j] = vetorB[i];
			j++;
		}
		
		System.out.println("Intercalação: ");
		for (j = 0; j < (vetores*2) ; j++) {
			System.out.println(intercalacao[j]);
		}
		
		sc.close();
	}

}
