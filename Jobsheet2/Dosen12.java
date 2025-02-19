public class Dosen12 {

    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen12() {
        this.idDosen = "";
        this.nama = "";
        this.bidangKeahlian = "";
        this.statusAktif = true;
        this.tahunBergabung = 0;
    }

    public Dosen12(String idDosen, String nm, String bidangKeahlian, boolean statusAktif, int tahunBergabung) {
        this.idDosen = idDosen;
        this.nama = nm;
        this.bidangKeahlian = bidangKeahlian;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
    }

    public void tampilkanInformasi() {
       System.out.println("Kode unik dosen\t : " + idDosen);
        System.out.println("Nama lengkap\t : " + nama);
        System.out.println("Check Status (Aktif/Tidak Aktif) : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Bidang Keahlian atau Spesialis\t: " + bidangKeahlian);
        System.out.println("Tahun Bergabung\t\t: " + tahunBergabung);
    }

    public void setStatusAktif(boolean status) {
         this.statusAktif = status;
        System.out.println("Status dosen telah diperbarui: " + (status ? "Aktif" : "Tidak Aktif"));
    }

    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - this.tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen telah diperbarui menjadi: " + bidang);
    }
}
