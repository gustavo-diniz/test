package br.com.fiveware.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FivewareController {
	
	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public String dizHelloWorld(ModelMap model) {

		model.addAttribute("mensagem", "Hello World! Data atual: " + new Date());

		return "destino";
	}
	
}
