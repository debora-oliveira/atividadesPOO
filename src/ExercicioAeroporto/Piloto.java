package ExercicioAeroporto;

public class Piloto extends Pessoa {
	private String localTrabalho;
	private int tempoExperienciaMeses;
	private String cidadeNatal;
	
	public Piloto(String localTrabalho, int tempoExperienciaMeses,String cidadeNatal,String nome) {
		this.localTrabalho = localTrabalho;
		this.tempoExperienciaMeses = tempoExperienciaMeses;
		this.cidadeNatal = cidadeNatal;
		this.nome = nome;
	}
	public void trabalhar(){
		System.out.println("Trabalhando em "+localTrabalho);
	}


	@Override
	void viajar() {
		
		
	}
}
