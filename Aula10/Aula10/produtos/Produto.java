package produtos;

public class Produto {
	String nome;
	double valor;
	int quantidade;
	double valor_desconto;
	public Produto(){
		
	}
	public Produto(String nome, double valor, int quantidade){
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public Produto(String nome, double valor, int quantidade, double valor_desconto){
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.valor_desconto=valor_desconto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor_desconto(){
		return valor_desconto;
	}
	public void setValor_desconto(double valor_desconto){
		this.valor_desconto = valor_desconto;
	}
	
	
	public static void main(String[] args){
		Produto p = new Produto("chato", 0.0, 0);
		Produto q = new Produto("chato", 0.0, 0, 0);
		System.out.println("Nome de p: " + p.getNome());
		System.out.println("Valor de p: " + p.getValor());
		System.out.println("Quantidade de p: " + p.getQuantidade());
		System.out.println("Nome de q: " + q.getNome());
		System.out.println("Valor de q: " + q.getValor());
		System.out.println("Quantidade de q: " + q.getQuantidade());
		System.out.println("Valor do desconto de de q: " + q.getValor_desconto());
	}
}
