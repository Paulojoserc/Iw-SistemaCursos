package servico;

public interface Tributos {
	Double calculaInss(Double salario);

	Double calculaIR(Double salario);

	Double calculavaleRefeicao(Double salario);

	Double calculavaleTransporte(Double salario);

}
