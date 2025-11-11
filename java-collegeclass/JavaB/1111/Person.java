import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String addr;

    Person() {
    }

    Person(String a, int b, String c) {
        name = a;
        age = b;
        addr = c;
    }

}

class Student extends Person {
    private String sDept;
    private int sNo;
    private float avgGrade[] = new float[8];

    static int counter = 0;
    
    Student() {
        sNo = ++counter;
    }

    Student(String a, int b, String c, String d) {
        super(a, b, c);
        sDept = d;

        sNo = ++counter;
    }

    float getGPA() {
        float gpa = 0;

        for (int i = 1; i < avgGrade.length; i++) {
            gpa += avgGrade[i];
        }

        gpa /= avgGrade.length;

        return (gpa);
    }

    void setAvgGrade(float a[]) {
        avgGrade = a;
    }

    float getMinAvgGrade() {
        float min = avgGrade[0];

        for (int i=1; i<avgGrade.length; i++) {
            if (avgGrade[i] < min) {
                min = avgGrade[i];
            }
        }

        return (min);
    }

    float getMaxAvgGrade() {
        float max = avgGrade[0];

        for (int i=1; i<avgGrade.length; i++) {
            if (avgGrade[i] > max) {
                max = avgGrade[i];
            }
        }

        return (max);
    }

}

class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("정국", 25, "경기도", "IT경영");
        float x[] = new float[8];

        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<x.length; i++) {
            x[i] = sc.nextFloat();
            
        }
        s1.setAvgGrade(x);

        System.out.println("평균 학점: " + s1.getGPA());
        System.out.println("최저 학점: " + s1.getMinAvgGrade());
        System.out.println("최고 학점: " + s1.getMaxAvgGrade());
    }

}