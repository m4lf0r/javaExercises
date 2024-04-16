import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int idade;
		int calculoIdade = 0;
		final int PESSOAS = 5;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= PESSOAS; i++){
		    
		    do {
       		    System.out.printf("Digite a idade da pessoa %d:", i);
    		    idade = scanner.nextInt(); 
		    } while (idade < 0);
		   
		   calculoIdade += idade; 
	    }
	    
	    scanner.close();
	    
	    System.out.println("A média da idade das pessoas são: " + (calculoIdade / PESSOAS) + " Anos");
	}
}

