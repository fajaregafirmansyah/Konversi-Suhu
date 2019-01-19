package konversisuhu;

public class MethodSuhu {

    public void setBilangan(int bil) {
        System.out.println("Bilangan " + bil);
    }

    //rumus hitung dari Celcius ke Farenheit
    public int gethitungCkeF(int bil) {
        int hasil = 9 * bil / 5 + 32;
        return hasil;
    }

    //rumus hitung dari Farenheit ke Celcius
    public int gethitungFkeC(int bil) {
        int hasil = ((bil - 32) * 5) / 9;
        return hasil;
    }

    //rumus hitung dari Celcius ke Reamurs
    public int gethitungCkeR(int bil) {
        int hasil = 4 * bil / 5;
        return hasil;
    }
}
