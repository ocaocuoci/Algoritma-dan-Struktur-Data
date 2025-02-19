public class mahasiswaMain12 {
    public static void main(String[] args) {
       
        mahasiswa12 mhs1 = new mahasiswa12();

        
        mhs1.nama = "Hernanda Rizka Utami";
        mhs1.nim = "244107060075";
        mhs1.kelas = "SIB 1B";
        mhs1.ipk = 3.58;

      
        mhs1.tampilkanInformasi();

    
        mhs1.ubahKelas("SIB 1J");
        mhs1.updateIPK(3.89);

      
        mhs1.tampilkanInformasi();

        System.out.println(); 

        
        mahasiswa12 mhs2 = new mahasiswa12("Akhrunisa Meylodita W.", "24410706087", "SIB 1D", 3.76);

       
        mhs2.updateIPK(3.50);
        mhs2.tampilkanInformasi();
    }
}
