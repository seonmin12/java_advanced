package day03.InterfaceEx1;

public class Radio implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("라디오를 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끈다.");

    }

    @Override
    public void setVolume(int volume) {
        if(volume >RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
            System.out.println("볼륨을" + " " + this.volume + "으로 설정하고 확인합니다.");
        }


    }
}
