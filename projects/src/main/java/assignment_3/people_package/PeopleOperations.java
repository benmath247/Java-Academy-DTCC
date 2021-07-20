package assignment_3.people_package;

import java.util.*;
import java.util.ArrayList;

public class PeopleOperations {
    public static void main (String args []) throws Exception {
        /*
            Please ensure that you create an ArrayList of Person(s) with at least
            4 members
         */
        Person charizard = new Person("Charizard", (Math.random() * 100));
        Person charmeleon = new Person("Charmeleon", (Math.random() * 100));
        Person charmander = new Person("Charmander", (Math.random() * 100));
        Person pikachu = new Person("Pikachu", (Math.random() * 100));

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(charizard);
        people.add(charmander);
        people.add(charmeleon);
        people.add(pikachu);


        Person youngestPerson = getYoungestPerson(people);
        Person oldestPerson = getOldestPerson(people);
        ArrayList<Person> sortedByAgeList = getSortedListByAge(people);
        ArrayList<Person> sortedByNameList = getSortedListByName(people, false);


        /*
            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the
            Person class!
         */

        for(Person p : sortedByAgeList) {
            System.out.println(p);
        }

        for(Person p : sortedByNameList) {
            System.out.println(p);
        }
    }

    public static Person getYoungestPerson(ArrayList<Person> people) {
        private int youngestAge;
        private Person youngestPerson;
        for (i = 0 ; i < people.length-1 ; i++) {
            p = people[i];
            if (youngestAge = null || p.getAge() < youngestAge) {
                youngestPerson = p;
                youngestAge = p.getAge();
            }
        }
        return p;
    }

    public static Person getOldestPerson(ArrayList<Person> people) {
        private ArrayList SortedPeople = getSortedListByAge(ArrayList<Person>)
        return SortedPeople[-1];
    }


    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> people, boolean isAscending) {
        boolean sorted = false;
        myObjectClass temp;
        while(!sorted) {


            sorted = true;
            for (int i = 0; i < people.length - 1; i++) {

                if (people[i].getAge() > people[i+1].getAge() && isAscending == true) {
                    temp = people[i];
                    people[i] = people[i+1];
                    people[i+1] = temp;
                    sorted = false;
                }
                else if (people[i].getAge() < people[i+1].getAge() && isAscending == false) {
                    temp = people[i];
                    people[i] = people[i+1];
                    people[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return people;
    }

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending) {
        if (isAscending) {
            Collections.sort(people);
        }
        else if (!isAscending) {
            Collections.sort(people);
            Collections.reverse(people);
        }
    return people;
    }

}
