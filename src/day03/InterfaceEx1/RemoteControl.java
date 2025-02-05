package day03.InterfaceEx1;

public interface RemoteControl {

    //가장 큰 볼륨을 저장할 멤버 30 값 할당
    public static final int MAX_VOLUME = 30;
    //가장 작은 볼륨을 저장할 멤버 0 할당
    int MIN_VOLUME = 0;

    public void turnOn();// 바디가 없는 메소드는 컴파일러가 자동으로 abstract 붙여줌
    public void turnOff(); //바디 {}

    public abstract void setVolume(int volume); //볼륨 세팅



}
