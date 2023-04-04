package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {

        //Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58.
        double height, idealWeight;

        Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Write you height:");
            height = keyboard.nextFloat();

        idealWeight = ((72.7 * height) - 58);

        System.out.println("\nThe ideal weight for your height is: " + idealWeight + "Kg");

        keyboard.close();
    }
}
