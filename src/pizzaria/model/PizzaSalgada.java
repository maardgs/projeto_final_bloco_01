package pizzaria.model;

public class PizzaSalgada extends Pizza {

	private String recheioDeQueijo;

	public PizzaSalgada(String sabor, String tamanho, float preco, String recheioDeQueijo) {
		super(sabor, tamanho, preco);
		this.recheioDeQueijo = recheioDeQueijo;
	}

	public String getRecheioDeQueijo() {
		return recheioDeQueijo;
	}

	public void setRecheioDeQueijo(String recheioDeQueijo) {
		this.recheioDeQueijo = recheioDeQueijo;
	}

}
