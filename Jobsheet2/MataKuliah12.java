public class MataKuliah12{

    String kodeMK, nama;
    int sks, jmlJam;

    public MataKuliah12(){
        this.kodeMK = "";
        this.nama = "";
        this.sks = 0;
        this.jmlJam = 0;
    }

    public MataKuliah12(String kodeMK, String nama, int sks, int jmlJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jmlJam = jmlJam;
    }

    public void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah\t : " + kodeMK);
        System.out.println("Nama Mata Kuliah\t : " + nama);
        System.out.println("Berapa SKS\t\t : " + sks);
        System.out.println("Jumlah waktu dalam jam\t: " + jmlJam);
    }
    public void ubahSKS(int sksBaru){
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: " + sks);
    }

    public void tambahJam(int jam){
        this.jmlJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan. Total jam: " + jmlJam);
    }

    public void kurangiJam(int jam){
        if (jam > this.jmlJam){
            System.out.println("Pengurangan jam gagal! Jumlah jam tidak memenuhi syarat.");
        } else {
            this.jmlJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi! Total jam sekarang: " + jmlJam);
        }
    }
}