package ExercicioAeroporto;

public class Passageiro extends Pessoa{
	private String passaporte;
	private int qtdBagagem;
	private boolean passagem;
	private String cidadeLocal;
	public Passageiro(String passp, int qtdB, String cidadeL) {
		this.passaporte = passp;
		this.qtdBagagem = qtdB;
		this.cidadeLocal = cidadeL;
	}
	void embarcar(){
		System.out.println("Saindo de " + cidadeLocal);
	}
	void desembarcar(String destino){
		System.out.println("Chegando ao destino: "+destino);
	}
	
	public boolean isPassagem() {
		return passagem;
	}


	public void setPassagem(boolean passagem) {
		this.passagem = passagem;
	}


	public String getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
	public int getQtdBagagem() {
		return qtdBagagem;
	}
	public void setQtdBagagem(int qtdBagagem) {
		this.qtdBagagem = qtdBagagem;
	}
	public String getCidadeLocal() {
		return cidadeLocal;
	}
	public void setCidadeLocal(String cidadeLocal) {
		this.cidadeLocal = cidadeLocal;
	}
	@Override
	void viajar() {
		// TODO Auto-generated method stub
		
	}
	
}
