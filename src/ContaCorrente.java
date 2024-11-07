
public class ContaCorrente extends Conta {
	
	public void aplicarTaxaManutencao(double taxa) {
		this.sacar(taxa);
	}
	

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
