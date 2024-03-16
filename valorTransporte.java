import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		final int VALORPESSOA = 2;
		final int VEICULOPASSEIO = 10; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quantidade de pessoas:");
		int pessoas = scanner.nextInt();
		int valorPessoas = VALORPESSOA * pessoas;
		
		System.out.println("Valor total de pessoas   : R$" + valorPessoas);
		System.out.println("Valor total do transporte: R$" + (valorPessoas + VEICULOPASSEIO));
		
		scanner.close();
	}
}
