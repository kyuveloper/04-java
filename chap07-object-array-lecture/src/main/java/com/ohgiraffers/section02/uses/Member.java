package main.java.com.ohgiraffers.section02.uses;

public class Member {

    private int num;
    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;

    public Member() {}
    Member(int num, String id, String pwd, String name, int age, char gender) { // 접근 제어자 안쓰면 기본값은 default Member
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getNum() { //자신을 반환해야하기 때문에 반환형 있음
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


// 오버라이딩(@overriding)은 부모가 가진 기능을 내가 상속 받아서 재정의하여 사용함
    public String getinfo() { // ((no==1)->6) 인스턴스의 필드를 문자열로 만들어서 반환한다.
        return "Member{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
