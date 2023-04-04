package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args) {

        //Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        //a. o produto do dobro do primeiro com metade do segundo .
        //b. a soma do triplo do primeiro com o terceiro.
        //c. o terceiro elevado ao cubo.
        float Floatnumber, equationA, equationB, equationC;
        int intNumber1, intNumber2;

        Scanner keyboard = new Scanner(System.in);

            System.out.println("\nWrite an Int number: ");
            intNumber1 = keyboard.nextInt();
            System.out.println("\nWrite another Int number: ");
            intNumber2 = keyboard.nextInt();
            System.out.println("\nWrite a decimal number: ");
            Floatnumber = keyboard.nextFloat();

        equationA = ((intNumber1 * 2) * (intNumber2 / 2));
        equationB = ((intNumber1 * 3) + Floatnumber);
        equationC = Floatnumber * Floatnumber * Floatnumber;

        System.out.println("\nO produto do dobro do primeiro com metade do segundo é: " + 
        equationA + "\nA soma do triplo do primeiro com o terceiro é: " + 
        equationB + "\nO terceiro elevado ao cubo é: " + equationC);

        keyboard.close();
    }
}
