package com.korit.strategyPattern;

public class App {
  //dip도 들어가 있음 - 추상화 구제적인것들응 추상화로 바라본다.
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        Doorman dm = new Doorman();
        dm.getout(m);
        dm.getout(c);
    }
}
