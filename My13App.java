import java.util.Scanner;
public class My13App {
    public static void main(String[] args) {
        int day, month;
        String burc;
        Scanner input = new Scanner(System.in);

        System.out.print("Ay: ");
        month = input.nextInt();

        System.out.print("Gun: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day>=1 && day<=21) {
                    System.out.print("Oglak burcusunuz");
                    if (day>=22 && day<=31){
                        System.out.print("Kova burcusunuz");
                    }
                } else {
                    System.out.print("Gecersiz");
                }
                break;
            case 2:
                if (day>=1 && day<=19) {
                    System.out.print("Kova burcusunuz");
                    if (day>=20 && day<=29){
                        System.out.print("Balik burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
            case 3:
                if (day>=1 && day<=20) {
                    System.out.print("Balik burcusunuz");
                    if (day>=21 && day<=31){
                        System.out.print("Koc burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
            case 4:
                if (day>=1 && day<=20) {
                    System.out.print("Koc burcusunuz");
                    if (day>=21 && day<=30){
                        System.out.print("Boga burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
            case 5:
                if (day>=1 && day<=21) {
                    System.out.print("Boga burcusunuz");
                    if (day>=22 && day<=31){
                        System.out.print("Ikizler burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
            case 6:
                if (day>=1 && day<=22) {
                    System.out.print("Ikizler burcusunuz");
                    if (day>=23 && day<=30){
                        System.out.print("Yengec burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
            case 7:
                if (day>=1 && day<=22) {
                    System.out.print("Yengec burcusunuz");
                    if (day>=23 && day<=31){
                        System.out.print("Aslan burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
            case 8:
                if (day>=1 && day<=22) {
                    System.out.print("Aslan burcusunuz");
                    if (day>=23 && day<=31){
                        System.out.print("Basak burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
            case 9:
                if (day>=1 && day<=22) {
                    System.out.print("Basak burcusunuz");
                    if (day>=23 && day<=30){
                        System.out.print("Terazi burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
            case 10:
                if (day>=1 && day<=22) {
                    System.out.print("Terazi burcusunuz");
                    if (day>=23 && day<=31){
                        System.out.print("Akrep burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
            case 11:
                if (day>=1 && day<=21) {
                    System.out.print("Akrep burcusunuz");
                    if (day>=22 && day<=30){
                        System.out.print("Yay burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
            case 12:
                if (day>=1 && day<=21) {
                    System.out.print("Yay burcusunuz");
                    if (day>=22 && day<=31){
                        System.out.print("Oglak burcusunuz");
                    }
                } else {
                    System.out.print("gecersiz");
                }
                break;
        }
    }
}
