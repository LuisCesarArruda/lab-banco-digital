
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		super.transferir(valor, contaDestino);
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor);
	}

	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}

	public void gerarCheque(double valor){
		System.out.println("chegue gerado no valor de " + valor);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}


}
