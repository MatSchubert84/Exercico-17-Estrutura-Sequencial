package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {

        //Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
        float fahrenheit, celsius;

        Scanner keyboard = new Scanner(System.in);

            System.out.println("Write the temperature in Celsius: ");
            celsius = keyboard.nextFloat();

        fahrenheit = 32 + ((celsius * 9) / 5);

        System.out.println("\n" + celsius + " degrees celsius are equivalent to " + fahrenheit + " degrees fahrenheit");
        keyboard.close();
    }
}
