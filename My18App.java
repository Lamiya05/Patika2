import java.util.Scanner;

public class My18App {
    public static void numbers(){
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.print("Eded daxil edin: ");
            number = input.nextInt();

            if (number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);

        System.out.println("Cem: " + sum);
    }

    public static void main(String[] args) {
        numbers();
    }
}
