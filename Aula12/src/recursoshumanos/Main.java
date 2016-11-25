package recursoshumanos;

public class Main {
	public static void main(String[] args) {
		Funcionario A;
		A = new Vendedor(00000000, 1500.00, 17.00, 54.00);
		A = new Diarista(77.00, 8.00);
		System.out.println("Salario do funcionario A é: " + A.calcularSalario());
	}
}
