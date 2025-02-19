import java.util.Scanner;

public class array12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester\n");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine(); 

        String[] namaMK = new String[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];
        double totalBobotNilai = 0;

      
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMK[i] = scanner.nextLine();

            System.out.print("Masukkan nilai angka untuk " + namaMK[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            scanner.nextLine(); 

           
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            bobotNilai[i] = konversiBobotNilai(nilaiHuruf[i]);

           
            totalBobotNilai += bobotNilai[i];
        }

       
        System.out.println("\nHasil Konversi Nilai:\n");
        System.out.printf("%-30s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-30s %-15.2f %-15s %-15.2f\n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

   
        double ipSemester = totalBobotNilai / jumlahMK;
        System.out.printf("\nIP Semester: %.2f\n", ipSemester);

        scanner.close();
    }

 
    public static String konversiNilaiHuruf(double nilaiAngka) {
        if (nilaiAngka >= 85) {
            return "A";
        } else if (nilaiAngka >= 80) {
            return "A-";
        } else if (nilaiAngka >= 75) {
            return "B+";
        } else if (nilaiAngka >= 70) {
            return "B";
        } else if (nilaiAngka >= 65) {
            return "C+";
        } else if (nilaiAngka >= 60) {
            return "C";
        } else if (nilaiAngka >= 50) {
            return "D";
        } else {
            return "E";
        }
    }


    public static double konversiBobotNilai(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return 4.0;
            case "A-":
                return 3.7;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            default:
                return 0.0;
        }
    }
}
