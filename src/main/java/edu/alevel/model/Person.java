package edu.alevel.model;

public class Person {
    //private -> package(package-private) -> protected -> public
    private String name;
    private int age;
    private int gender; // (0 - men, 1 - woman, 2 - other )
    private int id;

    private int height;
    private float weight;

    public Person(int id, String name, int age, int gender, int height, float weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){
        this(0, "", 0 , 0 , 0 , 0.0f);
    }

    public String getName(){
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

    public String sayHi(){
        return "Hello";
    }

    public String sayHi(String name){
        return "Hello, " + name;
    }

    public float calculateBMI() {
        return weight / (height * height);
    }



    @Override
    public String toString() {
        return "Person {"
                + "name=" + name
                + ", age=" + age
                + ", gender=" + gender
                + ", id=" + id
                + ", height=" + height
                + ", weight=" + weight +
                '}';
    }
}
