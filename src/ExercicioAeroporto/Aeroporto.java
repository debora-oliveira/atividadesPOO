package ExercicioAeroporto;

public class Aeroporto {
	private String nome;
	private int qtdAviao;
	private String local;
	private Aeronave aeronaves;
	
	public Aeroporto(String nome, int qtd, String local, Aeronave a) {
		this.nome = nome;
		this.qtdAviao = qtd;
		this.local = local;
		this.aeronaves = a;
	}
	
	void exibirVoos(){
		System.out.println(aeronaves.getDestino());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAviao() {
		return qtdAviao;
	}

	public void setQtdAviao(int qtdAviao) {
		this.qtdAviao = qtdAviao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Aeronave getAeronaves() {
		return aeronaves;
	}

	public void setAeronaves(Aeronave aeronaves) {
		this.aeronaves = aeronaves;
	}

}
