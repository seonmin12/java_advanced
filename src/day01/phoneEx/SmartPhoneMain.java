package day01.phoneEx;

public class SmartPhoneMain {
    public static void main(String[] args) {

        Smartphone myphone = new Smartphone("갤럭시", "흰색");

        //Phone 으로부터 상속 받은 필드 읽어서 출력
        System.out.println(myphone.model);
        System.out.println(myphone.color);

        //Smartphone의 필드 읽어서 출력
        System.out.println(myphone.wifi);

        //Phone 으로부터 상속 받은 메소드 호출
        myphone.bell();

        //Smartphone 으로부터 상속받은 메소드 호출
        myphone.setWifi(true);
    }
}
