
import java.util.Scanner;

public class My17App {
    public static void main(String[] args) {
        int a, b, sum = 0, count = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("b = ");
        b = input.nextInt();

        for (a=1; a <= b; a++) {
            if (a % 3 == 0 && a % 4 == 0){
                System.out.println(a);
                sum+=a;
                count++;
            }
        }

        if (count > 0){
            ortalama = sum / count;
            System.out.print("ortalama " + ortalama);
        }else{
            System.out.print("eded yoxdur");
        }
    }
}