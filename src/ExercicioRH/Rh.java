package ExercicioRH;

import java.util.ArrayList;
import java.util.List;

public class Rh {
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	public double valorBonus(Funcionario funcionario){
		double valorBonus = funcionario.getSalario() * 0.05;
		return valorBonus;
	}
	
	public void mostrarBonusTodosFuncionarios(Funcionario f){
		//for(Funcionario fnc : f){		}
	}
	
	public void adicionarFuncionario(Funcionario f){
		
	}
	
}
