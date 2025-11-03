class Box {
    int length, width, height;

    Box() {
    }

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    void setLength(int l) {
        length = l;
    }
    void setWidth(int w) {
        width = w;
    }
    void setHeight(int h) {
        height = h;
    }

    int getVolumn() {
        return (length * width * height);
    }

    void printVolumn() {
        System.out.println("부피: " + getVolumn());
    }

}

class ColorBox extends Box {
    String color;

    ColorBox() {
    }    

    ColorBox(int l, int w, int h, String c) {
        super(l, w, h);
        color = c;
    }

    void setColor(String c) {
        color = c;
    }

}

class ColorBoxMain {
    public static void main(String[] args) {
        ColorBox mybox = new ColorBox(3, 4, 5, "검정");
        System.out.println("색깔: " + mybox.color + "색");
        mybox.printVolumn();
        //System.out.println("부피: " + mybox.getVolumn());

    }

}