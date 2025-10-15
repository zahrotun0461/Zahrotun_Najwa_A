public class kalkulatorsederhana {
    public static void main(String[] args) {
        penjumlahan jumlah = new penjumlahan();
        pengurangan kurang = new pengurangan();
        perkalian kali = new perkalian();
        pembagian bagi = new pembagian();
        kuadrat pangkat2 = new kuadrat(5);
        perakaran akar = new perakaran(25);
    }
    private static class penjumlahan {

        public penjumlahan() {
            System.out.println("Hasil dari penjumlahan: ");
            System.out.println(7 + 3);
        }
    }
    private static class pengurangan {

        public pengurangan() {
            System.out.println("Hasil dari pengurangan: ");
            System.out.println(9 - 5);
        }
    }
    private static class perkalian {

        public perkalian() {
            System.out.println("Hasil dari perkalian: ");
            System.out.println(6 * 4);
        }
    }
    private static class pembagian {

        public pembagian() {
            System.out.println("Hasil dari pembagian: ");
            System.out.println(10 / 2);
        }
    }
    private static class kuadrat {

        public kuadrat(int a) {
            System.out.println("Hasil dari kuadrat:");
            double hasil = Math.pow(a, 2);
            System.out.println(hasil);
        }
    }
    private static class perakaran {

        public perakaran(int a) {
            System.out.println("Hasil dari perakaran:");
            double hasil = Math.sqrt(a);
            System.out.println(hasil);
        }
    }
}
