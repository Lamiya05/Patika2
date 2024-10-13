import java.util.Scanner;
public class MyTwentyApp {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
         System.out.print("A - giriniz: ");
         a = input.nextInt();

        System.out.print("B - giriniz: ");
        b = input.nextInt();

        System.out.print("C - giriniz: ");
        c = input.nextInt();

        if ((a>b) && (a>c)) {
            if (b>c) {
                System.out.print("a>b>c");
            } else {
                System.out.print("a>c>b");
            }
        } else if ((b>a) && (b>c)) {
            if (a>c){
                System.out.print("b>a>c");
            } else {
                System.out.print("b>c>a");
            }
        } else if ((c>b) && (c>a)) {
            if (b>a) {
                System.out.print("c>b>a");
            } else {
                System.out.print("c>a>b");
            }
        }

    }
}
