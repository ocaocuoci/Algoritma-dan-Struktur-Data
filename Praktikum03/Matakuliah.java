class MataKuliah {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    //konstruktor semua berparameter
    public MataKuliah(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    //konstruktor tanpa parameter
    public MataKuliah(){
        this.kode = "Belum ada";
        this.nama = "Tidak diketahui";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = sks * 2;
    }

    //konstruktor hanya kode dan nama
    public MataKuliah(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam; 
    }

    public void cetakInfo(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("----------------------------");
    }

}



