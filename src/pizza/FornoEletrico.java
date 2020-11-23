package pizza;

public class FornoEletrico implements Forno {
	private int temperatura;
	public Pizza pizzaPronta() {
		return new PizzaMarguerita();
	}

	public void acenderForno() {
		temperatura =180;
	}

	public void apagarFogo() {
		temperatura =0;
	}

}
