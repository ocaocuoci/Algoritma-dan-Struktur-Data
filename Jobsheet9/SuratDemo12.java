import java.util.Scanner;

public class SuratDemo12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat12 stack = new StackSurat12(10);
        int pilih;

        do {
            System.out.println("\n--- Menu Surat Izin Mahasiswa ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    stack.push(new Surat12(id, nama, kelas, jenis, durasi));
                    System.out.println("Surat berhasil diterima.");
                    break;

                case 2:
                    Surat12 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat diproses dari: " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat12 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat Terakhir:");
                        System.out.println("Nama: " + terakhir.namaMahasiswa);
                        System.out.println("Jenis Izin: " + terakhir.jenisIzin);
                        System.out.println("Durasi: " + terakhir.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = scan.nextLine();
                    if (stack.cariSurat(cariNama)) {
                        System.out.println("Surat dari " + cariNama + " ditemukan.");
                    } else {
                        System.out.println("Surat dari " + cariNama + " tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
    }
}
