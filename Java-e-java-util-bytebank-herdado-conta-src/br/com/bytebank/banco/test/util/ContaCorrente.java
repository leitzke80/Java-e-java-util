package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.test.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += super.saldo + valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
		}
}

