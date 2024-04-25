import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double peso, valorFinal = 0, valorPorPeso;
	    char tipo;
	    final double VALOR_PESO = 3, VALOR_LOCAL = 10, TAXA_ESTADUAL = 0.8, TAXA_INTERESTADUAL = 1.5;
	    
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Calculo do frete");
		
		System.out.printf("Peso da encomenda em KG:");
		peso = scanner.nextFloat();
		valorPorPeso = VALOR_PESO * peso;
		
		do {
		System.out.printf("\nTipo de deslocamento(L)local, (E)Estadual ou (I)interestadual:");
		tipo = scanner.next().toUpperCase().charAt(0);
		
		if (tipo != 'L' && tipo != 'E' && tipo != 'I'){
		    System.out.println("Tipo de deslocamento inválido.");
		}else if(tipo == 'L'){
		    valorFinal = VALOR_LOCAL;
		}else if(tipo == 'E'){
		    valorFinal = VALOR_LOCAL * TAXA_ESTADUAL + VALOR_LOCAL;
		}else{
		    valorFinal = VALOR_LOCAL * TAXA_INTERESTADUAL + VALOR_LOCAL;
		}
		
		}while(tipo != 'L' && tipo != 'E' && tipo != 'I');
		
		scanner.close();
		
		valorFinal = valorFinal + valorPorPeso;
		
		System.out.printf("Valor final do frete: %.2f", valorFinal);
	}
}
