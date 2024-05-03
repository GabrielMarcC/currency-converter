package com.gabrielm.util;

import com.gabrielm.entities.Currencies;

import java.util.Scanner;

public class ShowMenu {
    Currencies currency = new Currencies();

    public void show(){
        System.out.println("**********************************************");
        System.out.println("Seja bem vindo(a) ao conversor de moedas");
        System.out.println();
        menu();



        try {
            Scanner sc = new Scanner(System.in);
            Integer options = sc.nextInt();
            while (options != 7){
                if(options < 1 || options > 7){
                    System.out.println();
                    System.out.println("Opção inválida, tente novamente!");
                    System.out.println();
                    menu();
                    options = sc.nextInt();
                }

                System.out.println("Digite o valor para converter: ");
                double value = sc.nextDouble();

                currency.convertCurrency(options, value);

                menu();
                options = sc.nextInt();
            }
        }catch (Exception e){
            System.out.println("Ocorreu um erro inesperado");

        }



    }

    public void menu(){
        System.out.println((1) + ")" + "Dólar ==> Peso Argentino");
        System.out.println((2) +  ")" + "Peso Argentino ==> Dólar");
        System.out.println((3) + ")" +  "Dólar ==> BRL");
        System.out.println((4) + ")" +  "BRL ==> Dólar");
        System.out.println((5) + ")" +  "Dólar ==> Peso Colombiano");
        System.out.println((6) + ")" +  "Peso Colombiano ==> Dólar");
        System.out.println((7) + ")" +  "Sair");
    }

}
