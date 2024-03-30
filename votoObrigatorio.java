import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Analise de voto obrigatorio.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();
		
		if (idade >= 18 && idade <=69) {
		    System.out.println("O voto é obrigatorio.");
		} else {
		    System.out.println("Voto não obrigatorio");
		}
	}
}
