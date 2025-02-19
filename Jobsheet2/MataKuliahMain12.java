public class MataKuliahMain12{
    public static void main(String[] args){

        MataKuliah12 matkul1 = new MataKuliah12();

        matkul1.kodeMK = "BD01";
        matkul1.nama = "Basis Data";
        matkul1.sks = 2;
        matkul1.jmlJam = 4;

        matkul1.tampilkanInformasi();
        System.out.println();

        matkul1.ubahSKS(3);
        matkul1.tambahJam(6);

        System.out.println();
        System.out.println();

        MataKuliah12 matkul2 = new MataKuliah12("ASD03", "Algoritma dan Struktur Data", 3, 6);
        matkul2.tampilkanInformasi();
        
        System.out.println();

        matkul2.tambahJam(30);
        matkul2.kurangiJam(12);
        matkul2.tampilkanInformasi();

    }
}