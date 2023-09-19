import java.util.Random;


public class Main {

	public static void main(String[] args) {
		Random aleat = new Random();
		
		int v = aleat.nextInt(31);
		System.out.println("Número gerado: " + v);
		
		float v2 = aleat.nextFloat() * 100;
		System.out.println(v2);
	}

}
