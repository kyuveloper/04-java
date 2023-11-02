package main.java.com.ohgiraffers.section01.generic;

public class GenericTest<T> /*<T> 추가하여 작성 T가 아니여도 되지만 대문자 T를 관례적으로 사용한다.*/{

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
