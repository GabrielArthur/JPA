package br.com.treinamento.dao;

import javax.persistence.EntityManager;

import br.com.treinamento.modelo.Endereco;

public class EnderecoDAO {

	
	private EntityManager em;

	public EnderecoDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Endereco endereco) {
		this.em.persist(endereco);
	}

}
