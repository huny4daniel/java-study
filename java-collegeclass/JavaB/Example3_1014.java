import java.util.Scanner;
class AirConditioner {

   AirConditioner(){
      
   }
   AirConditioner(double a, boolean b){
      temp = a;
      power = b;
   }

   double temp;
   boolean power;
   Scanner scan = new Scanner(System.in);

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

      Condtioner1.setPower();
      Condtioner2.setPower();

      Condtioner1.printTemp();
      Condtioner2.printTemp();

      System.out.println("설정하신 온도로 변경합니다");
      
      Condtioner1.setTemp(18);
      Condtioner2.setTemp(22);
      
      Condtioner1.printTemp();
      Condtioner2.printTemp();
      
   }
}