package day01.CarEx;

public class Car {
    public int speed;
    Car(){}
    Car(int speed){
        this.speed = speed;
    }

    public final void stop(){
        System.out.println("차를 멈춤");
        this.speed = 0;
    }

    public void speedUp(){
        this.speed += 1;

    }
}
