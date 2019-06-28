package com.br.sistema.pizzaria.Service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.br.sistema.pizzaria.Models.PizzariaModels;

@Service
public class PizzariaService {
	
	private Map<Integer,PizzariaModels> pizzas = new HashMap<Integer, PizzariaModels>(){
		{
		put(1,new PizzariaModels("Frango com catupiry","Tradicional" , "Com catupiry", 30));
		put(2,new PizzariaModels("Calabresa", "Tradicional", "Chedder", 30));
		put(3,new PizzariaModels("Mussarela","Tradicional", "Chadder ", 30));
		}
	};
	
    public Collection<PizzariaModels>  mostrarPizza() {
    	return this.pizzas.values();
    }	
	 public void adicionarPizzas(PizzariaModels pizzariaModels) {
		 pizzas.put(pizzas.size() +1 , pizzariaModels);
	 } 
	public PizzariaModels buscarPizza(String sabor) {
		PizzariaModels pedidos = null;
		for (PizzariaModels pizza : pizzas.values()) {
			if(pizza.getSabor().equalsIgnoreCase(sabor)) {
				pedidos = pizza;
			}
		}
		return pedidos;
	} 
}





