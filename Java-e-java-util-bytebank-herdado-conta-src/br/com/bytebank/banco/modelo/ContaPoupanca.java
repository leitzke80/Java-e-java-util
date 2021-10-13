package br.com.bytebank.banco.modelo;

import br.com.bytebank.banco.test.Conta;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
	public String toString() {
		return "ContaPoupanca, " + super.toString();
	}
}

