import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		final double MUDAESTADO = 0.45; // 0.45 == 27 / 60 (Segundos)
		
		System.out.println("Calculando a quantidade de mudanças do semaforo por minuto:");
		System.out.println("Digite a quantidade de minutos: ");
		int minutos = scanner.nextInt();
		double mudaEstado = minutos / MUDAESTADO; //A cada 1 minuto divide por 0.45 que é igual a 27 de 60 Segundos
		
		String resultadoFormatado = String.format("%.0f", mudaEstado); //Formatando para transformar em um "número" inteiro
		System.out.println("O semaforo mudou de estado aproximadamente: " + resultadoFormatado + " Vezes");
		
		scanner.close();
	}
}
