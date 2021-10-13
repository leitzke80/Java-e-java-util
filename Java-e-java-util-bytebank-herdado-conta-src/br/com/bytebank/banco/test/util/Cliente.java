package br.com.bytebank.banco.test.util;

	/**
	 * Classe que representa um cliente no Bytebank.
	 *
	 * @author Nico 
	 * @version 0.1
	 */
	public class Cliente  {

	    public static Cliente clienteCC1;
		private String nome;
	    private String cpf;
	    private String profissao;

	    public String getNome() {
	        return nome;
	    }
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    public String getCpf() {
	        return cpf;
	    }
	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }
	    public String getProfissao() {
	        return profissao;
	    }
	    public void setProfissao(String profissao) {
	        this.profissao = profissao;
	    }
	}

