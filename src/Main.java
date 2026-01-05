import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("Dilnaz", "Kostanai", "Singer", 27045.78));
        people.add(new Employee("Dias", "Kulmash", "Guitarist", 50000.00));

        people.add(new Student("Nurseyit", "Kalybai", 2.3));
        people.add(new Student("Alfarabi", "Yakhiya", 3.5));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person p : persons) {
            System.out.printf(
                    "%s earns %.2f tenge%n",
                    p.toString(),
                    p.getPaymentAmount()
            );
        }
    }
}
