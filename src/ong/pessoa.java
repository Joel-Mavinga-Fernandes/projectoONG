package ong;

import java.util.Scanner;

public class pessoa {
	
	private String nome;
	private int idade;
	private String escola;
	private String endereco;
	private long celular;
	
	public pessoa(String nome, int idade, String escola, String endere�o, long celular) {
		this.nome = nome;
		this.idade = idade;
		this.escola = escola;
		this.endereco = endereco;
		this.celular = celular;
		
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
		
	}
	
		public void cadastro() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		setNome(input.nextLine());
		
		System.out.println("Digite a idade: ");
		setIdade(input.nextInt());
		
		System.out.println("Digite a escola: ");
		setEscola(input.next());
		
		System.out.println("Digite o endere�o: ");
		setEndereco(input.next());
		
		System.out.println("Digite o n�mero de celular: ");
		setCelular(input.nextLong());
		
		dadosDoCadastro ();
	
	}

		
		public void dadosDoCadastro () {
			
			System.out.println("O  nome �: " + nome);
			System.out.println("A idade �: " + idade);
			System.out.println("A sua escola �: " + escola);
			System.out.println("O endere�o �: " + endereco);
			System.out.println("O n�mero de celular �: " + celular);
		}
}
