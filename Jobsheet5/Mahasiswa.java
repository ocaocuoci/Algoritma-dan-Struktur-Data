import java.util.Scanner;

public class Mahasiswa {
    public static int maxUTS(int[] uts, int kiri, int kanan) {
        if (kiri == kanan) {
            return uts[kiri];
        }
        int mid = (kiri + kanan) / 2;
        int kiriMax = maxUTS(uts, kiri, mid);
        int kanantMax = maxUTS(uts, mid + 1, kanan);
        return Math.max(kiriMax, kanantMax);
    }

    public static int minUTS(int[] uts, int kiri, int kanan) {
        if (kiri == kanan) {
            return uts[kiri];
        }
        int mid = (kiri + kanan) / 2;
        int kiriMax = minUTS(uts, kiri, mid);
        int kanantMax = minUTS(uts, mid + 1, kanan);
        return Math.min(kiriMax, kanantMax);
    }

    public static double rataUAS(int[] uas) {
        int total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return (double) total / uas.length;
    }

    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

        int maxNilaiUTS = maxUTS(uts, 0, uts.length - 1);
        int minNilaiUTS = minUTS(uts, 0, uts.length - 1);

        double rataNilaiUAS = rataUAS(uas);

        System.out.println("Nilai UTS tertinggi menggunakan Divide and Conquer: " + maxNilaiUTS);
        System.out.println("Nilai UTS terendah menggunakan Divide and Conquer: " + minNilaiUTS);
        System.out.println("Rata-rata nilai UAS menggunakan Brute Force: " + rataNilaiUAS);
    }
}
