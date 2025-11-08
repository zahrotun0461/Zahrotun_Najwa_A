class Cuaca {
    String kota;
    String kondisi;

    void infoCuaca() {
        System.out.println("Kota    : " + kota);
        System.out.println("Kondisi : " + kondisi);
    }

    void tampilkanPrediksi() {
        if (kondisi == "hujan") {   
            System.out.println("Hujan turun deras di " + kota + ". Jangan lupa bawa payung");
        } else {
            System.out.println("Cuaca hari ini cerah dan hangat di " + kota + ". Nikmati harimu!");
        }
    }
}

public class CuacaHariIni {
    public static void main(String[] args) {
        Cuaca cuaca = new Cuaca();

        cuaca.kota = "Bojonegoro";
        cuaca.kondisi = "Cerah";

        cuaca.infoCuaca();
        cuaca.tampilkanPrediksi();
    }
}
