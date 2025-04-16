import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mahasiswaList = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        MataKuliah[] mkList = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)
        };

        List<Penilaian> nilaiList = new ArrayList<>();
        nilaiList.add(new Penilaian(mahasiswaList[0], mkList[0], 80, 85, 90));
        nilaiList.add(new Penilaian(mahasiswaList[0], mkList[1], 60, 75, 70));
        nilaiList.add(new Penilaian(mahasiswaList[1], mkList[0], 75, 70, 80));
        nilaiList.add(new Penilaian(mahasiswaList[2], mkList[1], 85, 90, 95));
        nilaiList.add(new Penilaian(mahasiswaList[2], mkList[2], 80, 90, 65));

        int pilih;
        do {
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch(pilih) {
                case 1:
                System.out.println("Daftar Mahasiswa: ");
                    for (Mahasiswa m : mahasiswaList) {
                        m.tampilMahasiswa();
                    }
                    break;
                case 2:
                System.out.println("Daftar Mata Kuliah: ");
                    for (MataKuliah mk : mkList) {
                        mk.tampilMataKuliah();
                    }
                    break;
                case 3:
                System.out.println("Data Penilaian: ");
                    for (Penilaian p : nilaiList) {
                        p.tampilPenilaian();
                    }
                    break;
                case 4:
                System.out.println("Data Penilaian (Diurutkan berdasarkan nilai akhir):");
                Penilaian[] nilaiArray = nilaiList.toArray(new Penilaian[0]);
                for(int i =0; i< nilaiArray.length -1; i++){
                    for(int j=0; j< nilaiArray.length -1 -i; j++){
                        if(nilaiArray[j].nilaiAkhir < nilaiArray[j + 1].nilaiAkhir){
                            Penilaian temp = nilaiArray[j];
                            nilaiArray[j] = nilaiArray[j+1];
                            nilaiArray[j+1] =temp;
                        }
                    }

                }
                for(Penilaian p: nilaiArray){
                    p.tampilPenilaian();
                }
                break;
                case 5:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String cariNIM = sc.next();
                    boolean ditemukan = false;
                    for (Mahasiswa m : mahasiswaList) {
                        if (m.NIM.equals(cariNIM)) {
                            System.out.print("Mahasiswa Ditemukan: ");
                            m.tampilMahasiswa();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    } 
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}