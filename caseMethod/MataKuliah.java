
public class MataKuliah { // kelas matakuliah
    String kodeMK; //deklarasi atribut, buat nyimpen data 
    String namaMK;
    int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) { //konstruktor berparameter, method khusus yg dipanggil saat
        this.kodeMK = kodeMK; //atribut milik objek            //objek dibuat
        this.namaMK = namaMK; //untuk mengisi data objek saat dibuat
        this.sks = sks;
    }

    public void tampilMataKuliah() { //method menampilkan data
        System.out.println("Kode: " + kodeMK + "| Mata Kuliah: " + namaMK + "| SKS: " + sks);
    }
}
