package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numerosAleatorios [] = new int[20];

        numerosAleatorios = popularArray(aleatorio,numerosAleatorios);

        List<Integer> numeros = new ArrayList<>();
        numeros = filtraPorNumeroPar( numerosAleatorios);

        System.out.println("********************** Numeros pares ordenados **********************************");
        numeros.forEach(System.out::println);

        numeros.addAll(
                filtraEOrdenarPorNumeroImpar(numerosAleatorios)
                );

        System.out.println();
        System.out.println("********************** Todos os numeros **********************************");
        numeros.forEach(System.out::println);


    }

    public static int[] popularArray(Random aleatorio,int ...array){

        for(int i = 0; i < array.length; i++){
            array [i] = aleatorio.nextInt(1000);
        }
        System.out.println();
        System.out.println("********************** Valores de entrada **********************************");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        return array;
    }

    public static List<Integer> filtraPorNumeroPar(int ...numerosAleatorios){
               return Arrays.stream(numerosAleatorios)
                            .boxed()
                            .filter(p-> p % 2 == 0)
                            .sorted()
                            .collect(Collectors.toList());
    }



    public static List<Integer> filtraEOrdenarPorNumeroImpar(int ...numerosAleatorios){
        return Arrays.stream(numerosAleatorios)
                     .boxed()
                     .filter(p-> p % 2 != 0)
                     .sorted(Comparator.reverseOrder())
                     .collect(Collectors.toList());
    }




}