package day03.InterfaceEx2;

import day01.package1.A;

public class Cat extends Tail implements Animal, Pet {

    public Cat(){

    }

    @Override
    public void cry() {
        System.out.println("야옹");

    }

    @Override
    public void play() {
        System.out.println("고양이 노는중");

    }
}
