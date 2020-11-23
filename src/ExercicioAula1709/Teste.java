package ExercicioAula1709;

public class Teste {
	public static void main(String[] args) {
		Piloto piloto1 = new Piloto();
		piloto1.cidadeNatal="Cuiaba";
		piloto1.nome="Renan";
		Aeronave aviao = new Aeronave();
		aviao.destino="Fortaleza";
		aviao.nome="Gol";
		aviao.qtdPassageiro=60;
		aviao.piloto=piloto1;
		aviao.exibirPiloto();
	}
}
