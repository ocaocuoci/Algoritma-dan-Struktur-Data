import java.util.Scanner;

public class DosenDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Dosen: ");
        int jmlhDosen = sc.nextInt();
        sc.nextLine();

        Dosen[] daftarDosen = new Dosen[jmlhDosen];

        for(int i = 0; i < jmlhDosen; i++){
            System.out.println("Masukkan data untuk dosen ke-" + (i+1) + ": ");

            System.out.print("Kode: ");
            String kode = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Jenis kelamin (Laki-laki = true, Perempuan = false): ");
            Boolean jnsKelamin = sc.nextBoolean();

            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();

            daftarDosen[i] = new Dosen(kode, nama, jnsKelamin, usia);
        }

        System.out.println("Daftar Dosen");
        for(Dosen dosen : daftarDosen){
            dosen.tampilkanInfo();
        }

        System.out.println("\nDaftar Dosen:");
            DataDosen.dataSemuaDosen(daftarDosen);
            
            System.out.println("\nJumlah Dosen per Jenis Kelamin:");
            DataDosen.jumlahDosenPerJenisKelamin(daftarDosen);
            
            System.out.println("\nRata-rata Usia Dosen per Jenis Kelamin:");
            DataDosen.rerataUsiaDosenPerJenisKelamin(daftarDosen);
            
            System.out.println("\nDosen Paling Tua:");
            DataDosen.infoDosenPalingTua(daftarDosen);
            
            System.out.println("\nDosen Paling Muda:");
            DataDosen.infoDosenPalingMuda(daftarDosen);
    }
} 
