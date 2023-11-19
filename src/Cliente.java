package src;

public class Cliente {

	private String cpf;
	private String nome;
	private String numeroTelefone;
	private Cidade cidade;

	public Cliente(String cpf, String nome, String numeroTelefone, Cidade cidade) {
		this.cpf = cpf;
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
