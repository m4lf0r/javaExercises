import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		final int PESSOAS = 7;
		char sexo;
		int masculino = 0;
		int feminino = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= PESSOAS; i++) {
		    
		    do{
		        System.out.printf("Digite o sexo da pessoa %d (M)Masculino (F)Feminino: ", i);
		        sexo = scanner.next().toUpperCase().charAt(0);
		    } while(sexo != 'F' && sexo != 'M');
		    
		    if (sexo == 'M') {
		        masculino++;
		    }else {
		        feminino++;
		    }
		    
		}
		
		System.out.printf("A quantidade de pessoas do sexo masculino são %d", masculino);
		System.out.printf("\nA quantidade de pessoas do sexo feminino são %d", feminino);
	}
}
