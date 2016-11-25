package produtos;

public abstract class Produto {
	double preco;
	int quantidade;
	long codBarras;
	public abstract double precoVenda(double preco, double lucro);
	public long getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(long codBarras) {
		this.codBarras = codBarras;
	}
}
