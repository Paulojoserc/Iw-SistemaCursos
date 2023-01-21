package entidade;

public class Contato {
private String Telefone01 =null;
private String Telefone02 =null;
private String Email = null;


public Contato() {
	
}


public Contato(String telefone01, String telefone02, String email) {
	super();
	Telefone01 = telefone01;
	Telefone02 = telefone02;
	Email = email;
}


public String getTelefone01() {
	return Telefone01;
}


public void setTelefone01(String telefone01) {
	Telefone01 = telefone01;
}


public String getTelefone02() {
	return Telefone02;
}


public void setTelefone02(String telefone02) {
	Telefone02 = telefone02;
}


public String getEmail() {
	return Email;
}


public void setEmail(String email) {
	Email = email;
}

}
