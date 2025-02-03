package day01.phoneEx;

public class Smartphone extends Phone {
    //추가 필드 선언
    public boolean wifi;

    //생성자 선언
    public Smartphone(String model, String color){
       super(model,color);// super 키워드는 맨 첫줄에 삽입이 되어야 함, 반드시 작성
    }

    //추가 기능
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        if(this.wifi != false) internet();
    }

    public void internet(){
        System.out.println("인터넷을 연결합니다.");
    }

    @Override
    public void bell() {
        System.out.println("기존 벨소리");
        super.bell(); //공동 작업 처리 기법 이용

        System.out.println("추가된 벨소리");
        System.out.println("벨이 띠리리리링 울린다.");
    }

}
