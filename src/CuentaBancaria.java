public abstract class CuentaBancaria {
	private String propietario;
	
	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	protected double saldo;
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}

	public abstract void deposito(double dinero);
	
	public void retiro(double dinero) {
		saldo -= dinero;
	}
}
