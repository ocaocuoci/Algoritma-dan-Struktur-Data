import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 


        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1));

            System.out.print("Nama mata kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();

            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();

            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Mencari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            if (pilihan == 1) {
                
                for (int i = 0; i < n; i++) {
                    System.out.println("Mata kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                }

            } else if (pilihan == 2) {
                
                System.out.print("Masukkan hari yang ingin dilihat: ");
                String hari = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < n; i++) {
                    if (hariKuliah[i].equalsIgnoreCase(hari)) {
                        System.out.println("Mata kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Tidak ada mata kuliah pada hari " + hari);
                }

            } else if (pilihan == 3) {
               
                System.out.print("Masukkan semester yang ingin dilihat: ");
                int semesterInput = scanner.nextInt();
                scanner.nextLine(); 
                boolean found = false;

                for (int i = 0; i < n; i++) {
                    if (semester[i] == semesterInput) {
                        System.out.println("Mata kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("Tidak ada mata kuliah pada semester " + semesterInput);
                }

            } else if (pilihan == 4) {
                
                System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                String namaCari = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < n; i++) {
                    if (namaMataKuliah[i].equalsIgnoreCase(namaCari)) {
                        System.out.println("Mata kuliah ditemukan: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Mata kuliah " + namaCari + " tidak ditemukan.");
                }

            } else if (pilihan == 5) {
               
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }

        scanner.close();
    }
}
