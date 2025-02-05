package day03.InterfaceEx1;

public class Radio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("라디오를 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끈다.");

    }
}
