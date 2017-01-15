package br.com.projetohugo;

import br.com.projetohugo.entidade.Usuario;
import br.com.projetohugo.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}
	
	public static void testCadastrar(){
		Usuario usu = new Usuario();
		
		//Criando Usuário
		usu.setNome("João");
		usu.setLogin("jojo");
		usu.setSenha("1234");
		
		//Cadastrando Usuário
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso");
	}
	
	public static void testAlterar(){
		Usuario usu = new Usuario();
		
		//Criando Usuário
		usu.setId(4);
		usu.setNome("João Pedro alvares");
		usu.setLogin("jojosasd");
		usu.setSenha("123asd24");
		
		//Cadastrando Usuário
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Alterado com sucesso");
	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		
		//Criando Usuário
		usu.setId(4);
		
		//Cadastrando Usuário
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Excluido com sucesso");
	}

}
