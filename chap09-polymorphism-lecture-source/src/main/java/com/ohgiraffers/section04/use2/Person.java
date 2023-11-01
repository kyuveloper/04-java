package main.java.com.ohgiraffers.section04.use2;

public class Person {

    private SaveProvider saveProvider;

    public Person(SaveProvider saveProvider) {
        this.saveProvider = saveProvider;
    }

    public void doSomething() {
        String data = "String data";
        saveProvider.save(data);
    }
}
