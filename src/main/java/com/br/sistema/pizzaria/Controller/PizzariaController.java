package com.br.sistema.pizzaria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.sistema.pizzaria.Models.PizzariaModels;
import com.br.sistema.pizzaria.Service.PizzariaService;

@Controller
public class PizzariaController {

	@Autowired
	PizzariaService pizzariaService;

	@GetMapping("/")
	public ModelAndView mostrarPizza(){
		ModelAndView modelAndView = new ModelAndView("pizzaria.html");
		modelAndView.addObject("pizzas",pizzariaService.mostrarPizza());
		return modelAndView;
	}
	@GetMapping("/cadastro")
	public ModelAndView casdastrarPizza() {
		ModelAndView modelAndView = new ModelAndView("cadastro-de-pizza.html");
		return modelAndView;
	}  
	@PostMapping("/cadastro")
	public String adicionarPizza(PizzariaModels pizzariaModels) {
		pizzariaService.adicionarPizzas(pizzariaModels);
		return "redirect:/";
		
	}
	
	@GetMapping("/{sabor}")
	public ModelAndView buscarPizza(@PathVariable String sabor){
		ModelAndView modelAndView = new ModelAndView("informacao-pizza.html");
		modelAndView.addObject("pizzas",pizzariaService.buscarPizza(sabor));
		return modelAndView;
	}
}
