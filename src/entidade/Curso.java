package entidade;

import java.time.LocalDate;

public class Curso {
private String nome;
private String turno;
private Integer horasPorAula;
private Integer cargoHoraria;
private LocalDate dataInicio;
private LocalDate dataFim;

public Curso() {
	
}

public Curso(String nome, String turno, Integer horasPorAula, Integer cargoHoraria, LocalDate dataInicio,
		LocalDate dataFim) {
	super();
	this.nome = nome;
	this.turno = turno;
	this.horasPorAula = horasPorAula;
	this.cargoHoraria = cargoHoraria;
	this.dataInicio = dataInicio;
	this.dataFim = dataFim;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTurno() {
	return turno;
}

public void setTurno(String turno) {
	this.turno = turno;
}

public Integer getHorasPorAula() {
	return horasPorAula;
}

public void setHorasPorAula(Integer horasPorAula) {
	this.horasPorAula = horasPorAula;
}

public Integer getCargoHoraria() {
	return cargoHoraria;
}

public void setCargoHoraria(Integer cargoHoraria) {
	this.cargoHoraria = cargoHoraria;
}

public LocalDate getDataInicio() {
	return dataInicio;
}

public void setDataInicio(LocalDate dataInicio) {
	this.dataInicio = dataInicio;
}

public LocalDate getDataFim() {
	return dataFim;
}

public void setDataFim(LocalDate dataFim) {
	this.dataFim = dataFim;
}

}
