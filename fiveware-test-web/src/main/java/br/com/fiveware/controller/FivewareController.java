package br.com.fiveware.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiveware.to.CadastroTO;

@Controller
public class FivewareController {
	
	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public String dizHelloWorld(ModelMap model) {

		model.addAttribute("mensagem", "Hello World! Data atual: " + new Date());

		return "destino";
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public String formCurriculo(ModelMap model) {

		model.addAttribute("mensagem", " " + new Date());

		return "cadastro";
	}
	
	@RequestMapping(value = "/salvar-cadastro", method = RequestMethod.POST)
	public String salvarCadastro(@RequestBody String cadastroTO) {  
		
		System.out.println(cadastroTO);

		return "cadastro";
	}
	
}
