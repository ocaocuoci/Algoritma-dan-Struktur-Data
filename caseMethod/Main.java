import java.util.Scanner; //untuk menerima inputan
import java.util.List; //untuk mengimpor kelas yang dibutuhkan
import java.util.ArrayList; //untuk input dan struktur data list

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        Mahasiswa[] mahasiswaList = { //inisialisasi objek mahasiswa dan mtkuliah
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        MataKuliah[] mkList = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)
        };


        //deklarasi list yg hanya menyimpan objek penilaian
        //menyimpan elemen dan bisa akses sperti array biasa tp lebih dinamis
        List<Penilaian> nilaiList = new ArrayList<>(); //sebuah list dinamis untuk menyimpan banyak objek penilaian
        nilaiList.add(new Penilaian(mahasiswaList[0], mkList[0], 80, 85, 90)); //add... menambahkan objek nilai ke listnilai
        nilaiList.add(new Penilaian(mahasiswaList[0], mkList[1], 60, 75, 70)); //objek baru dari penilaian = new
        nilaiList.add(new Penilaian(mahasiswaList[1], mkList[0], 75, 70, 80)); // parameter, 
        nilaiList.add(new Penilaian(mahasiswaList[2], mkList[1], 85, 90, 95));
        nilaiList.add(new Penilaian(mahasiswaList[2], mkList[2], 80, 90, 65));

        int pilih;
        do { //perulangan
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
                System.out.println("Daftar Mahasiswa: "); //memanggil method dari kelas mhs
                    for (Mahasiswa m : mahasiswaList) { // variabel sementara m bertipe mahasiswa : (dari)
                        m.tampilMahasiswa();            // mahasiswa list > berisi objek bertipe mahasiswa
                    } //memanggil method tampil itu dari objek m
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
                Penilaian[] nilaiArray = nilaiList.toArray(new Penilaian[0]); //mengubah list menjadi array penilaian
                for(int i =0; i< nilaiArray.length -1; i++){ //untuk mengulang sebanyak jumlah data
                    for(int j=0; j< nilaiArray.length -1 -i; j++){ // membandingkan dua nilai yang bersebelahan
                        if(nilaiArray[j].nilaiAkhir < nilaiArray[j + 1].nilaiAkhir){ //mengecek kondisi, menukar posisi
                            Penilaian temp = nilaiArray[j]; //menyimpan sementara ke temp
                            nilaiArray[j] = nilaiArray[j+1]; // geser nilai j+1 ke j
                            nilaiArray[j+1] =temp; // lalu data yg disimpan sementara dipindah ke posisi j+1
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
                    boolean ditemukan = false; //inisialisasi
                    for (Mahasiswa m : mahasiswaList) { //mengecek setiap mahasiswa di array
                        if (m.NIM.equals(cariNIM)) { //mengecek nim sesuai yg dicari
                            System.out.print("Mahasiswa Ditemukan: ");
                            m.tampilMahasiswa();
                            ditemukan = true; //menandai jika nim diemukan
                            break;
                        }
                    }
                    if (!ditemukan) { //jika loop selesai dan ditemukan masih false
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