import java.util.Scanner;

public class MyTenthApp {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        double toplam = 0, gecerliNotSayisi = 0, ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            gecerliNotSayisi++;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            gecerliNotSayisi++;
        }

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            gecerliNotSayisi++;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            gecerliNotSayisi++;
        }

        System.out.print("Muzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            gecerliNotSayisi++;
        }

        // Ortalamayı hesaplayalım
        if (gecerliNotSayisi > 0) {
            ortalama = toplam / gecerliNotSayisi;
            System.out.println("Ortalama: " + ortalama);
            System.out.println(ortalama >= 55 ? "Tebrikler, geçtiniz!" : "Maalesef, kaldınız.");
        } else {
            System.out.println("Hiçbir geçerli not girilmedi.");
        }

    }
}
