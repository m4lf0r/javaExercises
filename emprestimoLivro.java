import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		final double MULTA = 1.8;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quantidade de dias em atraso: ");
		int dias = scanner.nextInt();
		
		System.out.println("O valor da multa será de: R$" + (MULTA * dias));
		
		scanner.close();
	}
}
