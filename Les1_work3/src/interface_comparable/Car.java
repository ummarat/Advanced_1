package interface_comparable;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.speed + " " + this.price + " " + this.model + " " + this.color;
    }

    // Сортуємо за швидкістю/ціною/моделлю/кольором
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car) o).speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            temp = this.price - ((Car) o).price;
            if (temp == 0) {
                temp = this.model.compareTo(((Car) o).model);
                if (temp == 0)
                    return this.color.compareTo(((Car) o).color);
            } else return temp;
        } else return temp;
        return temp;
    }
}