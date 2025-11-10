class Animal {
	String name;
	int age;
	int num;
	Animal() {
	}
	Animal(String a, int b, int c) {
		name = a;
		age = b;
		num = c;
	}
	void setName(String a) {
		name = a;
	}
	void setAge(int a) {
		age = a;
	}
	void setNum(int a) {
		num = a;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	int getNum() {
		return num;
	}
}

class Animal {
	String name;
	int age;
	private int num;
	Animal() {
	}
	Animal(String a, int b, int c) {
		name = a;
		age = b;
		num = c;
	}
	void setName(String a) {
		name = a;
	}
	void setAge(int a) {
		age = a;
	}
	void setNum(int a) {
		num = a;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	int getNum() {
		return num;
	}
	void printAnimal(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(num);
	}
}

class Pet extends Animal{
	String place;
	Pet(){
	}
	Pet(String a, int b, int c, String d){
		super(a,b,c);
		//name=a;
		//age=b;
		//setNum(c);
		place=d;
	}
	void setPlace(String a){
		place=a;
	}
	String getPlace(){
		return place;
	}
}

class Pet extends Animal{
	String place;
	Pet(){
	}
	Pet(String a, int b, int c, String d){
		super(a,b,c);
		//name=a;
		//age=b;
		//setNum(c);
		place=d;
	}
	void setPlace(String a){
		place=a;
	}
	String getPlace(){
		return place;
	}
	void printPet(){
		printAnimal();
		//System.out.println(getName());
		//System.out.println(getAge());
		//System.out.println(getNum());
		System.out.println(place);
	}
}

class Cat extends Pet{
	int weight;
	Cat(){
	}
	Cat(String a, int b, int c, String d, int e){
		super(a,b,c,d);
		weight=e;
	}
	void setWeight(int a){
		weight=a;
	}
	int getWeight(){
		return weight;
	}
}

class Cat extends Pet{
	int weight;
	Cat(){
	}
	Cat(String a, int b, int c, String d, int e){
		super(a,b,c,d);
		weight=e;
	}
	void setWeight(int a){
		weight=a;
	}
	int getWeight(){
		return weight;
	}
	void printCat(){
        printPet();
        System.out.println(getWeight());
	}
}
