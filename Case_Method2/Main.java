import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        AntrianPasien antrian = new AntrianPasien(); //inisialisasi objek
        QueueTransaksi riwayat = new QueueTransaksi(100); // inisialasi objek, menyimpan riwayat layanan dlm array queue
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch(pilihan){
                case 1: { //menerima inputan
                    System.out.print("Nama Pasien\t: ");
                    String nama = sc.nextLine();
                    System.out.print("NIK\t\t: ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan\t\t: ");
                    String keluhan = sc.nextLine();
                    antrian.tambahPasien(new Pasien(nama, nik, keluhan)); //memanggil method 
                    System.out.print(">> Pasien masuk ke dalam antrian.");
                    System.out.println();
                    break;
                }

                case 2: { //menampilkan semua pasien
                    System.out.println("--- Antrian Pasien ---");
                    antrian.tampilkanAntrian();
                    break;
                }

                case 3: 
                    if (antrian.isEmpty()) { //cek antrian 
                        System.out.println("Tidak ada pasien dalam antrian.");
                        
                    } else { 
                    Pasien p = antrian.layaniPasien();
                    System.out.println("Pasien " + p.nama + " dipanggil");
                    System.out.println();

                    System.out.print("Masukkan ID Dokter\t: ");
                    String idDok = sc.nextLine();
                    System.out.print("Masukkan Nama Dokter\t: ");
                    String namaDok = sc.nextLine();
                    System.out.print("Masukkan Durasi Layanan (jam): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Dokter d = new Dokter(idDok, namaDok); //buat objek
                    TransaksiLayanan t = new TransaksiLayanan(p, d, durasi);
                    riwayat.enqueue(t);

                    System.out.println("Pasien telah dilayani, transaksi berhasil dicatat.");
                    
                    }
                    break;

                case 4: //hitung sisa pasien
                    System.out.println(">> Sisa pasien dalam antrian: " + antrian.hitungSisa());
                    break;

                case 5: //menampilkan riwayat transaksi
                    riwayat.tampilkanTransaksi();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        } while(pilihan != 0);
    }

    /*tatic int hitungSisaPasien(AntrianPasien antrian) { //menghitung jml node pasien scr manual
        int count = 0;
        Node temp = antrian.head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count; 
    } */
}