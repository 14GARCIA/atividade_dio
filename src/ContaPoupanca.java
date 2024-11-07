
public class ContaPoupanca extends Conta {
	double TAXADERENDIMENTO=0.03;
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void aplicarRendimentoMensal(double TAXADERENDIMENTO) {
		this.saldo += this.saldo * TAXADERENDIMENTO;
	}
	
	public void sacarComNotificacao(double valor) {
		System.out.println("Sacando da poupança...");
		this.sacar(valor);
	}
	

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}

	
}
