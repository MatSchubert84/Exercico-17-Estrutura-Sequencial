package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        //Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
        //a. Para homens: (72.7*h) - 58
        //b. Para mulheres: (62.1*h) - 44.7
        Scanner keyboard = new Scanner(System.in);

        double height, idealWeightMen, idealWeightWoman;

        System.out.println("Write your height: ");
        height = keyboard.nextDouble();

        idealWeightMen = ((72.7 * height) - 58);
        idealWeightWoman = ((62.1 * height) - 44.7);

        System.out.println("The ideal weight for your height if you are a woman is: " + idealWeightWoman + "Kg" + 
        "\nThe ideal weight for your height if you are a men is: " + idealWeightMen + "Kg");
        
        keyboard.close();
    }
}