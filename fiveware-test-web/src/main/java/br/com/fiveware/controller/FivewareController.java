package br.com.fiveware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import br.com.fiveware.service.VagaService;
import br.com.fiveware.to.VagaTO;
import br.com.fiveware.to.response.VagaResponse;

@Controller
public class FivewareController {
	
	@Autowired
	private VagaService vagaService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String redirectTo() {

		return "cadastro";
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public String formCurriculo() {
		
		return "cadastro";
	}
	
	@RequestMapping(value = "/salvar-cadastro", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody VagaResponse salvarCadastro(@RequestBody String vagaTO) {  
		
		VagaTO vaga = new Gson().fromJson(vagaTO, VagaTO.class);
		Boolean sucesso = vagaService.cadastrarVaga(vaga);
		
		VagaResponse vagaResponse = new VagaResponse();
		if(sucesso){
			vagaResponse.setMensagem("Registro incluído com sucesso !");
		}else{
			vagaResponse.setMensagem("Erro ao salvar registro !");
		}
		
		return vagaResponse;
	}
	
}
