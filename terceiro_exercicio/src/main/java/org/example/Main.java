package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        System.out.print("Tamanho do array.:");
        int tamanhoArray = input.nextInt();
        array = new int[tamanhoArray];


        System.out.print("Valor alvo.:");
        int valorAlvo = input.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int cont = 0;
        for (int j = 0; j < array.length; j++) {
            for (int l = 1; l < array.length; l++) {
                if ((array[l] - array[j]) == valorAlvo){  cont++;}

            }

        }

        System.out.println(cont);
    }


}