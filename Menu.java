package contaBancaria_2;


public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(5004, 16234, 1, " Taina", 25000.00f);

		c1.visualizar();
		c1.setAgencia(456);
		
		System.out.println(c1.getAgencia());

		if (c1.sacar(100))
			;
		System.out.println(" Saque efetuado com sucesso.O novo saldo é de R$: " + c1.getSaldo());
		
		c1.depositar(1000);
		System.out.println("O novo saldo é: " + c1.getSaldo());

	}

}
