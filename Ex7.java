package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args) {

        //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
        double side1, side2, area, twice;
        
        Scanner keyboard = new Scanner(System.in);

            System.out.println("Square 1st side: ");
            side1 = keyboard.nextDouble();
            System.out.println("\nSquare 2nd side ");
            side2 = keyboard.nextDouble();

        area = side1 * side2;
        twice = area * 2;

        System.out.println("\nTwice the value of the area of the square is: " + twice);
        keyboard.close();
    }
}
