public class mahasiswaMain12{
    public static void main(String[] args){

        mahasiswa12 mhs1 = new mahasiswa12();

        mhs1.nama = "Hernanda Rizka Utami";
        mhs1.nim = "244107060075";
        mhs1.kelas = "SIB 1B";
        mhs1.ipk = 3.58;

        mhs1.tampilkanInformasi();


        mhs1.ubahKelas("SIB 1C");
        mhs1.updateIPK(3.90);
        mhs1.tampilkanInformasi();
    }
}