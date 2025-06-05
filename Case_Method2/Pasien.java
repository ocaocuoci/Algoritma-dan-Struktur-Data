public class Pasien{
    String nama, nik, keluhan; //variabel

    public Pasien(String nama, String nik, String keluhan){ //konstruktor
        this.nama = nama; //membedakan atribut objek & parameter
        this.nik = nik;
        this.keluhan = keluhan;
    }

    public void tampilkanInformasi(){ //method tampil
        System.out.println("Nama pasien\t: " + nama);
        System.out.println("NIK\t\t: " + nik);
        System.out.println("Keluhan\t\t: " + keluhan);
        System.out.println();
    }
}