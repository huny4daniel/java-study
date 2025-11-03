class Plane{
	String name;
	private int num;

	Plane(){
	}

	Plane(String a, int b){
		name=a;
		num=b;
	}

	String getName() {
		return name;
	}

	int getNum() {
		return num;
	}

	void setNum(int a) {
		num=a;
	}

	void setName(String a) {
		name=a;
	}

	void printPlane() {
		System.out.println(getName());
		System.out.println(num);
	}
}

class PlaneMain{
	public static void main(String[] args) {
		Plane p = new Plane();
		p.name="BA";
		p.setNum(123);
		p.printPlane();

		Plane a = new Plane("BB", 50);
		a.printPlane();
	}	
}