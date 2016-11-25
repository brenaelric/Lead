package recursoshumanos;

public class Vendedor extends Funcionario{
	double comissao;
	public Vendedor(long cpf, double salario, double desconto, double comissao){
		super(cpf, salario, desconto);
		this.comissao = comissao;
	}
	public Vendedor(){
		
	}
	double calcularSalario(){
		try{
			return (salario - desconto)+ comissao;			
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
		return 0;
	}
}
