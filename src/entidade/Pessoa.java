package entidade;

import java.time.LocalDate;

public abstract class Pessoa {
Long id = null;
String nome = null;
String password = null;
LocalDate dataDeAniversario;

public Endereco end = new Endereco();
public Contato contato = new Contato();
}
