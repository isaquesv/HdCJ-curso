package Secao002_Condicionais.Anotacoes;

public class Condicionais2 {

    public static void main(String[] args) {
        // O que é boolean?
        boolean estaLigado = true;
        boolean estaDesligado = false;

        System.out.println(estaLigado + " e " + estaDesligado);
        System.out.println();

        int numero = 5;
        int outroNumero = 10;
        // OPERADORES DE COMPARAÇÃO
        System.out.println(numero + " é igual a " + outroNumero + " = " + (numero == outroNumero)); // == (Igual a)
        System.out.println(numero + " é diferente de " + outroNumero + " = " + (numero != outroNumero)); // != (Diferente de)
        System.out.println(numero + " é maior que " + outroNumero + " = " + (numero > outroNumero)); // > (Maior que)
        System.out.println(numero + " é menor que " + outroNumero + " = " + (numero < outroNumero)); // < (Menor que)
        System.out.println(numero + " é maior ou igual a " + outroNumero + " = " + (numero >= outroNumero)); // >= (Maior ou igual a)
        System.out.println(numero + " é menor ou igual a " + outroNumero + " = " + (numero <= outroNumero)); // <= (Menor ou igual a)
        System.out.println();

        // COMPARAÇÃO COM STRINGS
        String primeiroNome = "Isaque";
        String sobrenome = "Silva";
        String PRIMEIRO_NOME_IN_UPPERCASE = primeiroNome.toUpperCase();

        System.out.println(primeiroNome + " é igual a " + sobrenome + " = " + primeiroNome.equals(sobrenome));
        System.out.println(primeiroNome + " é igual a " + sobrenome + " (ignorando capslock) = " + primeiroNome.equalsIgnoreCase(sobrenome));
        System.out.println(primeiroNome + " é igual a " + PRIMEIRO_NOME_IN_UPPERCASE + " = " + primeiroNome.equals(PRIMEIRO_NOME_IN_UPPERCASE));
        System.out.println(primeiroNome + " é igual a " + PRIMEIRO_NOME_IN_UPPERCASE + " (ignorando capslock) = " +  primeiroNome.equalsIgnoreCase(PRIMEIRO_NOME_IN_UPPERCASE));

        // ESTRUTURAS DE CONDIÇÃO
        // if () {
        // } else if () {
        // } else {
        // }

        // switch (x) {
        //  case 1:
        //      System.out.println("1!");
        //      break;
        // }

        // OPERADORES LÓGICOS
        // && (E)
        // || (OU)
        // ! (NÃO)

        // CONDICIONAL TERNÁRIA
        // (CONDIÇÃO) ? SE É TRUE : SE É FALSE;
        String parOuImpar = (2 % 2 == 0) ? "2 é PAR": "2 é ÍMPAR";
        System.out.println(parOuImpar);

        parOuImpar = (3 % 2 == 0) ? "3 é PAR": "3 é ÍMPAR";
        System.out.println(parOuImpar);
    }
}
