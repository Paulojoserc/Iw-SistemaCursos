package entidade;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario{
private String cargo;
private Double salario;
List<Curso> turma = new ArrayList<Curso>();
public Professor() {
	
}
public Professor(String cargo, Double salario, List<Curso> turma) {
	super();
	this.cargo = cargo;
	this.salario = salario;
	this.turma = turma;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public Double getSalario() {
	return salario;
}
public void setSalario(Double salario) {
	this.salario = salario;
}
public List<Curso> getTurma() {
	return turma;
}

}
