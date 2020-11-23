package exercicioObserver;

public class SuperInteressante implements Publicador,Revista{
	public void publicarArtigo(String artigo) {
		notificar();
		System.out.println(artigo);
	}

	public String artigo() {
		String artigo="Fatec ZL faz parceria com o MIT para desenvolvimento de novas tecnologias";
		return artigo;
	}

	public void notificar() {
		String info = "veja o novo artigo: ";
		System.out.println(info);
	}

	public void registrar(Assinante a) {
		String info="Assinante "+a+" assina Revista Super Interessante";
		System.out.println(info);
	}
}
