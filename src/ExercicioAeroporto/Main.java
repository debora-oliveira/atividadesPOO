package ExercicioAeroporto;

public class Main {

	public static void main(String[] args) {
		Aeronave aeronave1 = new Aeronave("Airbus 300", "Florian�polis", 120);
		Aeronave aeronave2 = new Aeronave("Airbus A380", "Florian�polis", 120);
		Piloto p1 = new Piloto("Guarulhos",72,"S�o Paulo","Gilberto");
		Passageiro psg1 = new Passageiro("123", 3, "S�o Paulo");
		p1.trabalhar();
		psg1.embarcar();
		aeronave1.decolar();
		psg1.desembarcar(aeronave1.getDestino());
	}

}
