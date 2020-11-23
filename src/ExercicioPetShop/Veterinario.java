package ExercicioPetShop;

public class Veterinario {
	private String nome;
	private int idade;
	private String telefone;
	private String endereco;
	private String crmv;
	
	public Veterinario() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}
	void exibirVeterinario(){
		System.out.println("nome:"+nome+ "| telefone:"+telefone);
	}
	
}
