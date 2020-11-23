package ExercicioPetShop;

public class Dono {
	private String nome;
	private String telefone;
	private String endereco;
	private String cpf;
	private String email;
	Animal[] animal = new Animal[30];
	public Dono() {}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	void exibirDono(){
		System.out.println("nome: "+nome+"\ntelefone: "+telefone);
	}
}
