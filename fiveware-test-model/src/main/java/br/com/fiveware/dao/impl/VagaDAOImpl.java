package br.com.fiveware.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.fiveware.dao.AbstractDAO;
import br.com.fiveware.dao.VagaDAO;
import br.com.fiveware.entity.VagaEntity;

@Repository
public class VagaDAOImpl extends AbstractDAO implements VagaDAO {

	@Override
	public void salvarVaga(VagaEntity vaga) throws Exception {
		persist(vaga);
	}

}
