package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantas frases.: ");
        int quantidadeDeFrases = input.nextInt();

        List<String> frases = new ArrayList<>();

        for(int i = 0; i <= quantidadeDeFrases ; i++)
            frases.add(input.nextLine());

        frases.remove(0);

         for(String  frase: frases){
                int metadeDaFrase = frase.length()/2;
                String parte1 = frase.substring(0,metadeDaFrase);
                String parte2 = frase.substring(metadeDaFrase,frase.length());
                StringBuilder sb1 = new StringBuilder(parte1);
                sb1 = sb1.reverse();
                StringBuilder sb2 = new StringBuilder(parte2);
                sb2 = sb2.reverse();
                sb1.append(sb2);
             System.out.println(sb1);

         }




        input.close();
    }
}