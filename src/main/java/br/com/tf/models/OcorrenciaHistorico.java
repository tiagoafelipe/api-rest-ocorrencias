package br.com.tf.models;

import java.io.Serializable;
import java.util.Date;

import br.com.tf.enumarate.StatusOcorrencia;

public class OcorrenciaHistorico implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7044932315397590336L;

	private Long id;
	
	private Ocorrencia ocorrencia;
	
	private StatusOcorrencia statusOcorrencia;
	
	private String observacao;
	
	private Date dataAtualizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public StatusOcorrencia getStatusOcorrencia() {
		return statusOcorrencia;
	}

	public void setStatusOcorrencia(StatusOcorrencia statusOcorrencia) {
		this.statusOcorrencia = statusOcorrencia;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		OcorrenciaHistorico other = (OcorrenciaHistorico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
