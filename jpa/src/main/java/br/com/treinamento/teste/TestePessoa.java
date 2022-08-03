package br.com.treinamento.teste;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import br.com.treinamento.dao.EnderecoDAO;
import br.com.treinamento.dao.JPAUtil;
import br.com.treinamento.dao.PessoaDAO;
import br.com.treinamento.modelo.Endereco;
import br.com.treinamento.modelo.Pessoa;
import br.com.treinamento.util.Sexo;

public class TestePessoa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Carlos",Sexo.MASCULINO,"teste@gmail", LocalDate.now());
        Endereco endereco = new Endereco("Minha rua", "12345", "SN", "Meu Bairro", pessoa);
        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
        //EntityManager em = factory.createEntityManager();
        
        EntityManager em = JPAUtil.getEntityManager();

        PessoaDAO pessoaDAO = new PessoaDAO(em);
        EnderecoDAO enderecoDAO = new EnderecoDAO(em);
        
        
        em.getTransaction().begin();

        //em.persist(pessoa);
        pessoaDAO.cadastrar(pessoa);
        enderecoDAO.cadastrar(endereco);

        em.getTransaction().commit();
        em.close();
    }

}
