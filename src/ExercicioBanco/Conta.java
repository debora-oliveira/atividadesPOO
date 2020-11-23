package ExercicioBanco;

import java.util.Date;

public class Conta {
	private double saldo;
	private String numero;
	private String senha;
	private Transacao historico[];
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Transacao[] getHistorico() {
		return historico;
	}
	public void setHistorico(Transacao[] historico) {
		this.historico = historico;
	}
	
	public boolean efetuarSaque(double valor){
		boolean efetuado;
		if(valor>saldo){
			efetuado = false;
		}else{
			efetuado = true;
		}
		return efetuado;
	}
	public boolean efetuarDeposito(double valor){
		boolean efetuado;
		if(valor>0){
			efetuado=true;
		}else{
			efetuado = false;
		}
		return efetuado;
	}
	public boolean efetuarPagamento(String boleto, double valor){
		boolean efetuado;
		if(valor>saldo){
			efetuado = false;
		}else{
			efetuado = true;
		}
		return efetuado;
	}
	public Transacao extrato(Date inicio, Date fim){
		Transacao hist  = null;
		Date aux = inicio;
	
		while(aux != fim){
			aux = hist.getData();
		}
		System.out.println(hist.getValor() + " "+hist.getData());
		return hist;
	}
}
