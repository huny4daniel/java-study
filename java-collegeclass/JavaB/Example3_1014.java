import java.util.Scanner;
class AirConditioner {

   double temp;
   boolean power;
   
   AirConditioner(){
      
   }
   AirConditioner(double a, boolean b){
      temp = a;
      power = b;
   }


   void setPower() {
      power =! power;
   }

   void setTemp(double a){
      temp = a;
   }

   double getTemp(){
      return temp;
   }

   void printTemp(){
      System.out.println("현재 온도는 " + temp + "도 입니다.");
   }

   void upTemp(){
      temp++;
   }

   void downTemp(){
      temp--;
   }

}

class AirMain{
   public static void main(String[] args) {
      AirConditioner Condtioner1 = new AirConditioner();
      AirConditioner Condtioner2 = new AirConditioner();

      Scanner scan = new Scanner(System.in);
      double setScan1 = scan.nextInt();
      double setScan2 = scan.nextInt();
      scan.close();

      Condtioner1.setPower();
      Condtioner2.setPower();

      Condtioner1.printTemp();
      Condtioner2.printTemp();

      System.out.println("설정하신 온도로 변경합니다");
      
      Condtioner1.setTemp(setScan1);
      Condtioner2.setTemp(setScan2);
      
      Condtioner1.printTemp();
      Condtioner2.printTemp();
      
   }
}