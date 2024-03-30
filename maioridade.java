import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Maioridade:");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a idade:");
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
		    System.out.println("Maior de idade.");
	    } else {
	        System.out.println("Menor de idade.");
        }
	}
}
