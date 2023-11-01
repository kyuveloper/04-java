package main.java.com.ohgiraffers.section01.polymorphism;

public class Application03 {
    public static void main(String[] args) {

        Animal animal = new Rabbit();
        Animal animal1 = new Tiger();

        Application03.feed(animal);
        Application03.feed(animal1);

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        feed(rabbit);
        feed(tiger);

        feed(new Rabbit());
        feed(new Tiger());
    }

    public static void feed(Animal animal) {
        animal.eat();
    }
}
