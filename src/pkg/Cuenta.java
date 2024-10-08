package pkg;

public class Cuenta {
	
	static Double saldo;
	
	public Cuenta(String string, String string2, Double saldo) {
		this.saldo=saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public static void Ingresar(Double d) {
		// TODO Auto-generated method stub
		saldo += d;
	}

	public void Retirar(double d) {
		// TODO Auto-generated method stub
		saldo-=d;
	}

	

}
