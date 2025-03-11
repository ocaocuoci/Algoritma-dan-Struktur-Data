public class Barang12{
    String kode;
    String nama;
    double harga;
    int stok;

    public Barang12(String kd, String nm, double harga, int stok){
        kode = kd;
        nama = nm;
        this.harga = harga;
        this.stok = stok;
    }
    public void tampilkanInfo(){
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", Harga: Rp" + harga + ", Stok: " + stok);
    }
}
