import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	
	
	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		do {
			System.out.println("\n-- PROJETO DE VENDAS --\n");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR CLIENTE --\n");
				System.out.println("Digite o nome do cliente:");
				cliente.setNome(sc.next());
				System.out.println(cliente.getNome());
				clientes.add(cliente);
//				System.out.println("Digite o CPF do cliente:");
//				cpf = sc.nextLine();
				break;
			case 2:
				System.out.println("\n-- LISTAR CLIENTES --\n");
				System.out.println(clientes);
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}			
		} while (opcao != 0);
		
		sc.close();
		
	}

}
