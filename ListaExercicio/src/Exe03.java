import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		int numero1, numero2;
		Scanner sc = new Scanner(System.in); 

		System.out.println("Digite o primeiro n�mero: ");
		numero1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = sc.nextInt();

		if(numero1 > numero2) {
			System.out.println("N�mero um � maior: " + numero1);
			System.out.println("N�mero dois � menor: " + numero2);
		} else if(numero2 > numero1){
			System.out.println("N�mero dois � maior: " + numero2);
			System.out.println("N�mero um � menor: " + numero1);
		}else {
			System.out.println("N�meros iguais!");
		}
	}
}






