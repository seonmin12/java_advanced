package day02.exceptionEx.sealedEx;

public class Student extends Manager{
    //봉인된 Person 클래스의 permits가 되지 않았으므로 상속불가
    //봉인 해제된 Manager 클래스는 상속 가능
    //person의 자식 클래스이고 final 클래스인 Employee는 상속불가

    @Override
    public void work() {
        System.out.println("공부를 열심히 합니다.");
    }
}
