package recursoshumanos;

public class Main {
	public static void main(String[] args) {
		Funcionario A = new Funcionario();
		A.setCpf(00000000);
		A.setSalario(1500.00);
		A.setDesconto(157.00);
		System.out.println("Salario do Funcionario A: " + A.calcularSalario());
		
		Vendedor B = new Vendedor(11111111, 1500.00, 157.00, 600.00);
		System.out.println("Salario do Vendedor B: " + B.calcularSalario());
	}
}
