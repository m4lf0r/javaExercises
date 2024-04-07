import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		final double SALARIO_MINIMO = 1412;
		double salario, calculoContribuicao;
		int contribuinte;
	    
	    System.out.println("Contribuição sindical.");
	    
	    Scanner scanner = new Scanner(System.in);
		
		do {
		    System.out.println("Qual o seu salário?");
		    salario = scanner.nextDouble();
		    if (salario < SALARIO_MINIMO) {
		        System.out.println("O salário não pode ser menor que 1412");
		    }
		} while(salario < SALARIO_MINIMO);
		
		do {
		  
		    System.out.println("Você é contribuinte sindical? (0 Para NÃO) (1 Para SIM)");
		    contribuinte = scanner.nextInt();
		    if (contribuinte != 0 && contribuinte != 1) {
		        System.out.println("ENTRADA INCORRETA");
		    }
		} while(contribuinte != 0 && contribuinte != 1);
		
	    scanner.close();
		
		calculoContribuicao = salario / 30;
		
		if (contribuinte == 1){
		    System.out.printf("valor da contribuição sindical: R$%.2f\n", calculoContribuicao);
		    System.out.printf("valor do salário liquido mensal: R$%.2f\n", (salario - calculoContribuicao));
		} else {
		    System.out.println("valor da contribuição sindical: NÃO CONTRIBUINTE");
            System.out.printf("valor do salário líquido mensal: R$%.2f\n", salario);
		}
		
	}
}
