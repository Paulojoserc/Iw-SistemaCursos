package entidade;

public class Endereco {
private String Logradoro;
private String NumeroLogradouro;
private String Bairro;
private String Cep;
private String Municipio;
private String Estado;
private String Pais;

public Endereco() {
	
}

public Endereco(String logradoro, String numeroLogradouro, String bairro, String cep, String municipio, String estado,
		String pais) {
	super();
	Logradoro = logradoro;
	NumeroLogradouro = numeroLogradouro;
	Bairro = bairro;
	Cep = cep;
	Municipio = municipio;
	Estado = estado;
	Pais = pais;
}

public String getLogradoro() {
	return Logradoro;
}

public void setLogradoro(String logradoro) {
	Logradoro = logradoro;
}

public String getNumeroLogradouro() {
	return NumeroLogradouro;
}

public void setNumeroLogradouro(String numeroLogradouro) {
	NumeroLogradouro = numeroLogradouro;
}

public String getBairro() {
	return Bairro;
}

public void setBairro(String bairro) {
	Bairro = bairro;
}

public String getCep() {
	return Cep;
}

public void setCep(String cep) {
	Cep = cep;
}

public String getMunicipio() {
	return Municipio;
}

public void setMunicipio(String municipio) {
	Municipio = municipio;
}

public String getEstado() {
	return Estado;
}

public void setEstado(String estado) {
	Estado = estado;
}

public String getPais() {
	return Pais;
}

public void setPais(String pais) {
	Pais = pais;
}

}
