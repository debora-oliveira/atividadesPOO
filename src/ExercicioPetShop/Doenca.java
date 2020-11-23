package ExercicioPetShop;

public class Doenca {
	private String nome;
	private String sintomas;
	private String tratamento;
	private boolean requerExame;
	private boolean requerCirurgia;
	
	public Doenca() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public boolean isRequerExame() {
		return requerExame;
	}

	public void setRequerExame(boolean requerExame) {
		this.requerExame = requerExame;
	}

	public boolean isRequerCirurgia() {
		return requerCirurgia;
	}

	public void setRequerCirurgia(boolean requerCirurgia) {
		this.requerCirurgia = requerCirurgia;
	}
	
	private String requerExame(){
		String resposta = null;
		if(requerExame == true){
			resposta = "sim";
		}else{
			resposta = "não";
		}
		return resposta;
	}
	private String requerCirurgia(){
		String resposta = null;
		if(requerCirurgia == true){
			resposta = "sim";
		}else{
			resposta = "não";
		}
		return resposta;
	}
	
	void exibirDoenca(){
		System.out.println("nome:"+nome+"\nsintomas:"+sintomas+
				"\ntratamento:"+tratamento+"\nrequer Exame:"+requerExame()+
				"\nrequer Cirurgia:"+requerCirurgia());
	}
}
