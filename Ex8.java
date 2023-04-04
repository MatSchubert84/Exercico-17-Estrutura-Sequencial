package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args) {

        //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
        double salaryHour, salaryMonth;
        int HoursInAMonth;
        
        Scanner keyboard = new Scanner(System.in);

            System.out.println("How much you earn in one hour?? ");
            salaryHour = keyboard.nextDouble();
            System.out.println("How many hours you work in a month? ");
            HoursInAMonth = keyboard.nextInt();

            salaryMonth = (double) salaryHour * HoursInAMonth;

        System.out.println("Your Monthly salary is: " + salaryMonth);
        keyboard.close();
    }
}
