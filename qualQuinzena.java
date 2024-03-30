import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Qual a quinzena do mês?");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o dia do mês:");
		int dia = scanner.nextInt();
		
		if (dia <= 15) {
		    System.out.println("Primeira quinzena do mês");
		} else {
		    System.out.println("Segunda quinzena do mês");
		}
	}
}
