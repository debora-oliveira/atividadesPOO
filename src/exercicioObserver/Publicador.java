package exercicioObserver;

public interface Publicador {
	public void notificar();
	public void registrar(Assinante a);
}
