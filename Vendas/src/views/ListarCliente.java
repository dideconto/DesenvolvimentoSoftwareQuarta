package views;

import java.util.ArrayList;

import models.Cliente;

public class ListarCliente {
	
	public static void renderizar(ArrayList<Cliente> clientes){
		System.out.println("\n".repeat(15));
		System.out.println("\n-- LISTAR CLIENTES --\n");
		for (Cliente clienteCadastrado : clientes) {
			System.out.println(clienteCadastrado);
		}
	}
	
}
