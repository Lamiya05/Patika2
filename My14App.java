import java.util.Scanner;

public class My14App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas, yolculukTipi;
        double normalTutar, yasIndirimi = 0, yolculukIndirimi = 0, toplamTutar;

        // Kullanıcıdan verileri alalım
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();

        // Verilerin geçerliliğini kontrol edelim
        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {

            // Normal tutarı hesaplayalım (mesafe başına 0.10 TL)
            normalTutar = mesafe * 0.10;

            // Yaş indirimi hesaplama
            if (yas < 12) {
                yasIndirimi = 0.50; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = 0.10; // %10 indirim
            } else if (yas > 65) {
                yasIndirimi = 0.30; // %30 indirim
            }

            // Yaş indirimini uygulayalım
            toplamTutar = normalTutar - (normalTutar * yasIndirimi);

            // Yolculuk tipi indirimini kontrol edelim
            if (yolculukTipi == 2) {
                yolculukIndirimi = 0.20; // Gidiş-Dönüş için %20 indirim
                toplamTutar = (toplamTutar * 2) - (toplamTutar * yolculukIndirimi * 2);
            }

            // Toplam tutarı ekrana yazdıralım
            System.out.println("Toplam Bilet Fiyatı: " + toplamTutar + " TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
