package ExercicioDinossauro;

public class Dinossauro {
	int energia;
	int velocidade;
	int temperatura;
	boolean humor;
	
	void pular(){
		if(energia<1){
			System.out.println("Skeep não tem energia para pular");
		}else{
			System.out.println("Skeep está pulando");
			energia--;
			temperatura++;
			System.out.println("Skeep está feliz e tem "+energia+" pontos de enrgia");
		}
	}
	
	void correr(){
		if(energia<1){
			System.out.println("Skeep não tem energia para correr");
		}else{
			System.out.println("Skeep está correndo");
			energia--;
			velocidade--;
			temperatura++;
			humor=true;
			System.out.println("Skeep está feliz");
		}
		
	}
	
	void comer(){
		System.out.println("Skeep está comendo");
		energia++;
		velocidade++;
		humor=true;
		System.out.println("Skeep está feliz e tem "+energia+" pontos de energia");
	}
	
	void atirar(){
		if(energia<1){
			System.out.println("Skeep não tem energia para atirar");
		}else{
			System.out.println("Skeep está atirando");
			energia--;
			temperatura++;
			humor=true;
			System.out.println("Skeep está feliz e tem "+energia+ "pontos de energia");
		}
	}
	
	void tomarSol(){
		System.out.println("Skeep etá tomando Sol");
		humor=true;
		velocidade++;
		temperatura++;
		energia--;
		System.out.println("Skeep está feliz e tem "+velocidade+" pontos de velocidade");
	}
	
	void ficarNaSombra(){
		System.out.println("Skeep está na Sombra");
		energia++;
		temperatura--;
		humor=false;
		System.out.println("Skeep está triste e tem "+energia+" pontos de energia");
	}
	void info(){
		System.out.println("_______________________________________________");
		System.out.println("pontos de energia: "+energia);
		System.out.println("pontos de velocidade: "+velocidade);
		System.out.println("pontos de temperatura: "+temperatura);
		if(humor == true){
			System.out.println("humor do Skeep : feliz");
		}else{
			System.out.println("humor do Skeep : triste");
		}
		System.out.println("_______________________________________________");
		
	}
}
