package day01;

public class PromotionMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = cat;
        //cat과 animal 변수랑 타입만 다를 뿐이지 동일한 Cat 객체를 참조

        System.out.println(cat == animal);
    }


}
