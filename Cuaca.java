public class Cuaca {
    public static void main(String[] args) {
        Cuaca cuacaHariIni = new Cuaca();
        cuacaHariIni.dataCuaca();
        cuacaHariIni.tampilkanPrediksi();
    }

    String kota = "Bojonegoro";
    String kondisi = "berawan"; 

    void dataCuaca() {
        System.out.println("DATA CUACA");
        System.out.println("Kota    : " + kota);
        System.out.println("Kondisi : " + kondisi);
    }

    void tampilkanPrediksi() {
        if (kondisi.equals("hujan")) {
            System.out.println("Hujan turun deras di " + kota + ". Jangan lupa bawa payung");
        } else if (kondisi.equals("berawan")) {
            System.out.println("Langit tampak berawan di " + kota + ". Mungkin akan hujan sebentar lagi");
        } else if (kondisi.equals("cerah")) {
            System.out.println("Cuaca hari ini cerah dan hangat di " + kota + ". Nikmati harimu!");
        } else {
            System.out.println("Kondisi cuaca di " + kota + " tidak diketahui");
        }
    }
}
