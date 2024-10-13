import java.util.Scanner;
public class MyEleventhApp {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
         System.out.print("Hava sicakligini giriniz: ");
         heat = input.nextInt();

         if (heat < 5){
             System.out.print("Kayak yap");
         }
         if (heat > 5 && heat < 15){
             System.out.print("Sinemaya git");
         }
         if (heat > 15 && heat < 25 ) {
             System.out.print("piknik yap");
         }
         if (heat > 25){
             System.out.print("yuz");
         }
    }
}
