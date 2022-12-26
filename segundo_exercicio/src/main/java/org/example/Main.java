package org.example;
import java.util.*;

public class Main {

/**
 Nesta classe eu implemento como no exercicio
 */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Informe o valor.:");
        double valor = input.nextDouble();
        int nota100=0,nota50=0,nota20=0,nota10=0,nota5=0,nota2=0;
        int  moeda1=0, moeda50=0,moeda25=0,moeda10=0,moeda5=0,moeda01=0;
        int inteiro = (int)valor;
        int decimal =  (int)Math.round((valor - (int)valor) * 100);
        int resto = 0;

        if(inteiro >= 100){
            nota100 = inteiro/100;
            resto = inteiro % 100;
        }
        if(resto >= 50){
            nota50 = resto/50;
            resto = resto % 50;
        }
        if(resto >= 20){
            nota20 = resto / 20;
            resto = resto % 20;
        }

        if(resto >=10){
            nota10 = resto /10;
            resto = resto % 10;
        }

        if(resto >=5){
            nota5 = resto /5;
            resto = resto % 5;
        }

        if(resto >=2){
            nota2 = resto /2;
            resto = resto % 2;
        }

        if(resto >=1){
            moeda1 = resto / 1;
        }


        /*********************  Moedas **************************************/

        if(decimal >= 50){
            moeda50 = decimal/50;
            decimal = decimal % 50;
        }
        if(decimal >= 25){
            moeda25 = decimal / 25;
            decimal = decimal % 25;
        }

        if(decimal >=10){
            moeda10 = decimal /10;
            decimal = decimal % 10;
        }

        if(decimal >=5){
            moeda5 = decimal /5;
            decimal = decimal % 5;
        }



        if(decimal >=1){
            moeda01 = decimal / 1;
        }



        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        System.out.println();
        System.out.println("***************** Moedas *******************************");
        System.out.println(moeda1 + " moedas(s) de R$ 1.00");
        System.out.println(moeda50 + " moedas(s) de R$ 0.50");
        System.out.println(moeda25 + " moedas(s) de R$ 0.25");
        System.out.println(moeda10 + " moedas(s) de R$ 0.10");
        System.out.println(moeda5 + " moedas(s) de R$ 0.05");
        System.out.println(moeda01 + " moedas(s) de R$ 0.01");



    }
}