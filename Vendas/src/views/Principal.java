package views;
import java.util.ArrayList;
import java.util.Scanner;

import models.Cliente;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		Scanner sc = new Scanner(System.in);
		Cliente cliente;
		
		do {
			System.out.println("\n-- PROJETO DE VENDAS --\n");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("0 - Sair\n");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
//				System.out.println("\n".repeat(15));
//				cliente = new Cliente();
//				System.out.println("\n-- CADASTRAR CLIENTE --\n");
//				System.out.println("Digite o nome do cliente:");
//				cliente.setNome(sc.nextLine());
//				System.out.println("Digite o CPF do cliente:");
//				cliente.setCpf(sc.nextLine());
//				boolean clienteEncontrado = false;				
//				if(clientes.size() > 0){					
//					for (Cliente clienteCadastrado : clientes) {
//						if(clienteCadastrado.getCpf().equals(cliente.getCpf())) {
//							System.out.println("Esse cliente já existe!");
//							clienteEncontrado = true;
//							break;
//						}
//					}						
//					if(!clienteEncontrado) {
//						clientes.add(cliente);
//						System.out.println("Cliente cadastrado com sucesso!");
//					}
//				}else {			
//					clientes.add(cliente);
//					System.out.println("Cliente cadastrado com sucesso!");
//				}
				break;
			case 2:
				ListarCliente.renderizar();
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
