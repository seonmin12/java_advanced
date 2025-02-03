package day01;

class A{

}
class B extends A{

}
class D extends B{

}
class C extends A{

}
class E extends C{

}
public class PromotionMain1 {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    //상속 관계에 있음(자동 변환)
    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    B b1 = d;
    C c1 = e;

    // B b2 = e; //컴파일에러(상속 관계에 있지 않다)
    // C c2 = d;


}
