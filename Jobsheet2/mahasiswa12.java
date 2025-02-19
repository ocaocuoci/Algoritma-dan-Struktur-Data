import java.util.Scanner;

public class mahasiswa12 {

    String nim, nama, kelas;
    double ipk;

    public mahasiswa12() {
        this.nama = "";
        this.nim = "";
        this.kelas = "";
        this.ipk = 0.0;
    }

   
    public mahasiswa12(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    
    public void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }

    
    public void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    
    public void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui");
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 sampai 4.0");
        }
    }

     
    public String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}
