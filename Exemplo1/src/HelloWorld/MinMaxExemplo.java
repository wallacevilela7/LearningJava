package HelloWorld;
import java.util.Scanner;

public class MinMaxExemplo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Entre com  primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.println("Entre com  segundo valor: ");
		n2 = sc.nextInt();
		
		System.out.println("Entre com  terceiro valor: ");
		n3 = sc.nextInt();
		
		
		int menor, maior;
		
		
		
		if(n1 >= n2 && n1 >= n3) {
			maior = n1;
		} else if(n2 >= n1 && n2 > n3) {
			maior = n2;
		} else {
			maior = n3;
		}
		
		 
		if(n1 <= n2 && n1 <=n3) {
			menor = n1;
		} else if(n2 <= n1 && n2 <= n3) {
			menor = n2;
		} else {
			menor = n3;
		}
		
		System.out.println("O maior numero eh: " + maior);
		System.out.println("O menor numero eh: " + menor);
	}
}
