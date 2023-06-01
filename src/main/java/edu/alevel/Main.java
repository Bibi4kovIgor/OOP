package edu.alevel;

import edu.alevel.model.*;

public class Main {
    public static void main(String[] args) {
        Person peter = new Person();
        peter.setAge(44);
        Person john = new Person();
        john.setName("John");
        Person ihor = new Person(1, "Ihor", 31, 0, 182, 72);
        Person anonymous = new Person("Some Name", 100);

        Person[] people = {ihor, peter, john, anonymous};
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println(ihor.sayHi());
        System.out.println(ihor.sayHi(peter.getName()));
        System.out.println(ihor.calculateBMI());
        System.out.println(peter.getAge());
        System.out.println(john.getName());


    }
}
