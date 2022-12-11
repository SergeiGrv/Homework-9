import java.util.Comparator;

public class compareSurnameLength implements Comparator<Person> {
    protected int surnameCount;

    protected compareSurnameLength(int surnameCount) {
        this.surnameCount = surnameCount;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int count_o1 = 1;
        for (int i = 0; i < o1.getSurname().length(); i++) {
            if (o1.getSurname().charAt(i) == ' ' || o1.getSurname().charAt(i) == '-') {
                count_o1++;
            }
        }

        int count_o2 = 1;
        for (int i = 0; i < o2.getSurname().length(); i++) {
            if (o2.getSurname().charAt(i) == ' ' || o2.getSurname().charAt(i) == '-') {
                count_o2++;
            }
        }
        if (count_o1 == count_o2 || count_o1 == surnameCount) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(count_o1, count_o2);
    }
}
