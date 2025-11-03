class Human {
    String name;
    int age;

    Human() {
    }

    Human(String n, int a) {
        name = n;
        age = a;
    }

    String toStr() {
        return (name + ": " + age); 
    }

}

class HumanMain {
    public static void main(String[] args) {
        Human hong = new Human("홍길동", 21);    
        Human eulji = new Human("을지문덕", 55);

        System.out.println(hong.toStr());
        System.out.println(eulji.toStr());

    }

}

class Student extends Human {
    String major;
    static int sCount = 0;
    int sNo;

    Student() {
        sNo = ++sCount;
    }

    Student(String n, int a, String m) {
        super(n, a);
        major = m;

        sNo = ++sCount;
    }

    @Override
    String toStr() {
        return (super.toStr() + ":" + major + ":" + sNo);
    }

}

class StudentMain {
    public static void main(String[] args) {
        Student hong = new Student();    
        Student eulji = new Student("을지문덕", 55, "군사학과");

        System.out.println(hong.toStr());
        System.out.println(eulji.toStr());
        System.out.println("총 학생 수: " + Student.sCount + "명");
    }

}
