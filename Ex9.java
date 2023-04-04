package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args) {

        //Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
        float fahrenheit, celsius;

        Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Write the temperature in fahrenheit: ");
            fahrenheit = keyboard.nextFloat();

        celsius = 5 * ((fahrenheit - 32) / 9);

        System.out.println("\n" + fahrenheit + " degrees fahrenheit are equivalent to : " + celsius + " degrees celsius");
        keyboard.close();
    }
}
