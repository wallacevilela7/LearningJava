package revisao2;
import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		
		String str = sc.nextLine();
		
		System.out.println("Olá, " + str);
		
		System.out.println("Digite um numero");
		int n1 = sc.nextInt();
		
		System.out.println("Numero digitado: "+ n1);
		
		sc.close();
	}

}
