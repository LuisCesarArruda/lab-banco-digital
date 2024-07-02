
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public double getSaldo() {
		return super.getSaldo();
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor);
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		super.transferir(valor, contaDestino);
	}

	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}


}
