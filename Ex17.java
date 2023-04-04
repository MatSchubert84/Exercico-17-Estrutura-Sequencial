package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex17 {
    
    public static void main(String[] args) {

        //Faça um Programa para uma loja de tintas. 
        //O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
        //Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta 
        //é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
        
        //Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        //comprar apenas latas de 18 litros;
        //comprar apenas galões de 3,6 litros;
        //misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

        //pedir area
        //1 litro por 6 metros
        //latas tem 18 litros
        //galão tem 3.6 litros
        //10% de tolerancia

        //Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //variables
        double area, liters, cans, canPrice, gallon, gallonPrice, remainingMeters, remainingLiters, additionalGallons, additionalGallonsPrice, option3CanPrice, option3TotalPrice;

        //data input
        System.out.println("PAINTING AREA: ");
        area = keyboard.nextDouble();

        //solution 1
        liters = (area / 6);
        cans = Math.ceil(liters / 18);
        canPrice = (cans * 80);

        System.out.println("\nCANS ONLY: " + cans + " can(s) R$" + canPrice);

        //solution 2
        gallon = Math.ceil(liters / 3.6);
        gallonPrice = (gallon * 25);

        System.out.println("GALLONS ONLY: " + gallon + " gallon(s) R$" + gallonPrice);

        //solution 3
        remainingMeters = (((cans - 1) * 6 * 18) - area);
        remainingLiters = ((remainingMeters / 6) * 1.10);

        option3CanPrice = ((cans - 1) * 80);

        additionalGallons = (Math.ceil(Math.abs(remainingLiters / 3.6)));
        additionalGallonsPrice = (additionalGallons * 25);

        option3TotalPrice = (option3CanPrice + additionalGallonsPrice);

        //data output
        if (area == 0) 
        {
            System.out.println("MIXED OPTION: " + 0.0 + " can(s) and " + 0.0 + " gallon(s) R$" + 0.0);
        } 
        else
        {
            System.out.println("MIXED OPTION: " + (cans - 1) + " can(s) and " + additionalGallons + " gallon(s) R$" + option3TotalPrice);
        }

        keyboard.close();
    }
}