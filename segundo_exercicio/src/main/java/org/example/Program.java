package org.example;

import java.util.*;

public class Program {

    /**
     * Nesta classe eu implemento um pouco diferente, eu exibo apenas
     * as moedas e notas que  são necessarias.
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Informe o valor.:");
        double valor = input.nextDouble();

        int inteiro = (int) valor;
        int decimal = (int) Math.round((valor - (int) valor) * 100);

        int[] notas = {100, 50, 20, 10, 5, 2};
        int moeda = 1;
        int[] moedas = {50, 25, 10, 5, 1};

        int i = 0, j = 0;

        while (inteiro >= 2) {
            inteiro = contadorDeNotas(notas[i], inteiro);
            i++;
        }
        if (inteiro >= 1) {
            inteiro = contadorDeMoedas(moeda, inteiro);
        }

        while (decimal >= 1) {
            decimal = contadorDeMoedas(moedas[j], decimal);
            j++;
        }


        input.close();
    }

    public static int contadorDeNotas(int nota, int valor) {
        int qtdNota = valor / nota;
        int resto = valor % nota;
        String resposta = "";
        if (qtdNota > 0)
            resposta = qtdNota + " nota(s) de R$" + nota;
        formaStringNotas(resposta);
        return resto;
    }


    public static int contadorDeMoedas(int moeda, int valor) {
        int qtdMoeda = valor / moeda;
        int resto = valor % moeda;
        String resposta = "";
        if (qtdMoeda > 0)
            resposta = qtdMoeda + " moeda(s) de R$" + moeda;

        formaStringNotas(resposta);
        return resto;
    }

    public static void formaStringNotas(String notas) {
        StringBuilder texto = new StringBuilder();
        texto.append(notas);
        System.out.println(texto);
    }


}
