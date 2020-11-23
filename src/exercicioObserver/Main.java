package exercicioObserver;

public class Main {
	public static void main(String[] args) {
		SuperInteressante sI = new SuperInteressante();
		String art="Fatec ZL faz parceria com o MIT para desenvolvimento de novas tecnologias";
		Leitor leitor = new Leitor();
		leitor.setNome("Débora");
		sI.registrar(leitor);
		
		sI.publicarArtigo(art);
		Revista superinteressante = sI;
		leitor.update(superinteressante);
	}
}
