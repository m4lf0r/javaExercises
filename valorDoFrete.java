import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double peso, valorFinal = 0, valorPorPeso;
	    char tipo;
	    final double VALOR_PESO = 3, VALOR_LOCAL = 10, PCT_ESTADUAL = 0.8, PCT_INTERESTADUAL = 1.5;
	    
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
		    valorFinal = VALOR_LOCAL + valorPorPeso;
		}else if(tipo == 'E'){
		    valorFinal = (VALOR_LOCAL + valorPorPeso);
		    valorFinal += valorFinal * PCT_ESTADUAL;
		}else{
		    valorFinal = VALOR_LOCAL + valorPorPeso;
		    valorFinal += valorFinal * PCT_INTERESTADUAL;
		}
		
		}while(tipo != 'L' && tipo != 'E' && tipo != 'I');
		
		scanner.close();
		
		System.out.printf("Valor final do frete: %.2f", valorFinal);
	}
}
