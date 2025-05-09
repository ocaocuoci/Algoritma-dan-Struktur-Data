import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil 2 Mahasiswa untuk Proses KRS");
            System.out.println("3. Lihat 2 Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Lihat Antrian Paling Belakang");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah Mahasiswa Sudah Proses KRS");
            System.out.println("8. Jumlah Mahasiswa Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); 
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("NAMA      : ");
                    String nama = sc.nextLine();
                    System.out.print("PRODI     : ");
                    String prodi = sc.nextLine();
                    System.out.print("KELAS     : ");
                    String kelas = sc.nextLine();
                    
                    Mahasiswa12 mhs = new Mahasiswa12(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.panggilAntrian();
                    break;

                case 3:
                    antrian.lihat2Terdepan();
                    break;

                case 4:
                    antrian.tampilkanSemua();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah Mahasiswa dalam Antrian: " + antrian.jumlahAntrian());
                    break;

                case 7:
                    System.out.println("Jumlah Mahasiswa Sudah Proses KRS: " + antrian.jumlahTerproses());
                    break;

                case 8:
                    System.out.println("Jumlah Mahasiswa Belum Proses KRS: " + antrian.jumlahUnproses());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih, sampai jumpa!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
