public class Mahasiswa{
    String nim, nama, kelas, prodi;

    Mahasiswa(String nm, String name, String kls, String prd){
        nim = nm;
        nama = name;
        kelas = kls;
        prodi = prd;
    }

    public void TampilInformasi(){
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + prodi);
    }
}