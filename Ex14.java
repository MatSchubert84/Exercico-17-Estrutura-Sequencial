package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[] args) {

        //João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
        //Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. 
        //João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
        //Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
        Scanner keyboard = new Scanner(System.in);

        double excess, weight, fee;

        System.out.println("--------\nFISH WEIGHT\n--------");
        weight = keyboard.nextDouble();

        excess = weight - 50.0;
        fee = excess * 4.0;

        if (excess > 0) 
        {
            System.out.println("You have an extra weight of " + excess + "Kg");
            System.out.println("You'll have to pay a " + fee + " dollar fee");
        } else 
        {
            System.out.println("You are good to go, no fees, no exceeded weight");
        }
        keyboard.close();
    }
}