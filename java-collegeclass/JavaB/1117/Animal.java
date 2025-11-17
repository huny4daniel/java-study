interface Animal {
    int NECKBONE = 7;

    void sayHello();

}

class Mammal {
}

abstract class Human extends Mammal implements Animal {
    protected String name;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }
    
}
