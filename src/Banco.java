package src;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Agencia> listAgencias = new ArrayList<Agencia>();

	public Banco(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Agencia> getAgencia() {
		return listAgencias;
	}

	public void setAgencia(List<Agencia> agencia) {
		this.listAgencias = agencia;
	}

	public void adicionarAgencia(Agencia agencia){
		this.listAgencias.add(agencia);
	}

	public void imprimirAgencias(){
		System.out.println("--------------------------------");
		System.out.println("Banco: " + this.nome);
		for(Agencia agencia: listAgencias){
			System.out.println("Agencia: " + agencia.getNumero() +
							  " - " + agencia.getNome() +
							  " - " + agencia.getCidade().getCidade());
		}
		System.out.println("--------------------------------");
	}
}
