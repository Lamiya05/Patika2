import java.util.Scanner;
public class My16App {
    public static void main(String[] args) {
        int yil;
        double artikyil = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Yil Giriniz : ");
        yil = input.nextInt();

        artikyil = yil % 4;

        if (artikyil == 0) {
            System.out.print(yil + " bir artık yıldır !");
        } else {
            System.out.print(yil + " bir artık yıldır değildir !");
        }
    }
}
