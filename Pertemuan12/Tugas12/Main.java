import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        QueueAntrian antrian = new QueueAntrian();
        int pilihan;

        do {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Tampilkan Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("== Masukkan Data Mahasiswa ==");
                    System.out.print("NIM\t\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama\t\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas\t\t: ");
                    String kelas = sc.nextLine();
                    System.out.print("Program Studi\t: ");
                    String prodi = sc.nextLine();
                    antrian.Enqueue(new Mahasiswa(nim, nama, kelas, prodi));
                    break;

                case 2:
                    antrian.Dequeue();
                    break;

                case 3:
                    antrian.PeekFront();
                    break;

                case 4:
                    antrian.PeekRear();
                    break;

                case 5:
                    antrian.DisplayQueue();
                    break;

                case 6:
                    System.out.println(antrian.isEmpty() ? "Antrian Kosong." : "Antrian Tidak Kosong.");
                    break;

                case 7:
                    antrian.ClearQueue();
                    break;

                case 8:
                    antrian.JmlAntrian();
                    break;

                case 0:
                    System.out.println("Terima Kasih! Program Selesai.");
                    break;
                    
                default:
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilihan != 0);
    }
}