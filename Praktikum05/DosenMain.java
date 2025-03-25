import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen daftarDosen = new DataDosen();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Sorting DSC (Insertion Sort)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    while (true) { 
                        System.out.print("Kode Dosen: ");
                        String kode = sc.nextLine();
                        System.out.print("Nama Dosen: ");
                        String nama = sc.nextLine();
                        System.out.print("Jenis Kelamin (L/P): ");
                        char jk = sc.next().charAt(0);
                        boolean jenisKelamin = (jk == 'L' || jk == 'l');
                        System.out.print("Usia: ");
                        int usia = sc.nextInt();
                        sc.nextLine();

                        daftarDosen.tambah(new Dosen(kode, nama, jenisKelamin, usia));

                        System.out.print("Apakah ingin menambahkan data lagi? (Y/T): ");
                        char lanjut = sc.next().charAt(0);
                        sc.nextLine();
                        if (lanjut == 'T' || lanjut == 't') {
                            break; 
                        }
                    }
                    break;
                case 2:
                    daftarDosen.tampil();
                    break;
                case 3:
                    daftarDosen.SortingASC();
                    System.out.println("Data dosen telah diurutkan secara ASCENDING!");
                    daftarDosen.tampil();
                    break;
                case 4:
                    daftarDosen.sortingDSC();
                    System.out.println("Data dosen telah diurutkan secara DESCENDING (Selection Sort)!");
                    daftarDosen.tampil();
                    break;
                case 5:
                    daftarDosen.insertionSort();
                    System.out.println("Data dosen telah diurutkan secara DESCENDING (Insertion Sort)!");
                    daftarDosen.tampil();
                    break;
                case 6:
                    System.out.println("Keluar dari program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}