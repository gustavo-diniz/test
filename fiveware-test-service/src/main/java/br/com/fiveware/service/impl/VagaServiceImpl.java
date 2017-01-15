package br.com.fiveware.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiveware.dao.VagaDAO;
import br.com.fiveware.entity.VagaEntity;
import br.com.fiveware.service.VagaService;
import br.com.fiveware.to.VagaTO;

@Service
@Transactional
public class VagaServiceImpl implements VagaService {

	@Autowired
	private VagaDAO vagaDAO;

	@Override
	public Boolean cadastrarVaga(VagaTO to) {

		Boolean sucess;
		try {
			if(vagaValida(to)){
				VagaEntity vaga = new VagaEntity();
				vaga.setTituloVaga(to.getTitulo());
				vaga.setDescVaga(to.getDescricao());
				vaga.setPermiteClt(to.getClt() ? 1 : 0);
				vaga.setPermitePj(to.getPj() ? 1 : 0);
				vaga.setPermiteCoop(to.getCoop() ? 1 : 0);
				vaga.setTipoVaga(to.getTipoVaga());
				vaga.setPrazoInicio(to.getPrazo());

				vagaDAO.salvarVaga(vaga);
				sucess = true;
			}else{
				sucess = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			sucess = false;
		}
		
		return sucess;
	}
	
	private Boolean vagaValida(VagaTO to){
		if(to.getTitulo().equals("") || to.getTitulo().length() > 100){
			return false;
		}else if(to.getDescricao().equals("") || to.getDescricao().length() > 500){
			return false;
		}else if(to.getTipoVaga().equals("") || to.getTipoVaga().length() > 30){
			return false;
		}else if(to.getPrazo().equals("") || to.getPrazo().length() > 50){
			return false;
		}else{
			return true;
		}
	}

}
