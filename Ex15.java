package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, 
        //sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
        //1. salário bruto.
        //2. quanto pagou ao INSS.
        //3. quanto pagou ao sindicato.
        //4. o salário líquido.
        //5. calcule os descontos e o salário líquido, conforme a tabela abaixo:

        //+ Salário Bruto : R$
        //- IR (11%) : R$
        //- INSS (8%) : R$
        //- Sindicato ( 5%) : R$
        // = Salário Liquido : R$

        Scanner keyboard = new Scanner(System.in);

        double hourlyWage, paidToIncomeTax, paidToInss, paidToSyndicate, netSalary, grossSalary;
        int hoursInAMonth;

        System.out.println("how much you earn per hour?");
        hourlyWage = keyboard.nextDouble();
        System.out.println("\nhow many hours you work monthly?");
        hoursInAMonth = keyboard.nextInt();

        grossSalary = (double) (hourlyWage * hoursInAMonth);

        paidToIncomeTax = (grossSalary * 0.11);
        paidToInss = (grossSalary * 0.08);
        paidToSyndicate = (grossSalary * 0.05);

        netSalary = (grossSalary - (0.24 * grossSalary));

        System.out.println("+ Gross Salary : R$" + grossSalary + 
        "\n- IR: R$" + paidToIncomeTax + 
        "\n- INSS: R$" + paidToInss + 
        "\n- Syndicate: R$" + paidToSyndicate + 
        "\n= Net Salary: R$" + netSalary);

        keyboard.close();
    }
}