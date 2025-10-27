class Vechicle {
    String model;
    int vin;

    Vechicle(){
    }

    Vechicle(String a, int b) {
        model = a;
        vin = b;
    }

    void printVehicle() {
        System.out.println(model);
        System.out.println(vin);
    }

    int getVin() {
        return vin;
    }

    boolean getVinType() {
        if (vin%10 == 7 || vin%10 == 9) {
            return true;
        } 
        else {
            return false;
        }
    }
}

class Ev extends Vechicle {
    int battery;

    Ev() {
    }

    Ev(String a, int b, int c) {
        super(a,b);
        battery = c;
    }

    void printElectricCar() {
        printVehicle();
        System.out.println(battery);
    }

    int charge() {
        if (battery+10 >= 100) {
            battery = 100;
        } 
        else {
            battery += 10;
        }
        
        return battery;
    }
}

class CarMain {
    public static void main(String[] args) {
        Ev e = new Ev("ITSLA", 123, 60);

        e.charge();
        e.printElectricCar();
        System.out.println(e.getVinType());
    }
}