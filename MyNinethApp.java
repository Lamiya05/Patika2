import java.util.Scanner;

public class MyNinethApp {
    public static void main(String[] args) {
        String password, response, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (password.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz? (evet/hayır): ");
            response = input.nextLine();

            if (response.equals("evet")) {
                System.out.print("Yeni şifre oluşturun: ");
                newPassword = input.nextLine();

                if (!newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturuldu!");
                } else {
                    System.out.println("Yeni şifre eski şifre ile aynı olamaz!");
                }
            } else {
                System.out.println("İşlem iptal edildi.");
            }
        }
    }
}
