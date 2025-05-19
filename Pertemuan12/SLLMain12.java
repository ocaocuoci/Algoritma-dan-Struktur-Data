import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {
        SingleLinkedList12 sll = new SingleLinkedList12();
        Scanner sc = new Scanner(System.in);

        Mahasiswa12 mhs4 = new Mahasiswa12("244107060075", "Dirga", "4D", 3.6);
        Mahasiswa12 mhs3 = new Mahasiswa12("244107060056", "Alvaro", "1A", 4.0);
        Mahasiswa12 mhs1 = new Mahasiswa12("244107060023", "Cintia", "3C", 3.5);
        Mahasiswa12 mhs2 = new Mahasiswa12("244107060123", "Bimon", "2B", 3.8);

        sll.addFirst(mhs4);
        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);

        System.out.println("Data indeks 1: ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon berada pada indeks: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
