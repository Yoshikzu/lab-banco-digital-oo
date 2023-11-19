package src;

public class Main {

	public static void main(String[] args) {
		//Cidades
		Cidade saoPaulo = new Cidade(1,"São Paulo","SP");
		Cidade saoCaetanoDoSul = new Cidade(2,"São Caetano do Sul","SP");
		Cidade curitiba = new Cidade(3,"Curitiba","PR");
		Cidade beloHorizonte = new Cidade(4,"Belo Horizonte","MG");

		//Bancos
		Banco itau = new Banco("Itaú");
		Banco nubank = new Banco("Nubank");
		Banco bradesco = new Banco("bradesco");

		//Agencias
		Agencia itauSPCentro = new Agencia(itau,1,"Itaú Centro SP",saoPaulo);
		Agencia itauSCSBoaVista = new Agencia(itau,2,"Itaú Boa Vista",saoCaetanoDoSul);
		Agencia nubankMG = new Agencia(nubank,1,"Nubank MG",beloHorizonte);
		Agencia bradescoPR = new Agencia(bradesco,1,"Bradesco Centro",curitiba);

		itau.adicionarAgencia(itauSPCentro);
		itau.adicionarAgencia(itauSCSBoaVista);
		nubank.adicionarAgencia(nubankMG);
		bradesco.adicionarAgencia(bradescoPR);
		itau.imprimirAgencias();
		nubank.imprimirAgencias();
		bradesco.imprimirAgencias();
		//Clientes
		Cliente marcelo = new Cliente("123.456.789-00","Marcelo","11-99111-5421",saoCaetanoDoSul);
		Cliente daniela = new Cliente("456.221.989-10","Daniela","11-99231-9421",saoCaetanoDoSul);

		//Contas
		Conta ccM = new ContaCorrente(marcelo,itauSCSBoaVista);
		Conta poupancaM = new ContaPoupanca(marcelo,bradescoPR);
		Conta ccD = new ContaCorrente(daniela,itauSPCentro);
		itauSCSBoaVista.adicionarConta(ccM);
		bradescoPR.adicionarConta(poupancaM);
		itauSPCentro.adicionarConta(ccD);

		ccM.depositar(100);
		ccM.transferir(100, poupancaM);
		
		ccM.imprimirExtrato();
		poupancaM.imprimirExtrato();

		ccD.depositar(500);
		ccD.sacar(100);
	}

}
