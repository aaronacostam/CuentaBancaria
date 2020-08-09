
public class Main {
	public static void multipleDeposito(CuentaBancaria cta){
		if (cta instanceof CuentaAhorro) {
		cta.deposito(100);
		cta.deposito(200);
		cta.deposito(300);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cta2 = new CuentaCorriente();
		CuentaBancaria cta1 = new CuentaAhorro();
		
		cta1.deposito(800);
		cta2.deposito(500);
		
		//multipleDeposito(cta1);
		//multipleDeposito(cta2);
		
		//cta1.imprimirSaldo();
		
		System.out.println(cta1.getSaldo());
		System.out.println(cta2.getSaldo());

	}

}
