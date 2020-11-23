package ExercicioAeroporto;

public class Aeronave {
	private String nome;
	private String destino;
	private int qtdPasssageiro;
	private Pessoa pessoa;
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Aeronave(String n, String d,int p) {
		this.nome = n;
		this.destino = d;
		this.qtdPasssageiro = p;
	}
	
	public void decolar(){
		System.out.println(nome+" decolando para "+destino);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getQtdPasssageiro() {
		return qtdPasssageiro;
	}
	public void setQtdPasssageiro(int qtdPasssageiro) {
		this.qtdPasssageiro = qtdPasssageiro;
	}
	
}
