import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoublelinkedList list = new DoublelinkedList();
        int pilihan;

        do {
            System.out.println("\n=== Menu Double Linked List Mahasiswa ===");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Hapus di Awal");
            System.out.println("4. Hapus di Akhir");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah setelah NIM tertentu");
            System.out.println("8. Tambah di indeks tertentu");
            System.out.println("9. Hapus setelah NIM tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); 

            switch(pilihan){
                case 1: {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                    break;
                }

                case 2: {
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                    break;
                }

                case 3:
                    list.removeFirst();
                    break;

                case 4:
                    list.removeLast();
                    break;

                case 5:
                    list.print();
                    break;

                case 6: {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node01 found = list.search(nim);
                    if(found != null){
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else{
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                }

                case 7:
                    System.out.print("Masukkan NIM setelah data ini ingin disisipkan: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa01 mhs = inputMahasiswa(scan);
                    list.insertAfter(keyNim, mhs);
                    break;

                case 8:
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    mhs = inputMahasiswa(scan);
                    list.add(index, mhs);
                    break;

                case 9:
                    System.out.print("Masukkan NIM yang datanya ingin dihapus setelahnya: ");
                    keyNim = scan.nextLine();
                    list.removeAfter(keyNim);
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        } while(pilihan != 0);

        scan.close();
    }

    public static Mahasiswa01 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new Mahasiswa01(nim, nama, kelas, ipk);
    }
}
