public class Penilaian { //kelas penilaian
   Mahasiswa mahasiswa; //objek mahasiswa
   MataKuliah mataKuliah; // objek matakuliah
   double nilaiTugas; //variabel
   double nilaiUTS;
   double nilaiUAS;
   double nilaiAkhir;

   public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) { //konstruktor berparameter
      this.mahasiswa = mahasiswa; //objek mhs 
      this.mataKuliah = mataKuliah;
      this.nilaiTugas = nilaiTugas;
      this.nilaiUTS = nilaiUTS;
      this.nilaiUAS = nilaiUAS;
      this.nilaiAkhir = this.hitungNilaiAkhir(); 
   }

   public double hitungNilaiAkhir() { //method menghitung nilai akhir
      return this.nilaiTugas * 0.3 + this.nilaiUTS * 0.3 + this.nilaiUAS * 0.4;
   }

   public void tampilPenilaian() { //method menampilkan hasil penilaian
      System.out.println(this.mahasiswa.nama + " | " + this.mataKuliah.namaMK + " | Nilai Akhir: " + this.nilaiAkhir);
   }
}