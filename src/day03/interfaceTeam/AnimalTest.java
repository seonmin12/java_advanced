package day03.interfaceTeam;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog(8);
        Animal chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);

//        if(chicken instanceof Cheatable){
//            ((Chicken)chicken).fly();
//        }

        if(cheatableChicken instanceof Cheatable){
            cheatableChicken.fly();
        }

        for(int i =0; i<3; i++){
            System.out.println(i+1 + "시간 후");
            dog.run(1);
            System.out.println("개의 이동거리 = " + dog.getDistance());
            chicken.run(1);
            System.out.println("닭의 이동거리 = " + chicken.getDistance());
            cheatableChicken.run(1);
            System.out.println("날으는 닭의 이동거리 = " + cheatableChicken.getDistance());
        }

    }
}
