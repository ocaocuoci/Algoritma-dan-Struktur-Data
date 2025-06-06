import java.util.Scanner;
public class mahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa yang akan diinput: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        

        mahasiswaBerprestasi12 list = new mahasiswaBerprestasi12(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama   : ");
            String nama = sc.nextLine();
            System.out.print("NIM  : ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            
            list.tambah(new mahasiswa12(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("----------------------------------");
        System.out.println("Pencaarian Data");
        System.out.println("----------------------------------");
        System.out.println("masukkan ipk mahaiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching ");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("----------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("----------------------------------");
        int left =0;
        double posisi2 = list.findBinarySearch(cari, left, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();

    }
}