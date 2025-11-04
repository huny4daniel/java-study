interface Power {
    int VOLT = 220;
    int FREQUENCY = 60;

    void powerOn();
    void powerOff();
    
}

class Tv implements Power {
    int size;

    @Override
    public void powerOn() {
        System.out.println("ON");
    }

    @Override
    public void powerOff() {
        System.out.println("OFF");
    }

}

class LedTv extends Tv {
    int resolution;

}