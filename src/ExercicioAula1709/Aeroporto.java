package ExercicioAula1709;

public class Aeroporto {
	String nome;
	int qtdAviao;
	String local;
	Aeronave voo;
	void exibirVoo(){
		System.out.println("voo para "+ voo.destino + "foi realizado");
	}
}
