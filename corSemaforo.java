import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Cor do semáforo");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 1:Verde 2:Amarelo 3:Vermelho");
		int cor = scanner.nextInt();
		
		if (cor == 2 || cor == 3) {
		    System.out.println("PARE!");
		} else {
		    
		}
		
		scanner.close();
	}
}
