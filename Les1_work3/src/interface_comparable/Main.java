package interface_comparable;

import java.util.Arrays;

/*У папці з прикладами ex_004_comparable. Дописати логіку, щоб метод compareTo()
 * здійснив пошук за швидкістю (якщо ж швидкість у 2-х об'єктів дорівнює,
 * то шукаємо за ціною) -> ціною -> моделі -> кольору машини.*/

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(185, 2000, "Opel", "Black");
        Car c3 = new Car(250, 10000, "Mercedes", "White");
        Car[] c = {c1, c2, c3};

        Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
