package Secao005_Arrays.Projetos;

import java.util.Scanner;

/**
 1 - Importar Scanner: Importar a classe Scanner para capturar a entrada do usuário.

 2 - Receber Senha: Solicitar ao usuário que digite uma senha
 e armazená-la em uma variável.

 3 - Verificar Força da Senha: Chamar o método verificarForcaSenha
 para avaliar a força da senha.

 > mais de x caracteres +1
 > se tem letras  +1
 > se tem caracteres especiais +1
 > se tem numeros +1

 forca = 3

 'a senha tem seguranca média'

 4 - Avaliar e Exibir Resultado: Exibir uma mensagem indicando a força da senha
 com base no valor retornado.

 5 - Fechar Scanner: Fechar o Scanner para liberar recursos.
 */
public class VerificadorSenha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma senha:");
        String senha = sc.next();

        int forca = verificarForcaSenha(senha);

        switch (forca) {
            case 0:
                System.out.println("A senha não tem segurança");
                break;
            case 1:
                System.out.println("A senha tem seguranca muito baixa");
                break;
            case 2:
                System.out.println("A senha tem seguranca baixa");
                break;
            case 3:
                System.out.println("A senha tem seguranca média");
                break;
            case 4:
                System.out.println("A senha tem seguranca alta");
                break;
        }

        sc.close();
    }

    public static int verificarForcaSenha(String senha) {
        int forca = 0;
        int minCaracteres = 8;
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] caracteresEspeciais = {"!", "#", "$", "%", "&", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "@", "[", "]", "^", "_", "{", "|", "}", "~"};
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean temMinCaracteres = false;
        boolean temLetra = false;
        boolean temCaractereEspecial = false;
        boolean temNumero = false;

        if (senha.length() >= minCaracteres) {
            temMinCaracteres = true;
            forca++;
        }

        for (int i = 0; i < senha.length(); i++) {
            String caractereAtual = String.valueOf(senha.charAt(i));

            if (!temLetra) {
                for (int j = 0; j < letras.length; j++) {
                    if (caractereAtual.equals(letras[j])) {
                        temLetra = true;
                        forca++;
                        break;
                    }
                }
            }

            if (!temCaractereEspecial) {
                for (int j = 0; j < caracteresEspeciais.length; j++) {
                    if (caractereAtual.equals(caracteresEspeciais[j])) {
                        temCaractereEspecial = true;
                        forca++;
                        break;
                    }
                }
            }

            if (!temNumero) {
                for (int j = 0; j < numeros.length; j++) {
                    if (caractereAtual.equals(Integer.toString(numeros[j]))) {
                        temNumero = true;
                        forca++;
                        break;
                    }
                }
            }
        }

        return forca;
    }
}
