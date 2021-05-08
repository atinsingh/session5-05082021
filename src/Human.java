public class Human {
    // You can declare  and define the variable
    // any variable written in class without static keyword are
    // called instance variable
    String name;
    int age ;

    // You can write method

    // When you write a method in a class without
    // static keyword they are called instance method

    // Constructor is like method with certain rules
    // A constructor can't have a return type


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sleep(int sleepTime) {
        this.name = "Atin";
        System.out.println("Sleeping");
    }
    public void eat() {
        System.out.println(this.name + " is Sleeping");
        System.out.println("Eating");
    }

    public void printDetails() {
        System.out.println(" Name is => "+ this.name);
        System.out.println(" Age is => "+ this.age);
    }

    // X - can't write statement in class


    // class can have other type



}
