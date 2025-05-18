public class SLLMain12{
    public static void main (String[]args){
        SingleLinkedList12 sll = new SingleLinkedList12();

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