package sprint4Evaluation._1QuestionNumber1;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<Product> productList = new TreeSet<>();

        for(int i=0;i<4;i++){
            System.out.println("Enter Product Name :");
            String productName = scanner.next();
            System.out.println("Enter Product Price :");
            Double productPrice = scanner.nextDouble();

            Product product = new Product(productName,productPrice);
            productList.add(product);
        }

        for (Product p:productList) {
            System.out.println(p);
        }
    }
}
