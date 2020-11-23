package exercicioObserver;

public class Leitor implements Assinante{
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void update(Revista r) {
		System.out.println(nome+" lendo o artigo: "+r.artigo());
	}

}
