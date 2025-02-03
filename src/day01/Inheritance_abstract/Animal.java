package day01.Inheritance_abstract;

public abstract class Animal {
    public abstract void sound();//추상메서드, 바디 구현하지 않음
    public void breath(){
        System.out.println("동물은 숨을 쉽니다.");
    }

}
