package day03.InterfaceEx1;

public interface RemoteControlMain {

    public static void main(String[] args) {
        RemoteControl remoteControl;
        remoteControl = new TV();  //인터페이스 자신을 구현한 구현객체(tv)를 담을 수 있다.
        remoteControl.turnOn(); //TV의 전원 ON
        remoteControl = new Radio(); //rc 변수에 Radio 교체(대입)
        remoteControl.turnOn(); // rc를 이용하여 라디오 전원 ON
        System.out.println("리모컨의 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모컨의 최소 볼륨: " + RemoteControl.MIN_VOLUME);


    }
}
