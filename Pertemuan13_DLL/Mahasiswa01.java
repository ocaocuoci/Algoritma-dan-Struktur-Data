public class Mahasiswa01{
    String nim, nama, kelas;
    Double ipk;

    public Mahasiswa01(String nim, String nama, String kelas, Double ipk){
        this. nim = nim;
        this. nama = nama;
        this. kelas = kelas;
        this. ipk = ipk;
    }

    public void tampil(){
        System.out.print("NIM: " + nim + " - Nama: " + nama + " - Kelas: " + kelas + " - IPK:" + ipk);
    }
}