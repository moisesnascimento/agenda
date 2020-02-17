package com.github.moisesnascimento.agenda;

public class Agenda {

	private Pessoa[] pessoas;

	private int pessoasIndex;

	public Agenda() {
		pessoas = new Pessoa[10];
		pessoasIndex = 0;
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		if (pessoasIndex == pessoas.length) {
			return;
		}

		Pessoa pessoa = new Pessoa(nome, idade, altura);
		pessoas[pessoasIndex] = pessoa;
		pessoasIndex++;
	}

	public int getQuantidadePessoas() {
		return pessoasIndex;
	}

	public int buscaPessoa(String nome) {
		int retornaPosicao = 0;
		for (int i = 0; i < pessoasIndex; i++) {
			Pessoa teste = pessoas[i]; // Porque precisa criar uma instancia
			if (nome == teste.getNome()) {
				retornaPosicao = i;
			}
		}
		return retornaPosicao + 1;
	}

	public void imprimirAgenda() {
		for (int i = 0; i < pessoasIndex; i++) {
			Pessoa p = pessoas[i];
			System.out.printf("Nome = %s, idade = %d, altura = %.2f%n", 
					p.getNome(), p.getIdade(), p.getAltura());
		}
	}

	public void removePessoa(String nome) {
		for (int i = 0; i < pessoasIndex ; i++) {
			Pessoa teste = pessoas[i];
			if (nome == teste.getNome()) {
				for (int j = 0; j < pessoasIndex -1; j++) {
					pessoas[i] = pessoas[j + 1];	
				}
			}
		}
		pessoasIndex--;
	}
	
	public void imprimePessoa(int index) {
		for (int i = 0; i < pessoasIndex; i++) {
			Pessoa p = pessoas[i];
			if(index == i) {
				System.out.printf("Nome = %s, idade = %d, altura = %.2f%n",
						p.getNome(), p.getIdade(), p.getAltura());
			}
		}
	}
}

