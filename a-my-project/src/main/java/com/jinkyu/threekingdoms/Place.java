package main.java.com.jinkyu.threekingdoms;

public class Place {

    private String name;
    private int popul;
    private int luck;
    private int power;
    private int edu;

    Random random = new Random();
    public Place() {};

    Place(String name, int popul, int luck, int power, int edu) {
        this.name = name;
        this.popul = popul;
        this.luck = luck;
        this.power = power;
        this.edu = edu;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopul() {
        return popul;
    }

    public void setPopul(int popul) {
        this.popul = popul;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getEdu() {
        return edu;
    }

    public void setEdu(int edu) {
        this.edu = edu;
    }

    public void selectChok() {
        System.out.println();
    }


}
