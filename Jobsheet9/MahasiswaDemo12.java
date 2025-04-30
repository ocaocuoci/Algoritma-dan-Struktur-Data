import java.util.Scanner;
public class MahasiswaDemo12{
    public static void main(String[] args){
        StackTugasMahasiswa12 stack = new StackTugasMahasiswa12(5);

        Scanner scan = new Scanner(System.in);

        int pilih;

        do{
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Melihat Jumlah Tugas yang telah dikumpulkan");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih){
                case 1:
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("Nim: ");
                String nim = scan.nextLine();
                System.out.print("Kelas: ");
                String kelas = scan.nextLine();
                Mahasiswa12 mhs = new Mahasiswa12(nama, nim, kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                break;

                case 2:
                Mahasiswa12 dinilai = stack.pop();
                if(dinilai !=null){
                    System.out.println("Menilai tugas dari " + dinilai.nama);
                    System.out.print("Masukkan nilai (0-100): ");
                    int nilai = scan.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    String biner = stack.KonversiDesimalkeBiner(nilai);
                    System.out.println("Nilai Biner Tugas: " + biner);
                }
                break;

                case 3:
                Mahasiswa12 lihat = stack.peek();
                if (lihat != null){
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                }
                break;

                case 4:
                System.out.println("Daftar semua tugas: ");
                System.out.println("Nama\tNim\tkelas");
                stack.print();
                break;

                case 5:
                Mahasiswa12 bawah = stack.bottom();
                if(bawah != null){
                    System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                }
                break;

                case 6:
                int jumlah = stack.jumlahTugas();
                System.out.printf("Jumlah tugas yang dikumpulkan: %d\n", jumlah);
                break;

                default:
                System.out.println("Pilihan Tidak Valid.");
            }
        }
        while (pilih >=1 && pilih <= 6);
    }
}