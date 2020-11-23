package ExercicioAeroporto;

public class Main {

	public static void main(String[] args) {
		Aeronave aeronave1 = new Aeronave("Airbus 300", "Florianópolis", 120);
		Aeronave aeronave2 = new Aeronave("Airbus A380", "Florianópolis", 120);
		Piloto p1 = new Piloto("Guarulhos",72,"São Paulo","Gilberto");
		Passageiro psg1 = new Passageiro("123", 3, "São Paulo");
		p1.trabalhar();
		psg1.embarcar();
		aeronave1.decolar();
		psg1.desembarcar(aeronave1.getDestino());
	}

}
