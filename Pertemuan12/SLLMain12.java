import java.util.Scanner;
public class SLLMain12{
    public static void main (String[]args){
        SingleLinkedList12 sll = new SingleLinkedList12();
        Scanner sc = new Scanner(System.in);

        sll.print();

        System.out.print("Masukkan jumlah mahasiswa:");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nim: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa12 mahasiswa = new Mahasiswa12(nim, nama, kelas, ipk);
            sll.addLast(mahasiswa);
            sll.print();
        }

        Mahasiswa12 mhs1 = new Mahasiswa12("244107060075", "Dirga", "4D", 3.6);
        Mahasiswa12 mhs2 = new Mahasiswa12("244107060056", "Alvaro", "1A", 4.0);
        Mahasiswa12 mhs3 = new Mahasiswa12("244107060023", "Cintia", "3C", 3.5);
        Mahasiswa12 mhs4 = new Mahasiswa12("244107060123", "Bimon", "2B", 3.8);

        sll.print();
        sll.addFirst(mhs1);

        sll.print();
        sll.addLast(mhs2);
        
        sll.print();
        sll.insertAfter("Dirga", mhs3);

        sll.insertAt(3, mhs4);
        sll.print();

    }
}