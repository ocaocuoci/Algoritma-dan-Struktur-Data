import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] KODE = {"A", "B", "D", "E", "F", "L", "N", "T", "AD", "AG"};

        String[][] KOTA = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Cirebon"},
            {"Bogor"},
            {"Surabaya"},
            {"Malang"},
            {"Karawang"},
            {"Surakarta"},
            {"Kediri"}
        };

        System.out.println("===================================");
        System.out.println("Program Pencari Kota Berdasarkan Plat Nomor");
        System.out.println("===================================");
        System.out.print("Masukkan kode plat nomor: ");
        String inputKode = scanner.nextLine().toUpperCase(); 
        
        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i].equals(inputKode)) {
                System.out.println("Kode plat " + inputKode + " berasal dari kota: " + KOTA[i][0]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan!");
        }

        scanner.close();
    }
}