package pizza;

public class Restaurante {

	public static void main(String[] args) {
		PizzaMussarela p1 = new PizzaMussarela();
		FornoDePizza fp = new FornoDePizza();
		FornoEletrico fe = new FornoEletrico();
		//p1.assar(f);(fe);
		//p1.assar(fe);
		Pizza p = fe.pizzaPronta();
		p.servir();
	}

}
