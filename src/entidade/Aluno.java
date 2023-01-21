package entidade;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	List<Curso> turma = new ArrayList<Curso>();
	
	public Aluno() {
		
	}

	public Aluno(List<Curso> turma) {
		super();
		this.turma = turma;
	}

	public List<Curso> getTurma() {
		return turma;
	}

	public void setTurma(List<Curso> turma) {
		this.turma = turma;
	}
	
}
