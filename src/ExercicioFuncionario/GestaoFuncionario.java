package ExercicioFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestaoFuncionario {
	int indice;
	Funcionario funcionarios[]  = new Funcionario[50];

	Scanner scan = new Scanner(System.in);
	String textoMaiusculo=null;
	char letra ='Z';
	void menu(){
		String info = "*** Menu *** \n Digite: \n"
				+ "Criar para criar novo funcion�rio \n"
				+ "Exibir par exibir os dados de um funcion�rio \n"
				+ "Remover para remover um funcion�rio \n"
				+ "Atualizar para atualizar dados de um funcion�rio \n"
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
				exibirFuncionario();
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
	private void excluir() {
		System.out.println("Digite matricula do funcionario para excluir ele: ");
		String matriculaTemp = scan.next();
		int ind = pesquisa(matriculaTemp);
		if(ind == -1){
			System.out.println("matricula n�o esta na lista");
		}else{
			int pos = lista();
			for( int i = ind; i < pos;i++){
				funcionarios[i] = funcionarios[i+1];
			}
			funcionarios[pos] = null;	
		}			
		scan.close();
	}
	private void atualizar() {
		System.out.println("Digite matricula do funcionario: ");
		String matriculaPesq = scan.next();
		int pos = pesquisa(matriculaPesq);
		if(pos != -1){
			System.out.println("Digite id do funcion�rio");
			funcionarios[pos].setId(scan.nextLong());
			System.out.println("Digite nome do funcion�rio");
			funcionarios[pos].setNome(scan.next());
			System.out.println("Digite matricula do funcion�rio");
			funcionarios[pos].setMatricula(scan.next());
			System.out.println("Digite admissao do funcion�rio");
			funcionarios[pos].setAdmissao(formataData(scan.next()));
			System.out.println("Digite demissao do funcion�rio");
			funcionarios[pos].setDemissao(formataData(scan.next()));
			System.out.println("Digite salario do funcion�rio");
			funcionarios[pos].setSalario(Float.parseFloat(scan.next()));
			System.out.println("Digite horario do funcion�rio");

		}else{
			System.out.println("matricula n�o encontrada");
		}
		scan.close();
	}

	private void exibirFuncionario() {
		System.out.println("Digite matricula do funcion�rio: ");
		String matricula = scan.next();
		int pos = pesquisa(matricula);
		if(pos != -1){
			funcionarios[pos].exibir();
		}else{
			System.out.println("matricula n�o esta na lista"); 
		}
	}
	private void criar() {
		Funcionario f = new Funcionario();
		//System.out.println("Digite indice para o Funcionario: ");
		/*indice = -1;
		if(indice <0 && indice>50) {
			while(indice <0 && indice>50 && funcionarios[indice]==null) {
				System.out.println("Digite indice para o Funcionario: ");
				indice = scan.nextInt();
			}
		}*/
		
		System.out.println("Digite id do funcion�rio");
		f.setId(scan.nextLong());
		System.out.println("Digite nome do funcion�rio");
		f.setNome(scan.next());
		System.out.println("Digite matricula do funcion�rio");
		f.setMatricula(scan.next());
		System.out.println("Digite admissao do funcion�rio");
		f.setAdmissao(formataData(scan.next()));
		System.out.println("Digite demissao do funcion�rio");
		f.setDemissao(formataData(scan.next()));
		System.out.println("Digite salario do funcion�rio");
		f.setSalario(Float.parseFloat(scan.next()));
		System.out.println("Digite horario do funcion�rio");
		f.setHorario(scan.next());
		if(lista()<1) {
			funcionarios[0] = f;
		}else if(lista()>=1){
			funcionarios[lista()] = f;
		}
		
		scan.close();
	}

	private int lista(){
		int count = 0;
		while(funcionarios[count] != null){
			count++;
		}
		return count;
	}

	private int pesquisa(String matriculaPesq){
		int posicao=-1;
		for(int i = 0 ; i < funcionarios.length ;){
			if(matriculaPesq.equals(funcionarios[i].getMatricula()))
				posicao = i;
			break;
		}
		return posicao;
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
