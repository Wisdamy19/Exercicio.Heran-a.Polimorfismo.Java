package Exercicio;

import javax.imageio.ImageReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat data = new SimpleDateFormat();

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Common, used or imported (c/u/i) ?");
            char ch = scan.next().charAt(0);
            if (ch == 'c') {
                System.out.print("Name: ");
                String name = scan.next();
                System.out.print("Price: ");
                Double price = scan.nextDouble();

                Product product = new Product(name, price);
                list.add(new Product(name, price));

            } else if(ch == 'i'){
                System.out.print("Name: ");
                String name = scan.next();
                System.out.print("Price: ");
                Double price = scan.nextDouble();
                System.out.print("Customs Fee: ");
                Double CustomsFee = scan.nextDouble();

                ImportedProduct importedProduct = new ImportedProduct(name, price, CustomsFee);
                list.add(new ImportedProduct(name, price, CustomsFee));
            } else if(ch == 'u'){
                System.out.print("Name: ");
                String name = scan.next();
                System.out.print("Price: ");
                Double price = scan.nextDouble();
                System.out.println("Manufacture Date: ");
                String inputDate = scan.next();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate manufactureDate = LocalDate.parse(inputDate, formatter);

                UsedProduct usedProduct = new UsedProduct(name, price, manufactureDate);
                list.add(new UsedProduct(name, price, manufactureDate));
            }
            else System.out.println("Type a valid Category.");
        }
        System.out.println("PRICE TAGS: ");
        for (Product item : list){
            System.out.println(item.priceTag());

        }


    }
}
