package cursoJava2024;

//Gerente.java
public class Gerente extends Funcionario {
    public Gerente(String nome) {
        super(nome);
    }

    public String verificarCargo() {
        return getNome() + " é um gerente.";
    }

}

