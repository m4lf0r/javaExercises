import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Calculadora IMC");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o seu peso:");
		float peso = scanner.nextFloat();
		
		System.out.println("Digite a sua altura: (Exemplo: 1.68)");
		float altura = scanner.nextFloat();
		
		float IMC = peso / (altura * altura);

        if (IMC >= 30) {
            System.out.println("Consulte um endocrinologista.");
        }  else {
            System.out.println("Seu IMC está normal");
        }
	}
}
