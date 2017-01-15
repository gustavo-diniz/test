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
	public void cadastrarVaga(VagaTO to) {
		VagaEntity vaga = new VagaEntity();
		vaga.setTituloVaga(to.getTitulo());
		vaga.setDescVaga(to.getDescricao());
		vaga.setPermiteClt(to.getClt() ? 1 : 0);
		vaga.setPermitePj(to.getPj() ? 1 : 0);
		vaga.setPermiteCoop(to.getCoop() ? 1 : 0);
		vaga.setTipoVaga(to.getTipoVaga());
		vaga.setPrazoInicio(to.getPrazo());
		
		vagaDAO.salvarVaga(vaga);
	}

}
