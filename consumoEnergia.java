import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    char tipoImovel;
	    int consumoEnergia, residencial, comercial, industrial;
	    double valorTotal, valorAnterior, valorAtual, consumoResidencial, consumoComercial, 
	    consumoIndustrial,valorResidencial, valorComercial, valorIndustrial;
	    final int IMOVEIS = 4;
	    final double VALOR_RESIDENCIAL = 0.50;
	    final double VALOR_COMERCIAL = 0.70;
	    final double VALOR_INDUSTRIAL = 0.40;
	    
	    residencial = 0;
	    comercial = 0;
	    industrial = 0;
	    consumoResidencial = 0;
	    consumoComercial = 0;
	    consumoIndustrial = 0;
	    valorResidencial = 0;
        valorComercial = 0;
        valorIndustrial = 0;
        valorTotal = 0;
	    
		System.out.println("Consumo de energia");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < IMOVEIS; i++) {
		    
		    do{
		    System.out.printf("Digite o tipo residencial da %d° residencia (R), (C) ou (I): ", (i+1));
		    tipoImovel = scanner.next().toUpperCase().charAt(0);
		    if (tipoImovel != 'R' && tipoImovel != 'C' && tipoImovel != 'I'){
		            System.out.println("(R) Para residencial, (C) para Comercial, (I) para industrial.");
		        } 
		    } while(tipoImovel != 'R' && tipoImovel != 'C' && tipoImovel != 'I');
		    
    	    do{
            System.out.printf("Digite o valor anterior do medidor %d: ", (i+1));
            valorAnterior = scanner.nextDouble();
                if(valorAnterior < 0) {
                    System.out.println("Valor anterior do medidor não pode ser negativo");
                } 
            }while(valorAnterior < 0);
            
    	    do{
    	    System.out.printf("Digite o valor atual do medidor %d: ", (i+1));
    	    valorAtual = scanner.nextDouble();
    	        if(valorAtual < valorAnterior){
    	            System.out.println("Valor atual não pode ser menor que o valor anterior");
    	        }
    	    }while(valorAtual < valorAnterior);
		        
		        if(tipoImovel == 'R'){
		            consumoResidencial += valorAtual - valorAnterior;
		            residencial++;
		        }else if(tipoImovel == 'C'){
		            consumoComercial += valorAtual - valorAnterior;
		            comercial++;
		        }else if(tipoImovel == 'I'){
		            consumoIndustrial += valorAtual - valorAnterior;
		            industrial++;
		        }
        	}
		
		scanner.close();
	    
	    System.out.printf("Quantidade de imoveis:\nresidencial: %d Comercial: %d Industrial: %d"
	    , residencial, comercial,industrial);
	    
	    valorResidencial = VALOR_RESIDENCIAL * consumoResidencial;
	    valorComercial = VALOR_COMERCIAL * consumoComercial;
	    valorIndustrial = VALOR_INDUSTRIAL* consumoIndustrial;
	    valorTotal = (valorResidencial + valorComercial) + valorIndustrial;
	    
	    System.out.printf("\nValor total de cada tipo de imovel: \nResidencial: %.2f Cormercial: %.2f Industrial: %.2f", 
	    valorResidencial,valorComercial, valorIndustrial);
	    
	    System.out.printf("\nValor total da conta: %.2f", valorTotal);
	}
}
