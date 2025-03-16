package com.korit.strategyPattern;

public class App {
    //dip도 들어가 있음 - 추상화 구제적인것들응 추상화로 바라본다.
    //객체들이 할수 있는 행위 각가에 대한 전약 클래스를 생성하고 유사한 행위들을 캡슐화 하는 인터페이스
    //행위를 동적으로 바꾸고 싶은 걍우 직접 행위를 수정하지 않고 전랙을 바꿔주기만 함으로써 행위를 유연하게 확장하는 방법
    //행위들 각각을 전약으로 만들어 놓고 동적으로 행위의 수정 필요한 경우 전약을 바꾸는 것만으로
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        Doorman dm = new Doorman();
        dm.getout(m);
        dm.getout(c);
    }
}
