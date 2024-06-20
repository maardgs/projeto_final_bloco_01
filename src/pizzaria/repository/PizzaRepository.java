package pizzaria.repository;

import pizzaria.model.Pizza;

public interface PizzaRepository {
	
	public void realizarCadastro(Pizza pizza);
	public void verCardapio();
	public void realizarPedido (Pizza pizza);
	public void atualizarCadastro (Pizza pizza);
	public void apagarCadastro (Pizza pizza);
	
	
}
