package day01.phoneEx;

public class Phone {
    //필드 선언
    public String model;
    public String color;

    //생성자 선언
//    public Phone(){}
    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone (model, color) 생성자 실행");
    }

    //메소드
    public void bell(){
        System.out.println("벨이 띠링띠링 울린다.");
    }

    public final void volumeUp(){
        System.out.println("볼륨을 줄입니다");
    }
}
