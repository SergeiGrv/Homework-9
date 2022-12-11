import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Василий", "Теркин", 23));
        people.add(new Person("Генадий", "Валентинов-Петров", 65));
        people.add(new Person("Ольга", "Королева", 19));
        people.add(new Person("Анри", "ги де Мопассан", 39));
        people.add(new Person("Сепп", "Ван дер берг", 51));

        people.sort(new compareSurnameLength(2).reversed());
        System.out.println("Список самых знатных людей:" + people.toString().replaceAll("^\\[|]", ""));
    }
}
