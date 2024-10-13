import java.util.Scanner;
public class MyEigthApp {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi girin: ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi girin: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciniz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bolme: " + (n1 / n2));
                break;
            default:
                System.out.println("Hata");
        }
    }
}
