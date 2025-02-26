class MataKuliah {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    
    public MataKuliah(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

   
    public MataKuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.sks = 3; 
        this.jumlahJam = 2; 
    }

    public void display() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("--------------------------------");
    }

}