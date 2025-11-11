interface A {
    public static final int a = 2;
    abstract void say();
}

class B implements A {
    public void say() {
        System.out.println("hi");
    }
}