package controllers;

import java.util.ArrayList;

import models.Cliente;

public class ClienteController {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();	
	
	public static void cadastrar(Cliente cliente) {
		
	}
	
	public static ArrayList<Cliente> retornarClientes(){
		return clientes;
	}
	
}
