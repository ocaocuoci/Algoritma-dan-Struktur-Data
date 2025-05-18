public class Mahasiswa12{
    
    String nim, nama, kelas;
    Double ipk;

    Mahasiswa12(String nm, String name, String kls, Double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void TampilInformasi(){
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}