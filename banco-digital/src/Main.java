public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Nome Cliente da Conta Corrente");

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Nome Cliente da Conta Poupança");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta pp = new ContaPoupanca(cliente2);

		cc.depositar(100);
		// cc.transferir(100, pp);
		
		cc.imprimirExtrato();
		pp.imprimirExtrato();
	}

}
