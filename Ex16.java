package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        //Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
        //Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
        //Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
        Scanner keyboard = new Scanner(System.in);

        double area = 0.0, cans = 0.0, neededLiters = 0.0, totalPrice = 0.0;

        System.out.println("Area to paint: ");
        area = keyboard.nextDouble();

        neededLiters = (area * 1.0 / 3.0);
        cans = Math.ceil(neededLiters / 18.0);
        totalPrice = cans * 80.0;

        System.out.println("\nYou are gonna need " + cans + " can(s) and the price will be R$" + totalPrice);

        keyboard.close();
    }
}