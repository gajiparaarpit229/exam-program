class Demo {
    static int staticVar = 10;
    int instanceVar;

    Demo(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    void display() {
        System.out.println("Instance variable accessed using this: " + this.instanceVar);
    }

    public static void main(String[] args) {
        Demo obj1 = new Demo(100);
        Demo obj2 = new Demo(200);
        obj1.display();
        obj2.display();
    }
}
