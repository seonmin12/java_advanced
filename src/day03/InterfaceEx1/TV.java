package day03.InterfaceEx1;

public class TV implements RemoteControl {

    private int volume;
    @Override
    public void turnOn() {
        System.out.println("티비의 전원을 켭니다.");
    }

    @Override
    public void turnOff() { //인터페이스에서 선언된 전원 on/off TV 스펙에 맞춰 기능 구현
        System.out.println("티비의 전원을 끕니다.");

    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.println("현재 해당 제품의 볼륨 최대값으로 설정 되었습니다.");
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.println("mute");
        }else{
            this.volume = volume;
        }
        System.out.println("볼륨을" +" " + this.volume + "으로 설정합니다.");

    }
}
