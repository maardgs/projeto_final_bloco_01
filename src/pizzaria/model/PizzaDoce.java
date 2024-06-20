package pizzaria.model;

public class PizzaDoce extends Pizza{
		
	private String molhoDoce;

	public PizzaDoce(String sabor, String tamanho, float preco, String molhoDoce) {
		super (sabor, tamanho, preco);
		this.molhoDoce = molhoDoce;
		}

	public String getMolhoDoce() {
		return molhoDoce;
	}

	public void setMolhoDoce(String molhoDoce) {
		this.molhoDoce = molhoDoce;
	}

	
	

}
