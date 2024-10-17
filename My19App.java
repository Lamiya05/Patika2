import java.util.Scanner;

public class My19App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i;
        System.out.print("n: ");
        n = scanner.nextInt();

        System.out.println("4'ün quvvetleri:");
        for ( i = 1; i<= n; i*=4) {
            System.out.println(i);
        }

        System.out.println("5'in quvvetleri:");
        for ( i = 1; i<=n; i*=5) {
            System.out.println(i);
        }
    }
}