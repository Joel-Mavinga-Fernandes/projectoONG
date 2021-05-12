package ong;

import java.util.Scanner;

public class pessoa {
	
	private String nome;
	private int idade;
	private String escola;
	private String endereco;
	private long celular;
	
	public pessoa(String nome, int idade, String escola, String endereço, long celular) {
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
		
		System.out.println("Digite o endereço: ");
		setEndereco(input.next());
		
		System.out.println("Digite o número de celular: ");
		setCelular(input.nextLong());
		
		dadosDoCadastro ();
	
	}

		
		public void dadosDoCadastro () {
			
			System.out.println("O  nome é: " + nome);
			System.out.println("A idade é: " + idade);
			System.out.println("A sua escola é: " + escola);
			System.out.println("O endereço é: " + endereco);
			System.out.println("O número de celular é: " + celular);
		}
}
