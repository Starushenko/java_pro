

import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Product product = new Product("tools", 1000);
        List<Product> task1 = List.of(
                new Product("fruit", 100),
                new Product("book", 300),
                new Product("book", 250),
                new Product("book", 251),
                new Product("fruit", 400)
        );
        List<Product> task2 = List.of(
                new Product("fruit", 100, 0, LocalDate.of(2023, 1, 14)),
                new Product("book", 75, 10, LocalDate.of(2023, 3, 8)),
                new Product("book", 74, 10, LocalDate.of(2023, 2, 28)),
                new Product("book", 251, 10, LocalDate.of(2023, 1, 23)),
                new Product("fruit", 400, 0, LocalDate.of(2023, 1, 13))
        );

        List<Product> task6 = List.of(
                new Product("fruit", 100, 0, LocalDate.of(2023, 1, 14), 1110202),
                new Product("book", 75, 10, LocalDate.of(2023, 3, 8), 2123234),
                new Product("book", 74, 10, LocalDate.of(2023, 2, 28), 3232445),
                new Product("book", 251, 10, LocalDate.of(2023, 1, 23), 324234),
                new Product("fruit", 400, 0, LocalDate.of(2023, 1, 13), 4324234)
        );


        product.taskOne(task1, 250);
        product.taskTwo(task2);
        product.taskThree(task2, "book");
        product.taskFour(task2);
        System.out.println(product.taskFive(task2));
        System.out.println(product.taskSix(task6));



    }
}