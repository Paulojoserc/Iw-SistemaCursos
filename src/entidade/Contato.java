package entidade;

public class Contato {
private String telefone01 =null;
private String telefone02 =null;
private String email = null;


public Contato() {}

public Contato(String telefone01, String telefone02, String email) {
	super();
	this.telefone01 = telefone01;
	this.telefone02 = telefone02;
	this.email = email;
}



public String getTelefone01() {
	return telefone01;
}


public void setTelefone01(String telefone01) {
	this.telefone01 = telefone01;
}


public String getTelefone02() {
	return telefone02;
}


public void setTelefone02(String telefone02) {
	this.telefone02 = telefone02;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "Contato [telefone01=" + telefone01 + ", telefone02=" + telefone02 + ", email=" + email + "]";
}
}
