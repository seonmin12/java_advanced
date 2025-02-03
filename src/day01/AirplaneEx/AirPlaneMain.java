package day01.AirplaneEx;

public class AirPlaneMain {
    public static void main(String[] args) {
        //Airplane 생성, 이륙, 날다, 착륙하다 수행
        AirPlane airPlane = new AirPlane();
        airPlane.land();
        airPlane.fly();
        airPlane.takeOff();


        //SuperAirPlane 생성, 이륙, 날다, 착륙하다 수행
        SuperAirPlane superAirPlane = new SuperAirPlane();
        superAirPlane.land();
        superAirPlane.flyMode = SuperAirPlane.ADVANCED; //상수 접근할때 클래스명으로 접근함
        superAirPlane.fly();
        superAirPlane.takeOff();
    }
}
