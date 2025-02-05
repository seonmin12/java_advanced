package day03.InterfaceEx1;

public class TV implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("티비의 전원을 켭니다.");
    }

    @Override
    public void turnOff() { //인터페이스에서 선언된 전원 on/off TV 스펙에 맞춰 기능 구현
        System.out.println("티비의 전원을 끕니다.");

    }
}
