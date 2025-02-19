import java.util.Scanner;

public class tugas2 {

   
    public static double hitungVolume(double rusuk) {
        return rusuk * rusuk * rusuk; 
    }

   
    public static double hitungLuasPermukaan(double rusuk) {
        return 6 * rusuk * rusuk; 
    }

   
    public static double hitungKeliling(double rusuk) {
        return 12 * rusuk; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan panjang rusuk kubus: ");
        double rusuk = scanner.nextDouble();

        while (true) {
           
            System.out.println("\nMenu:");
            System.out.println("1. Hitung volume kubus");
            System.out.println("2. Hitung luas permukaan kubus");
            System.out.println("3. Hitung keliling kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                
                double volume = hitungVolume(rusuk);
                System.out.println("Volume kubus =  " + rusuk + " * " + rusuk + " * " + rusuk);
                System.out.println("Volume kubus: " + volume);
            } else if (pilihan == 2) {
               
                double luasPermukaan = hitungLuasPermukaan(rusuk);
                System.out.println("Luas permukaan kubus =  6 * " + rusuk + " * " + rusuk );
                System.out.println("Luas permukaan kubus: " + luasPermukaan);
            } else if (pilihan == 3) {
                
                double keliling = hitungKeliling(rusuk);
                System.out.println("Keliling kubus =  12 * " + rusuk);
                System.out.println("Keliling kubus: " + keliling);
            } else if (pilihan == 4) {
                
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }

        scanner.close();
    }
}
