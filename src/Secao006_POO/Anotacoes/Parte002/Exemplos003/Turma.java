package Secao006_POO.Anotacoes.Parte002.Exemplos003;

import java.util.Arrays;

public class Turma {

    private String[] estudantes;

    public Turma(String[] estudantes) {
        this.estudantes = Arrays.copyOf(estudantes, estudantes.length);
    }

    public void setEstudantes(String[] estudantes) {
        if (estudantes.length > 0) {
            this.estudantes = Arrays.copyOf(estudantes, estudantes.length);
        }
    }

    public String[] getEstudantes() {
        return Arrays.copyOf(estudantes, estudantes.length);
    }

}
