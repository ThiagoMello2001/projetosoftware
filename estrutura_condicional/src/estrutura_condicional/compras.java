package estrutura_condicional;
import java.util.Scanner ;
public class compras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Switch CAse
		// Maquina de Cartão
		//Método de pagamento
		//		1- Dinheiro/pix 10% off
		//		2- Debito 5% off
		//		3- Credito VAlor total
		
		// Valor compra
		
		System.out.println("Informe o valor da sua compra R$: ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Métodos de Pagamento");
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Débito");
		System.out.println("3 - Crédito");
		int metodoPagamento = sc.nextInt();
		
		switch (metodoPagamento){
		
			case 1:
				double valorFinal = valorCompra * 0.9;
				System.out.println("Sua compra ficou R$" + valorFinal);
				break;
			case 2: 
				valorFinal = valorCompra * 0.95;
				System.out.println("Sua compra ficou R$" + valorFinal);
				break;
			case 3:
				System.out.println("Métodos de Pagamento");
				System.out.println("1 - A vista");
				System.out.println("2 - 2x, 5% de juros");
				System.out.println("3 - 3x, 10% de juros");
				int metodoParcelamento = sc.nextInt();
				break;
			default:
				System.out.println("Valor Errado");
			
			
			
				
				
				
				
				
				
				
		}
		sc.close ();

	}

}
