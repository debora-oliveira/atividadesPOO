package ExercicioAluno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestaoAlunos {
	int indice;
	Aluno alunos[] = new Aluno[50];
	Scanner scan = new Scanner(System.in);
	String textoMaiusculo=null;
	char letra ='Z';
	void menu(){
		String info = "*** Menu *** \n Digite: \n"
				+ "Criar para criar novo aluno \n"
				+ "Exibir par exibir os dados de um aluno \n"
				+ "Remover para remover um aluno \n"
				+ "Atualizar para atualizar dados de um aluno \n"
				+ "Sair para sair do Menu";
		do{
			System.out.println(info);
			textoMaiusculo = scan.nextLine().toUpperCase();
			letra = textoMaiusculo.charAt(0);
			
			switch (letra) {
			case 'C':
				criar();
				break;
			case 'E':
				exibirAluno();
				break;
			case 'A':
				atualizar();
				break;
			case 'R':
				excluir();
				break;
			case 'M':
				menu();
			case 'S':
				System.exit(0);
			default:
				break;
			}
		}while(letra!='S');
		scan.close();
	}
	
	void criar(){
		Aluno aluno = new Aluno();
		System.out.println("Digite indice para o Aluno: ");
		indice = scan.nextInt();
		System.out.println("Digite id do Aluno: ");
		aluno.setId(scan.nextLong());
		System.out.println("Digite nome do Aluno: ");
		aluno.setNome(scan.next());
		System.out.println("Digite ra do Aluno: ");
		aluno.setRa(scan.next());
		System.out.println("Digite nascimento do Aluno: ");
		String datarecebida = scan.next();	
		aluno.setNascimento(formataData(datarecebida));
		alunos[indice] = aluno;		
		scan.close();
	}
	
	void atualizar(){
		System.out.println("Digite ra do aluno: ");
		String raPesq = scan.next();
		int pos = pesquisa(raPesq);
		if(pos != -1){
			System.out.println("Digite nome do aluno: ");
			alunos[pos].setNome(scan.next());
			System.out.println();
			System.out.println("Digite nascimento do aluno: ");
			String data = scan.next();
			alunos[pos].setNascimento(formataData(data));
		}else{
			System.out.println("ra nao encontrado");
		}
		scan.close();
	}
	
	void excluir(){
		System.out.println("Digite ra do aluno para excluir ele: ");
		String raTemp = scan.next();
		int ind = pesquisa(raTemp);
		if(ind == -1){
			System.out.println("ra nao esta na lista");
		}else{
			int pos = lista();
			for( int i = ind; i < pos;i++){
				alunos[i] = alunos[i+1];
			}
			alunos[pos] = null;	
		}			
		scan.close();
	}
	
	void exibirAluno(){
		System.out.println("Digite ra do aluno: ");
		String ra = scan.next();
		int pos = pesquisa(ra);
		if(pos != -1){
			alunos[pos].exibir();
		}else{
			System.out.println("ra nao esta na lista"); 
		}
	}
	
	private int pesquisa(String raPesq){
		int posicao=-1;
		for(int i = 0 ; i < alunos.length ;){
			if(raPesq.equals(alunos[i].getRa()))
				posicao = i;
				break;
		}
		return posicao;
	}
	
	private int lista(){
		int count = 0;
		while(alunos[count] != null){
			count++;
		}
		return count;
	}
	private Date formataData(String datarecebida){
		Date dataformatada = null;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		try {
			dataformatada = formato.parse(datarecebida);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataformatada;
	}
}
