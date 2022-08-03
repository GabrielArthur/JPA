package br.com.treinamento.dao;

import javax.persistence.EntityManager;

import br.com.treinamento.modelo.Pessoa;

public class PessoaDAO {

	private EntityManager em;

	public PessoaDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Pessoa pessoa) {
		this.em.persist(pessoa);
	}

}
