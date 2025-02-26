class Dosen{
    String nama;
    String kode;
    Boolean jnsKelamin;
    int usia;

    public Dosen(String kode, String nama, Boolean jnsKelamin, int usia) {

        this.kode = kode;
        this.nama = nama;
        this.jnsKelamin = jnsKelamin;
        this.usia = usia;
    }
    public void tampilkanInfo(){
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jnsKelamin + (jnsKelamin ? "Laki-Laki" : "Perempuan"));
        System.out.println("Usia            : " + usia + " tahun");
        System.out.println("-----------------------------------------");
    }
}
