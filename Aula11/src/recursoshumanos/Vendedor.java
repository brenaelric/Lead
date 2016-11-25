package recursoshumanos;

public class Vendedor extends Funcionario{
	double comissao;
	public Vendedor(long cpf, double salario, double desconto, double comissao){
		super(cpf, salario, desconto);
		this.comissao = comissao;
	}
	double calcularSalario(){
		return (salario - desconto)+ comissao;
	}
}
