class Mahasiswa {
    String nama;
    int umur;

    void infoMahasiswa() {
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur + " tahun");
    }

    void belajar() {
        System.out.println(nama + " sedang belajar dengan tekun.");
    }
}

public class AktivitasMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.nama = "Najwa";
        mahasiswa.umur = 19;

        mahasiswa.infoMahasiswa();
        mahasiswa.belajar();

    }    
}