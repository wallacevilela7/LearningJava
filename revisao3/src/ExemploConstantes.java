import java.util.Scanner;


public class ExemploConstantes {
	
	private static final double Largura = 10.0;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o comprimento: ");
		double cmp = sc.nextDouble();
		
		double area = calcularArea(Largura, cmp);
		System.out.println("A area eh : " + area);
	}
	
	private static double calcularArea(double largura, double comprimento) {
		return largura * comprimento;
	}
}
