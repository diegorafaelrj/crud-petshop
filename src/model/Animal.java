package model;

public class Animal {

	private String nome;
	private Cliente dono;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getDono() {
		return dono;
	}

	public void setDono(Cliente dono) {
		this.dono = dono;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return "Animal [nome=" + nome + ", dono=" + dono + ", idade=" + idade + "]";
	}

}
