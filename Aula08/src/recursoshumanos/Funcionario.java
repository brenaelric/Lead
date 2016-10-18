package recursoshumanos;

public class Funcionario {
	public long cpf;
	public double salario;
	public double desconto;
	
	public long getCpf(){
		return cpf;
	}
	public void setCpf(long cpf){
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getDesconto(){
		return desconto;
	}
	public void setDesconto(double desconto){
		this.desconto = desconto;
	}
	
	public Funcionario(){
		
	}
	public Funcionario(long cpf, double salario, double desconto){
		this.cpf = cpf;
		this.salario = salario;
		this.desconto = desconto;
	}
	
	double calcularSalario(){
		return (salario - desconto);
	}
}
