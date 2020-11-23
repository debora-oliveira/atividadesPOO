package ExercicioAluno;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Aluno {
	private long id;
	private String nome;
	private String ra;
	private Date nascimento;
	
	public void exibir(){
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Id: "+id+"\nNome: "+nome+"\nRA: "+
		ra+"\nNascimento: "+formato.format(nascimento));
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
}

