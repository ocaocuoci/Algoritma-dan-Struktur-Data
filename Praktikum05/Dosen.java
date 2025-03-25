public class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen(String kd, String nama, boolean jk, int age) {
        this.kode = kd;
        this.nama = nama;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia        : " + usia);
        System.out.println("----------------------------------");
    }
}