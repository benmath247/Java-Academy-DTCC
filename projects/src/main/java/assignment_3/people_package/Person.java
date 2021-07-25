package assignment_3.people_package;

/*
    This is the class you need to work on
    If you were to create a class from scratch, please remember that the name of the class should match
    the name of the file the class resides in. (this is more of a convention thing)

    Reference:
    1) https://stackoverflow.com/questions/1841847/can-i-compile-a-java-file-with-a-different-name-than-the-class
 */

public class Person //implements Comparable<Person>
    {

    private String name;
    private int age;
    private int id;

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = (int)(Math.random() * 1000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        /*return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}'
               */
        return  "Name: " + name + " \n"
                + "Age: " + age + " \n"
                + "ID: " + id + "\n";
    }

    public int compareTo(Person p)
    {
        int result = this.getAge() - p.getAge();

        if (result < 0)
            result = -1;
        else if (result > 0)
            result = 1;
        else if (result == 0)
            result = 0;

        return result;
    }

    public static void main(String[] args){



    }
}
