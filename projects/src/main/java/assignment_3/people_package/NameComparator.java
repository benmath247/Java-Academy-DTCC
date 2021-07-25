package assignment_3.people_package;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2){
        int result = p1.getName().compareTo(p2.getName());

        if (result < 0)
            result = -1;
        else if (result > 0)
            result = 1;
        else if (result == 0)
            result = 0;

        return result;
}}
