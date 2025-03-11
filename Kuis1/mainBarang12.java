import java.util.Scanner;

public class mainBarang12 {
    public static void main(String[] args) {
        Scanner oca12 = new Scanner(System.in);
        transaksiBarang12 transaksi12 = new transaksiBarang12();

        transaksi12.tambahBarang(new Barang12("C123", "Piring", 10000, 25));
        transaksi12.tambahBarang(new Barang12("D456", "Gelas Lucu", 12500, 20));
        transaksi12.tambahBarang(new Barang12("A678", "Vas Bunga", 54000, 10));
        transaksi12.tambahBarang(new Barang12("F231", "Pigora 10x20", 25000, 15));
        transaksi12.tambahBarang(new Barang12("G698", "Asbak", 6000, 30));

        int pilihan;
        do {
            System.out.println("\n=============================");
            System.out.println("====== TOKO OCA CANTIK ======");
            System.out.println("=============================");
            System.out.println("Menu:");
            System.out.println("1. Tampilkan daftar barang");
            System.out.println("2. Lakukan pembelian");
            System.out.println("3. Tampilkan daftar pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = oca12.nextInt();
            oca12.nextLine(); 

            switch (pilihan) {
                case 1:
                    transaksi12.tampilkanBarang();
                    break;
                case 2:
                    transaksi12.lakukanPembelian(oca12);
                    break;
                case 3:
                    transaksi12.tampilkanBarangPembelian();
                    break;
                case 4:
                    System.out.println("Terima kasih sudah berbelanja di Toko Oca Cantik!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih kembali.");
            }
        } while (pilihan != 4);

        oca12.close(); 
    }
}
