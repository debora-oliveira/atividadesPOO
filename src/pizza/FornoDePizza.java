package pizza;

public class FornoDePizza implements Forno {
	private int temperatura;
	
	public Pizza pizzaPronta() {
		return new PizzaMussarela();
	}
	
	//public PizzaMussarela pizzaPronta(){	}
	public void acenderForno(){
		temperatura =180;
	}
	public void apagarFogo(){
		temperatura =0;
	}
	
}
