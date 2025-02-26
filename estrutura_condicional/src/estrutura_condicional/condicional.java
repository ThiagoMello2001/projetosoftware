package estrutura_condicional;
import java.util.Scanner ;
public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a 1º Nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a 2º Nota: ");
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2)/2;

		if(media >= 7) {
			System.out.println("Aprovado: " + media);
		}
		else if(media >= 5 && media <= 6.9 ) {
			System.out.println("Recuperação: " + media);
			
			
			System.out.println("Insira a nota da recuperação: ");
			double recuperação = sc.nextDouble();
			double mediaFinal = (media + recuperação)/2;
			
			if (mediaFinal >= 7 && mediaFinal <=10) {
				System.out.println("Aprovado! media: " + mediaFinal);
			}
		
			else {
				System.out.print("reprovado");
				
				
			}
		}
			
	sc.close();	
}

};
