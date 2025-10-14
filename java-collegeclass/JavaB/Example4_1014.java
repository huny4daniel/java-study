class Ex2 {
    public static void main(String[] args) {
        Watch myWatch = new Watch("Google", 2025, "Pixel Watch");
        myWatch.print();
    }
}

class Watch {
    String company;
    int year;
    String model;

    Watch(){
        
    }

    Watch(String a, int b, String c){
        company = a;
        year = b;
        model = c;
    }

    void print(){
        System.out.println(company + " " + year + " " + model);
    }

}
