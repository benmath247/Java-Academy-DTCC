package assignment_3.people_package;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2){
        int result = p1.getAge() - p2.getAge();

        if (result < 0)
            result = -1;
        else if (result > 0)
            result = 1;
        else if (result == 0)
            result = 0;

        return result;
    }

}
