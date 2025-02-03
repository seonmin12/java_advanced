package day01.ex03;

public class Student extends Person {

    public int studentNo;
    public Student(String name, int studentNo){
        super(name); //디폴트 생성자 없으면 해줘야함. 디폴트 있으면 상관없음
        this.studentNo = studentNo;
    }

    public void study(){
        System.out.println("공부를 합니다.");
    }
}
