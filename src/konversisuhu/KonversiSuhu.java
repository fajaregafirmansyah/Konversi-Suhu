package konversisuhu;

import java.util.Scanner;

public class KonversiSuhu {

    public static void main(String[] args) {
        MethodSuhu Shlib = new MethodSuhu();
        Scanner input = new Scanner(System.in);

        int bil;
        int bsr;
        System.out.println("==============================");
        System.out.println("Silahkan Pilih Konversi Suhu\n");
        System.out.println("1. Celcius ke Farenheit");
        System.out.println("2. Farenheit ke Celcius");
        System.out.println("3. Celcius ke Reamur ");

        System.out.print("Pilih nomor : ");
        bsr = input.nextInt();
        if (bsr > 3 | bsr <= 0) {
            System.out.println("Pilihan yang kamu masukan nggak salah. Coba lagi ya..");
            System.exit(bsr);
        }

        System.out.println("");
        System.out.print("Masukan nilai suhu :  ");
        bil = input.nextInt();

        System.out.println("");
        switch (bsr) {
            case 1: {
                int hasiljumlah = Shlib.gethitungCkeF(bil);
                System.out.println("Suhu dalam Farenheit : " + hasiljumlah + "°F");
                break;
            }
            case 2: {
                int hasiljumlah = Shlib.gethitungFkeC(bil);
                System.out.println("Suhu dalam Celcius : " + hasiljumlah + "°C");
                break;
            }
            case 3: {
                int hasiljumlah = Shlib.gethitungCkeR(bil);
                System.out.println("Suhu dalam Reamur : " + hasiljumlah + "°R");
                break;
            }
            default:
                System.out.println("Data yang kamu masukan salah. Silahkan coba lagi");
                break;
        }
    }

}
