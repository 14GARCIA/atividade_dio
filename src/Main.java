public class Main {

    public static void main(String[] args) {
       
        Banco banco = new Banco();
        banco.setNome("Banco Central");

      
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        venilton.setCpf("123.456.789-00"); 
        venilton.setNumero("123456789");   

         Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
		
		/*Conta contaBuscada = banco.buscarContaPeloNumero(cc.getNumero());
        if (contaBuscada != null) {
            System.out.println("Conta encontrada: " + contaBuscada.getNumero());
        } else {
            System.out.println("Conta não encontrada.");
        }*/

        ((ContaCorrente) cc).aplicarTaxaManutencao(5); 
        System.out.println("Saldo após taxa de manutenção:");
        cc.imprimirExtrato();
	}}

