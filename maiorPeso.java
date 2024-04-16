import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    double peso;
    double maiorPeso = 0;
    int pessoa;
    final int PESSOAS_MAXIMO = 4;
    
    Scanner scanner = new Scanner(System.in);
    
    for(int i = 1; i<= PESSOAS_MAXIMO; i++) {
        
        do {
        System.out.printf("Digite o peso da pessoa %d:", i);
        peso = scanner.nextDouble();
        } while (peso <= 0);
        
        if (peso > maiorPeso){
        maiorPeso = peso;
        }
    }
    
    scanner.close();
    
    System.out.printf("O maior peso foi: %.2f\n", maiorPeso);
    
	}
}
