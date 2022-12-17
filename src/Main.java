import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Василий", "Теркин", 23));
        people.add(new Person("Генадий", "Валентинов-Петров", 65));
        people.add(new Person("Ольга", "Королева", 19));
        people.add(new Person("Николай ", "Римский-Корсаков", 9));
        people.add(new Person("Анри", "ги де Мопассан", 39));
        people.add(new Person("Сепп", "Ван дер берг", 51));
        people.add(new Person("Анна", "Васильева", 15));

        Comparator<Person> comparator = (a, b) -> {
            int countOne = 1;
            for (int i = 0; i < a.getSurname().length(); i++) {
                if (a.getSurname().charAt(i) == ' ' || a.getSurname().charAt(i) == '-') {
                    countOne++;
                }
            }

            int countTwo = 1;
            for (int i = 0; i < b.getSurname().length(); i++) {
                if (b.getSurname().charAt(i) == ' ' || b.getSurname().charAt(i) == '-') {
                    countTwo++;
                }
            }
            if (countOne == countTwo) {
                return Integer.compare(a.getAge(), b.getAge());
            }
            return Integer.compare(countOne, countTwo);
        };

        people.sort(comparator.reversed());
        System.out.println("Список самых знатных людей:" + people.toString().replaceAll("^\\[|]", ""));
    }
}
