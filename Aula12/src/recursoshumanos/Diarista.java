package recursoshumanos;

public class Diarista extends Funcionario{
	public double valorHora;
	public double qtdHora;
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getQtdHora() {
		return qtdHora;
	}
	public void setQtdHora(double qtdHora) {
		this.qtdHora = qtdHora;
	}
	public Diarista(double valorHora, double qtdHora){
		this.valorHora = valorHora;
		this.qtdHora = qtdHora;
	}
	public Diarista() {
		
	}
	
	double calcularSalario() throws NumberFormatException{
		if(valorHora == 0){
			throw new NumberFormatException();
		}
		return (valorHora*qtdHora);		
	}
	
	
	
}
