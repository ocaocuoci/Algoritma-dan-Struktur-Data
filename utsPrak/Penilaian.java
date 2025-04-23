public class Penilaian { 
   Mahasiswa mahasiswa; 
   MataKuliah mataKuliah; 
   double nilaiTugas; 
   double nilaiUTS;
   double nilaiUAS;
   double nilaiAkhir;

   public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) { 
      this.mahasiswa = mahasiswa;  
      this.mataKuliah = mataKuliah;
      this.nilaiTugas = nilaiTugas;
      this.nilaiUTS = nilaiUTS;
      this.nilaiUAS = nilaiUAS;
      this.nilaiAkhir = this.hitungNilaiAkhir(); 
   }

   public double hitungNilaiAkhir() { 
      return this.nilaiTugas * 0.3 + this.nilaiUTS * 0.3 + this.nilaiUAS * 0.4;
   }

   public void tampilPenilaian() { 
      System.out.println(this.mahasiswa.nama + " | " + this.mataKuliah.namaMK + " | Nilai Akhir: " + this.nilaiAkhir);
   }
}