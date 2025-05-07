import java.util.Scanner;
public class LayananAkademikSIAKAD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AntrianLayanan12 antrian = new AntrianLayanan12(5);
        int pilihan;

        do{
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layanani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Antrian paling belakang");
            System.out.println("0. keluar");
            System.out.print("pilih menu: ");
            pilihan = sc.nextInt(); 
            sc.nextLine();

            switch(pilihan){
                case 1:
                System.out.print("NIM       :");
                String nim = sc.nextLine();

                System.out.print("NAMA      :");
                String nama = sc.nextLine();

                System.out.print("PRODI     :");
                String prodi = sc.nextLine();

                System.out.print("KELAS     :");
                String kelas = sc.nextLine();

                Mahasiswa12 mhs = new Mahasiswa12(nim, nama, prodi, kelas);
                antrian.tambahAntrian(mhs);
                break;

                case 2:
                Mahasiswa12 dilayani = antrian.layaniMahasiswa();
                if(dilayani != null){
                    System.out.print("Melayani Mahasiswa: ");
                    dilayani.TampilkanData();
                }
                break;

                case 3:
                antrian.lihatTerdepan();
                break;

                case 4:
                antrian.tampilkanSemua();
                break;

                case 5:
                System.out.println("Jumlah data antrian: " + antrian.getJumlahAntrian());
                break;

                case 6:
                antrian.LihatAkhir();
                break;

                case 0:
                System.out.println("Thank You!");
                break;

                default:
                System.out.println("Pilihan tidak valid.");
            }
        } while(pilihan != 0);
        sc.close();
        
    }
}