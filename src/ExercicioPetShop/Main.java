package ExercicioPetShop;

public class Main {

	public static void main(String[] args) {
		Veterinario v1 = new Veterinario();
		Dono d1 = new Dono();
		Animal a1 = new Animal();
		Doenca doenca1 = new Doenca();
		v1.setNome("Carla");
		v1.setEndereco("av paulista");
		v1.setCrmv("123456");
		v1.setIdade(36);
		v1.setTelefone("654321");
		v1.exibirVeterinario();
		
		d1.setNome("Diana");
		d1.setCpf("124578");
		d1.setTelefone("45654565");
		
		a1.setNome("barba ruiva");
		a1.setRaca("golden retriever");
		a1.setPeso(40);
		a1.setIdade(6);
		
		
		doenca1.setNome("infecção");
		doenca1.setSintomas("inflamação, animal fica quieto e sem comer");
		doenca1.setRequerExame(true);
		doenca1.setRequerCirurgia(false);
		doenca1.setTratamento("antibiótico por duas semanas");
		
		a1.doenca[0] = doenca1;
		d1.animal[0]=a1;
		
		d1.exibirDono();
		d1.animal[0].exibirAnimal();
		d1.animal[0].doenca[0].exibirDoenca();
		
	}

}
