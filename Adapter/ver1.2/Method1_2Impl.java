class Method1_2Impl implements Method1_2{
    Method1_1 m1;

    Method1_2Impl() {
        m1 = new Method1_1Impl();
    }
    public void method1_2A() {
        m1.method1_1A();
    }
    public void method1_2B() {
        m1.method1_1B();
    }
}