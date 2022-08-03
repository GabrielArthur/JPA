package br.com.treinamento.modelo;

import java.time.LocalDate;
//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.treinamento.util.Sexo;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

@Entity
@Table(name = "pessoas")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 100, nullable = false)
	private String nome;
	@Column(length = 25, nullable = false)
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	private String email;
	@Column(name = "data_nasc")
	private LocalDate dataNascimento;

	
	public Pessoa() {}
	
	public Pessoa(String nome, Sexo sexo, String email, LocalDate dataNascimento) {
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/*
	 * @Temporal(TemporalType.DATE) private Date date;
	 */

}