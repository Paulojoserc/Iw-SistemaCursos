package servico;

public abstract class CalculosImpostos implements Tributos{
public Double calculaInss(double salario) {
	Double imposto = null;
	
	if (salario <= 1302.00 ) {
		imposto = salario * 0.075;
	}else if(salario >1302.00 || salario<= 2271.29 ){
		imposto = salario * 0.09;
	}else if(salario > 2271.29 || salario<=3856.94) {
		imposto = salario *0.12;
	}else {
		imposto = salario * 0.14;
	}
	return imposto;
}
public Double calculaIR(double salario) {

	if (salario >= 1903.99 || salario <= 2826.65)
		salario = salario * 0.075;
	else if (salario >= 2826.66 || salario <= 3751.05)
		salario = salario * 0.15;
	else if (salario >= 3751.06 || salario <= 4664.68)
		salario = salario * 0.225;
	return salario;
	
}
public Double calculaValeTransporte(double salario) {
return	salario+= salario *0.06;
}
public Double calculaValeRefeicao(double salario){
	return salario += salario * 0.20;
}
}
