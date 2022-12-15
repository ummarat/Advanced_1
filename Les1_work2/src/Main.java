import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Виведення на екран елементів List: Створити список, заповнити його на 10 елементів
 * та вивести на екран вміст, використовуючи iterator.*/

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer tmp = it.next();
            System.out.print(tmp + " ");
        }
    }
}