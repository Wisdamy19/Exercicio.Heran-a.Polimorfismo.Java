package Contribuinte;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        List<PessoaFisica> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();

        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.println("Individual or Company (i/c) ?");
            char ch = scan.next().charAt(0);
            if (ch == 'i'){
                System.out.println("Payer data #" + (i + 1));
                System.out.print("Name: ");
                String name = scan.next();
                System.out.print("Annual income: ");
                double annualIncome = scan.nextDouble();
                scan.nextLine();

                System.out.print("Health expenditures: ");
                double healthExpend = scan.nextDouble();
                scan.nextLine();

                PessoaFisica pessoaFisica = new PessoaFisica(name, annualIncome, healthExpend);
                list.add(pessoaFisica);
            }
            if (ch == 'c'){
                System.out.println("Payer data #" + (i + 1));
                System.out.print("Name:");
                String name = scan.next();
                System.out.print("Anual income: ");
                double annualIncome = scan.nextDouble();
                scan.nextLine();

                System.out.print("Numbers of employees: ");
                int employees = scan.nextInt();
                scan.nextLine();

                PessoaJuridica pessoaJuridica = new PessoaJuridica(name, annualIncome, employees);
                list.add(pessoaJuridica);

            }
        }

        System.out.println("Taxes Paid:");
        double sum = 0.0;
        for (PessoaFisica item : list){
            System.out.println(item.taxPaid());
            sum += item.taxCost();
        }
        System.out.println("Total Paid: $ " + sum);
    }
}
