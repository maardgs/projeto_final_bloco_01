package pizzaria.model;

public abstract class Pizza {

	private String sabor;
	private String tamanho;
	private float preco;

	public Pizza(String sabor, String tamanho, float preco) {

		this.sabor = sabor;
		this.tamanho = tamanho;
		this.preco = preco;

	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {
		System.out.println("\n\n''''''''''''''''''''''''''''''''''''''''");
		System.out.println("Pedido: ");
		System.out.println("''''''''''''''''''''''''''''''''''''''''");
		System.out.println("Sabor: " + this.sabor);
		System.out.println("Tamanho: " + this.tamanho);

	}

}
