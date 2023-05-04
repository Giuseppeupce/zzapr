package week6;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    

    public void stampIdentity() {
        System.out.println("Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Age: " + this.getAge());
    }

    @Override
    public String toString() {
        return "{Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Age: " + this.getAge() + "}";
    }
}
