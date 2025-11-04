abstract class Figure {
    int w, h;

    Figure() {
    }
    
    void setValue(int a, int b) {
        w = a;
        h = b;
    }

    abstract double getArea();

}

class Rectangle extends Figure {
    Rectangle() {
    }

    @Override
    double getArea() {
        double extent = w * h;

        return extent;
    }
    
}

class Triangle extends Figure {
    Triangle() {
    }

    @Override
    double getArea() {
        double extent = (w * h) / 2.0;

        return extent;
    }
    
}

class Squrae extends Rectangle {
    Squrae() {
    }

    void setValue(int a) {
        setValue(a, a);
    }

}

class FigureMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Squrae squrae = new Squrae();
        Triangle triangle = new Triangle();

        rectangle.setValue(1, 2);
        squrae.setValue(2);
        triangle.setValue(4, 5);

        System.out.println("사각형의 넓이: " + rectangle.getArea());
        System.out.println("정사각형의 넓이: " + squrae.getArea());
        System.out.println("삼각형의 넓이: " + triangle.getArea());
    }

}



