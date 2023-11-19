package src;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private Banco banco;
    private int numero;
    private String nome;
    private Cidade cidade;
    private List<Conta> contas = new ArrayList<Conta>();

    public Agencia(Banco banco, int numero, String nome, Cidade cidade) {
        this.banco = banco;
        this.numero = numero;
        this.nome = nome;
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
