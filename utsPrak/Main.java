import java.util.Scanner; 
import java.util.List; 
import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

    List<Mahasiswa> mahasiswaList = new ArrayList<>();
    List<MataKuliah> mkList = new ArrayList<>();
    List<Penilaian> nilaiList = new ArrayList<>();

int jumlahMahasiswa;
do {
    System.out.print("Masukkan jumlah mahasiswa (minimal 10): ");
    jumlahMahasiswa = sc.nextInt();
    sc.nextLine();
} while (jumlahMahasiswa < 10);

for (int i = 0; i < jumlahMahasiswa; i++) {
    System.out.println("\nInput Mahasiswa ke-" + (i + 1));
    System.out.print("NIM: ");
    String nim = sc.nextLine();
    System.out.print("Nama: ");
    String nama = sc.nextLine();
    System.out.print("Prodi: ");
    String prodi = sc.nextLine();

    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi);
    mahasiswaList.add(mhs);

    System.out.print("Berapa matakuliah yang diambil oleh " + nama + "? ");
    int jumlahMK = sc.nextInt();
    sc.nextLine();

    for (int j = 0; j < jumlahMK; j++) {
        System.out.println("  Matakuliah ke-" + (j + 1));
        System.out.print("  Kode MK: ");
        String kodeMK = sc.nextLine();
        System.out.print("  Nama MK: ");
        String namaMK = sc.nextLine();
        System.out.print("  SKS: ");
        int sks = sc.nextInt();
        sc.nextLine(); 

        
        MataKuliah mk = null;
        for (MataKuliah m : mkList) {
            if (m.kodeMK.equals(kodeMK)) {
                mk = m;
                break;
            }
        }
        if (mk == null) {
            mk = new MataKuliah(kodeMK, namaMK, sks);
            mkList.add(mk);
        }

        System.out.print("  Nilai Tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("  Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("  Nilai UAS: ");
        double uas = sc.nextDouble();
        sc.nextLine(); // buang newline

        Penilaian nilai = new Penilaian(mhs, mk, tugas, uts, uas);
        nilaiList.add(nilai);
    }
}

        int pilih;
        do { 
            System.out.println("\n=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Urutkan Mahasiswa Berdasarkan Nama");
            System.out.println("7. cari Nama Mahasiswa (Binary)");
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
                System.out.println("Urutkan Berdasarkan Nilai Akhir:");
                System.out.println("1. Ascending");
                System.out.println("2. Descending");
                System.out.print("Pilih metode urut: ");
                int metodeSort = sc.nextInt();

                Penilaian[] nilaiArray = nilaiList.toArray(new Penilaian[0]);

                
                for (int i = 1; i < nilaiArray.length; i++) {
                    Penilaian key = nilaiArray[i];
                    int j = i - 1;

                    if (metodeSort == 1) { 
                        while (j >= 0 && nilaiArray[j].nilaiAkhir > key.nilaiAkhir) {
                            nilaiArray[j + 1] = nilaiArray[j];
                            j = j - 1;
                        }
                    } else if (metodeSort == 2) { 
                        while (j >= 0 && nilaiArray[j].nilaiAkhir < key.nilaiAkhir) {
                            nilaiArray[j + 1] = nilaiArray[j];
                            j = j - 1;
                        }
                    }
                    nilaiArray[j + 1] = key;
                }
                System.out.println("\nData Penilaian Setelah Diurutkan:");
                for (Penilaian p : nilaiArray) {
                    p.tampilPenilaian();
                }
                break;
                case 5:
                System.out.println("\n=== Urutkan Mahasiswa Berdasarkan Nama ===");
                System.out.print("Pilih urutan (1 = Ascending, 2 = Descending): ");
                int urutan = sc.nextInt();
                sc.nextLine(); 

                List<Mahasiswa> daftarMahasiswaSort = new ArrayList<>(mahasiswaList); 

                for (int i = 0; i < daftarMahasiswaSort.size() - 1; i++) {
                    int idxTerpilih = i;

                    for (int j = i + 1; j < daftarMahasiswaSort.size(); j++) {
                        if (urutan == 1) { // Ascending
                            if (daftarMahasiswaSort.get(j).nama.compareToIgnoreCase(daftarMahasiswaSort.get(idxTerpilih).nama) < 0) {
                                idxTerpilih = j;
                            }
                        } else if (urutan == 2) { // Descending
                            if (daftarMahasiswaSort.get(j).nama.compareToIgnoreCase(daftarMahasiswaSort.get(idxTerpilih).nama) > 0) {
                                idxTerpilih = j;
                            }
                        }
                    }

                    // Tukar posisi
                    Mahasiswa temp = daftarMahasiswaSort.get(i);
                    daftarMahasiswaSort.set(i, daftarMahasiswaSort.get(idxTerpilih));
                    daftarMahasiswaSort.set(idxTerpilih, temp);
                }

                
                System.out.println("Hasil Pengurutan:");
                for (Mahasiswa m : daftarMahasiswaSort) {
                    m.tampilMahasiswa();
                }
                    break;
                case 6:
                    System.out.println("Urutkan Mahasiswa Berdasarkan Nama:");
                    System.out.println("1. Ascending (A-Z)");
                    System.out.println("2. Descending (Z-A)");
                    System.out.print("Pilih metode urut: ");
                    int metodeUrut = sc.nextInt();
                    sc.nextLine();

                    // Selection Sort
                    for (int i = 0; i < mahasiswaList.size() - 1; i++) {
                        int idxTerpilih = i;
                        for (int j = i + 1; j < mahasiswaList.size(); j++) {
                            boolean kondisi;
                            if (metodeUrut == 1) {
                                kondisi = mahasiswaList.get(j).nama.compareToIgnoreCase(mahasiswaList.get(idxTerpilih).nama) < 0;
                            } else {
                                kondisi = mahasiswaList.get(j).nama.compareToIgnoreCase(mahasiswaList.get(idxTerpilih).nama) > 0;
                            }

                            if (kondisi) {
                                idxTerpilih = j;
                            }
                        }

                        // Tukar posisi
                        if (i != idxTerpilih) {
                            Mahasiswa temp = mahasiswaList.get(i);
                            mahasiswaList.set(i, mahasiswaList.get(idxTerpilih));
                            mahasiswaList.set(idxTerpilih, temp);
                        }
                    }

                    System.out.println("\nDaftar Mahasiswa Setelah Diurutkan:");
                    for (Mahasiswa m : mahasiswaList) {
                        m.tampilMahasiswa();
                    }
                    break;
                case 7:
                // Sortir data mahasiswa terlebih dahulu (Ascending)
                mahasiswaList.sort((m1, m2) -> m1.nama.compareToIgnoreCase(m2.nama));

                System.out.println("Daftar Mahasiswa (Sudah Diurutkan Berdasarkan Nama):");
                for (Mahasiswa m : mahasiswaList) {
                    System.out.println("- " + m.nama);
                }

                System.out.print("\nMasukkan nama mahasiswa yang dicari: ");
                sc.nextLine(); 
                String cariNama = sc.nextLine().trim();

                int left = 0;
                int right = mahasiswaList.size() - 1;
                boolean ditemukanNama = false;
                int index = -1;

                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    Mahasiswa m = mahasiswaList.get(mid);

                    System.out.println("Mengecek: " + m.nama); // debug output

                    if (m.nama.equalsIgnoreCase(cariNama)) {
                        ditemukanNama = true;
                        index = mid;
                        break;
                    }

                    if (m.nama.compareToIgnoreCase(cariNama) < 0) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

                if (ditemukanNama) {
                    System.out.println("\nData ditemukan di index: " + index);
                    mahasiswaList.get(index).tampilMahasiswa();
                } else {
                    System.out.println("\nData tidak ada di database.");
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