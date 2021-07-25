package assignment_3.people_package;

import java.util.*;
import java.util.ArrayList;

public class PeopleOperations {
    public static void main (String args []) throws Exception {

        /*
            Please ensure that you create an ArrayList of Person(s) with at least
            4 members
         */
        Person charizard = new Person("Charizard", 1, (int) (Math.random() * 100));
        Person charmeleon = new Person("Charmeleon", 2, (int) (Math.random() * 100));
        Person charmander = new Person("Charmander", 3, (int) (Math.random() * 100));
        Person pikachu = new Person("Pikachu", 4, (int) (Math.random() * 100));

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(charizard);
        people.add(charmander);
        people.add(charmeleon);
        people.add(pikachu);


        Person youngestPerson = getYoungestPerson(people);
        Person oldestPerson = getOldestPerson(people);
        ArrayList<Person> sortedByAgeList = getSortedListByAge(people);
//        ArrayList<Person> sortedByNameList = getSortedListByName(people, false);


        /*
            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the
            Person class!
         */

        for(Person p : sortedByAgeList) {
            System.out.println(p);
        }

//        for(Person p : sortedByNameList) {
//            System.out.println(p);
//        }
    System.out.println("Oldest Person:" + getOldestPerson(people));
        System.out.println("Youngest Person:" + getYoungestPerson(people));
    }

    private static ArrayList<Person> getSortedListByAge(ArrayList<Person> people) {
        Collections.sort(people, new AgeComparator());	// sorting in ascending order.
        //System.out.println("Ascending order: ");
        //for (Person p : people) {
          //  System.out.println(p);
        //}
        return people;
    }

    public static Person getYoungestPerson(ArrayList<Person> people) {
        //int youngestAge;
//        Person youngestPerson;
//        for (int i = 0 ; i < people.size()-1 ; i++) {
//            ArrayList p = people[i];
//            if (youngestAge = null || p.getAge() < youngestAge) {
//                youngestPerson = p;
//                youngestAge = p.getAge();
//            }
//        }
        return getSortedListByAge(people, true).get(0);
    }

    public static Person getOldestPerson(ArrayList<Person> people) {
//        private ArrayList SortedPeople = getSortedListByAge(ArrayList<Person>);
        return getSortedListByAge(people, true).get(people.size()-1);
    }


    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> people, boolean isAscending) {

        if (isAscending) {
            Collections.sort(people, new AgeComparator());
        }
        else {
            Collections.sort(people, Collections.reverseOrder());
        }
            return people;
          }

//              sorted = true;
//              for (int i = 0; i < people.length() - 1; i++) {
//
//                if (people[i].getAge() > people[i+1].getAge() && isAscending == true) {
//                    temp = people[i];
//                    people[i] = people[i+1];
//                    people[i+1] = temp;
//                    sorted = false;
//                }
//                else if (people[i].getAge() < people[i+1].getAge() && isAscending == false) {
//                    temp = people[i];
//                    people[i] = people[i+1];
//                    people[i+1] = temp;
//                    sorted = false;
//                }
//            }
//        }
//        return people;
//    }

      public static ArrayList<Person> getSortedListByName(ArrayList<Person> people, boolean isAscending) {
//        if (isAscending) {
//            Collections.sort(people);
//        }
//        else if (!isAscending) {
//            Collections.sort(people);
//            Collections.reverse(people);
//        }
//    return people;


          if (isAscending) {
              Collections.sort(people, new NameComparator());
          }
          else {
              Collections.sort(people, Collections.reverseOrder());
          }
          return people;
      }

    }


