package entidade;

public class Funcionario extends Pessoa {
	private String cargo;
	private Integer cargaHoraria;
	private Double Salario;

	public Funcionario() {

	}

	public Funcionario(String cargo, Integer cargaHoraria, Double salario) {
		super();
		this.cargo = cargo;
		this.cargaHoraria = cargaHoraria;
		Salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

}
