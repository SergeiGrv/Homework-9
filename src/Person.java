
public class Person {
    private String name;
    private String surname;
    private int age;

    protected Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        if (surname.equals("Путин")) {
            System.out.println("За вами выехали!");
        } else {
            this.surname = surname;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 100) {
            System.out.println("Введите правильный возраст!");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + surname + ", " + age + " год(а)/лет";
    }

}
