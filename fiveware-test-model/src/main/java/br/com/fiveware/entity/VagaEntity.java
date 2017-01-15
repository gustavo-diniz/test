package br.com.fiveware.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_VAGAS")
public class VagaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VAGA")
	private Integer idVaga;

	@Column(name = "TITULO_VAGA")
	private String tituloVaga;

	@Column(name = "DESC_VAGA")
	private String descVaga;

	@Column(name = "PERMITE_CLT")
	private Integer permiteClt;

	@Column(name = "PERMITE_PJ")
	private Integer permitePj;

	@Column(name = "PERMITE_COOP")
	private Integer permiteCoop;

	@Column(name = "TIPO_VAGA")
	private String tipoVaga;

	@Column(name = "PRAZO_INICIO")
	private String prazoInicio;

	public Integer getIdVaga() {
		return idVaga;
	}

	public void setIdVaga(Integer idVaga) {
		this.idVaga = idVaga;
	}

	public String getTituloVaga() {
		return tituloVaga;
	}

	public void setTituloVaga(String tituloVaga) {
		this.tituloVaga = tituloVaga;
	}

	public String getDescVaga() {
		return descVaga;
	}

	public void setDescVaga(String descVaga) {
		this.descVaga = descVaga;
	}

	public Integer getPermiteClt() {
		return permiteClt;
	}

	public void setPermiteClt(Integer permiteClt) {
		this.permiteClt = permiteClt;
	}

	public Integer getPermitePj() {
		return permitePj;
	}

	public void setPermitePj(Integer permitePj) {
		this.permitePj = permitePj;
	}

	public Integer getPermiteCoop() {
		return permiteCoop;
	}

	public void setPermiteCoop(Integer permiteCoop) {
		this.permiteCoop = permiteCoop;
	}

	public String getTipoVaga() {
		return tipoVaga;
	}

	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}

	public String getPrazoInicio() {
		return prazoInicio;
	}

	public void setPrazoInicio(String prazoInicio) {
		this.prazoInicio = prazoInicio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descVaga == null) ? 0 : descVaga.hashCode());
		result = prime * result + ((idVaga == null) ? 0 : idVaga.hashCode());
		result = prime * result + ((permiteClt == null) ? 0 : permiteClt.hashCode());
		result = prime * result + ((permiteCoop == null) ? 0 : permiteCoop.hashCode());
		result = prime * result + ((permitePj == null) ? 0 : permitePj.hashCode());
		result = prime * result + ((prazoInicio == null) ? 0 : prazoInicio.hashCode());
		result = prime * result + ((tipoVaga == null) ? 0 : tipoVaga.hashCode());
		result = prime * result + ((tituloVaga == null) ? 0 : tituloVaga.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VagaEntity other = (VagaEntity) obj;
		if (descVaga == null) {
			if (other.descVaga != null)
				return false;
		} else if (!descVaga.equals(other.descVaga))
			return false;
		if (idVaga == null) {
			if (other.idVaga != null)
				return false;
		} else if (!idVaga.equals(other.idVaga))
			return false;
		if (permiteClt == null) {
			if (other.permiteClt != null)
				return false;
		} else if (!permiteClt.equals(other.permiteClt))
			return false;
		if (permiteCoop == null) {
			if (other.permiteCoop != null)
				return false;
		} else if (!permiteCoop.equals(other.permiteCoop))
			return false;
		if (permitePj == null) {
			if (other.permitePj != null)
				return false;
		} else if (!permitePj.equals(other.permitePj))
			return false;
		if (prazoInicio == null) {
			if (other.prazoInicio != null)
				return false;
		} else if (!prazoInicio.equals(other.prazoInicio))
			return false;
		if (tipoVaga == null) {
			if (other.tipoVaga != null)
				return false;
		} else if (!tipoVaga.equals(other.tipoVaga))
			return false;
		if (tituloVaga == null) {
			if (other.tituloVaga != null)
				return false;
		} else if (!tituloVaga.equals(other.tituloVaga))
			return false;
		return true;
	}
	
	

}
