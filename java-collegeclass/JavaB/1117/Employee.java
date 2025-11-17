class Employee {
    private String name;
    private int age;
    private String addr;
    private int salary;

    Employee() {
    }

    Employee (String name, int age, String addr) {
        setAddr(addr);
        setAge(age);
        setName(name);
    }

    void setAddr(String addr) {
        this.addr = addr;
    }
    void setAge(int age) {
        this.age = age;
    }
    void setName(String name) {
        this.name = name;
    }
    void setSalary(int salary) {
        this.salary = salary;
    }

    String getAddr() {
        return addr;
    }
    int getAge() {
        return age;
    }
    String getName() {
        return name;
    }
    int getSalary() {
        return salary;
    }

    void printEmp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(addr);
    }

}

class Regular extends Employee {
    private String dept;

    Regular() {
    }

    Regular(String name, int age, String addr, int salary, String dept) {
        super(name, age, addr);
        setSalary(salary);
        setDept(dept);
    }

    void setDept(String dept) {
        this.dept = dept;
    }

    String getDept() {
        return dept;
    }

    @Override
    void printEmp() {
        System.out.println("정규직");
        super.printEmp();
    }

}

class Intern extends Employee {
    int hour;
    int wage = 7500;

    Intern() {
    }

    Intern(String name, int age, String addr, int hour, int wage) {
        super(name, age, addr);
        setHour(hour);
        setWage(wage);
    }

    void setHour(int hour) {
        this.hour = hour;
    }
    void setWage(int wage) {
        this.wage = wage;
        setSalary(wage*hour);
    }

    int getHour() {
        setSalary(wage*hour);
        return hour;
    }
    int getWage() {
        return wage;
    }

    @Override
    void printEmp() {
        super.printEmp();
        System.out.println(hour);
        System.out.println(wage);
    }

}

class EmployeeMain {
    public static void main(String[] args) {
        Regular regular = new Regular();
        Intern intern = new Intern();

        regular.printEmp();
        System.out.println("----------------");
        intern.printEmp();

        Employee employee1 = regular;
        Employee employee2 = intern;

        employee1.printEmp();
        employee2.printEmp();
    }

}
