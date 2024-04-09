interface A {
    int CONSTANT_A = 10;

    void methodA();
}

interface A1 extends A {
    int CONSTANT_A1 = 20;

    void methodA1();
}
interface A2 extends A {
    int CONSTANT_A2 = 30;

    void methodA2();
}
interface A12 extends A1, A2 {
    void methodA12();
}

class B implements A12 {
    @Override
    public void methodA() {
        System.out.println("Constant A: " + CONSTANT_A);
    }

    @Override
    public void methodA1() {
        System.out.println("Constant A1: " + CONSTANT_A1);
    }

    @Override
    public void methodA2() {
        System.out.println("Constant A2: " + CONSTANT_A2);
    }

    @Override
    public void methodA12() {
        System.out.println("Method A12 implementation in B");
    }
}

public class Inter {
    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        b.methodA1();
        b.methodA2();
        b.methodA12();
    }
}
