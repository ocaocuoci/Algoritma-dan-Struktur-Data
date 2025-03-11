import java.util.Scanner;

public class transaksiBarang12 {
    Scanner oca12 = new Scanner(System.in);
    Barang12[] barangs = new Barang12[10];
    Barang12[] pembelians = new Barang12[10];
    int jumlahBarang = 0;
    int jumlahPembelian = 0;

    public void tambahBarang(Barang12 barang) {
        if (jumlahBarang < barangs.length) {
            barangs[jumlahBarang] = barang;
            jumlahBarang++;
        } else {
            System.out.println("Stok barang penuh.");
        }
    }

    public void tampilkanBarang() {
        System.out.println("\n=============================");
        System.out.println("======= DAFTAR BARANG =======");
        System.out.println("=============================");
        System.out.printf("%-10s %-15s %-15s %-5s\n", "Kode", "Nama", "Harga", "Stok");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.printf("%-10s %-15s Rp%,10.2f %-5d\n", 
                barangs[i].kode, barangs[i].nama, barangs[i].harga, barangs[i].stok);
        }
        System.out.println("-------------------------------------------------");
    }

    public void tampilkanBarangPembelian() {
        System.out.println("\n=============================");
        System.out.println("==== BARANG YANG DIBELI =====");
        System.out.println("=============================");
        if (jumlahPembelian == 0) {
            System.out.println("Belum ada barang yang dibeli.");
        } else {
            System.out.printf("%-10s %-15s %-15s %-5s\n", "Kode", "Nama", "Harga", "Jumlah");
            System.out.println("-------------------------------------------------");
            for (int i = 0; i < jumlahPembelian; i++) {
                System.out.printf("%-10s %-15s Rp%,10.2f %-5d\n", 
                    pembelians[i].kode, pembelians[i].nama, pembelians[i].harga, pembelians[i].stok);
            }
            System.out.println("-------------------------------------------------");
        }
    }

    public void lakukanPembelian(Scanner oca12) {
        String beliLagi;
        do {
            System.out.print("Masukkan kode barang yang ingin dibeli: ");
            String kodeBarang = oca12.nextLine();
            boolean ditemukan = false;

            for (int i = 0; i < jumlahBarang; i++) {
                if (barangs[i].kode.equalsIgnoreCase(kodeBarang)) {
                    ditemukan = true;

                    System.out.print("Masukkan jumlah yang ingin dibeli: ");
                    int jumlahBeli = oca12.nextInt();
                    oca12.nextLine(); 

                    if (barangs[i].stok >= jumlahBeli) {
                        barangs[i].stok -= jumlahBeli;  // Kurangi stok sesuai jumlah yang dibeli
                        pembelians[jumlahPembelian] = new Barang12(barangs[i].kode, barangs[i].nama, barangs[i].harga, jumlahBeli);
                        jumlahPembelian++;
                        System.out.println("Pembelian berhasil! Stok tersisa: " + barangs[i].stok);
                    } else {
                        System.out.println("Stok tidak mencukupi! Stok tersedia: " + barangs[i].stok);
                    }
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Barang tidak ditemukan!");
            }

            System.out.print("Apakah ingin membeli barang lain? (Y/N): ");
            beliLagi = oca12.nextLine();
        } while (beliLagi.equalsIgnoreCase("Y"));
    }
}
