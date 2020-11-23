package ExercicioAula1709;

public class Aeronave {
	String nome;
	String destino;
	int qtdPassageiro;
	Piloto piloto;
	void decolar(){
		System.out.println("aviao "+nome+ "esta decolando para "+ destino);
	}
	void exibirPiloto(){
		System.out.println("piloto da aeronave é "+piloto.nome);
	}
}
