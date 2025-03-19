public class mahasiswaDemo12{
    public static void main(String[] args){

        mahasiswaBerprestasi12 list = new mahasiswaBerprestasi12();
        mahasiswa12 m1 = new mahasiswa12("123", "Zidan", "2A", 3.2);
        mahasiswa12 m2 = new mahasiswa12("124", "Ayu", "2A", 3.5);
        mahasiswa12 m3 = new mahasiswa12("125", "Sofi", "2A", 3.1);
        mahasiswa12 m4 = new mahasiswa12("126", "Sita", "2A", 3.9);
        mahasiswa12 m5 = new mahasiswa12("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        System.out.println();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
    }
}