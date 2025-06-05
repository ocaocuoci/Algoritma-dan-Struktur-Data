public class TransaksiLayanan{ // mewakili transaksi p & d
    Pasien pasien; //deklarasi atribut dg tipe p & d untuk menyimpan data
    Dokter dokter;
    int durasiLayanan, biaya; // menyimpan durasi konsul & biaya = total biaya

    public TransaksiLayanan(Pasien pasien, Dokter dokter, int durasi){ // konstruktor untuk menerima objek p & d
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasi;
        this.biaya = hitungBiaya();
    }

    public int hitungBiaya(){ // method menghitung
        return durasiLayanan * 50000; // return untuk mengembalikan nilai ke method
    }

    public void tampilkanTraksaksi(){ // method tampil
        System.out.println(pasien.nama + " (" + durasiLayanan + " jam): Rp " + biaya);
    }
}