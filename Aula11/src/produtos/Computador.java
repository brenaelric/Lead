package produtos;

public class Computador extends Produto implements Autenticacao {
	public  double precoVenda(double preco, double lucro){
		return preco + lucro;
	}
	public boolean autenticacaoCodBarras(long codBarras){
		return this.codBarras == codBarras;
	}
	public static void main(String args[]){
		Computador c = new Computador();
		System.out.println(c.autenticacaoCodBarras(9388583859589700l));
		System.out.println(c.precoVenda(10.00, 20.00));
	}
}
