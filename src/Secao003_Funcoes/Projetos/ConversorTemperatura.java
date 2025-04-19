package Secao003_Funcoes.Projetos;

import java.util.Scanner;

/**
 * Objetivo: Criar um conversor de Celsius para Fahrenheit e de Fahrenheit para Celsius
 *
 * Etapas do projeto
 *
 * 1 - Obter do usuário se ele quer conveter Celsius ou Fahrenheit
 * 2 - Criar duas funções, uma para cada conversão
 * 3 - Obter a temperatura em cada uma das funções escolhidas
 * 4 - Exibir uma mensagem com a temperatura, ex: De x C para y F
 */
public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione uma das seguintes opções:");
        System.out.println("1 - Converter Celsius (ºC) para Fahrenheit (ºF)");
        System.out.println("2 - Converter Fahrenheit (ºF) para Celsius (ºC)");
        System.out.println("Qualquer outro valor - Finalizar programa");
        int escolhaUsuario = (int) sc.nextInt();

        System.out.println();

        if (escolhaUsuario < 1 || escolhaUsuario > 2) {
            System.out.println("Programa finalizado!");
            return;
        }

        if (escolhaUsuario == 1) {
            System.out.println("Insira um valor numérico em Celsius (ºC):");
            double celsius = sc.nextDouble();
            double fahrenheit = converterCelsiusParaFahrenheit(celsius);

            System.out.printf("%.2fºC = %.2fºF", celsius, fahrenheit);
        } else {
            System.out.println("Insira um valor numérico em Fahrenheit (ºF):");
            double fahrenheit = sc.nextDouble();
            double celsius = converterFahrenheitParaCelsius(fahrenheit);

            System.out.printf("%.2fºF = %.2fºC", fahrenheit, celsius);
        }

        sc.close();
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
