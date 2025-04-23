
public class Mahasiswa { //kelas bernama mahasiswa
    String NIM; //deklarasi atribut dari objek mahasiswa, yang akan menyimpan
    String nama;
    String prodi;

    public Mahasiswa(String NIM, String nama, String prodi) { // konstruktor berparameter
        this.NIM = NIM; //merujuk pd atribut milik objek, = NIM parameter
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() { //method untuk menampilkan data mahasiswa
        System.out.println("NIM: " + NIM + "| Nama: " + nama + "| Prodi: " + prodi);
    } // nim, nama, prodi diambil dari atribut milik objek yang sedang menjalankan method itu
}
