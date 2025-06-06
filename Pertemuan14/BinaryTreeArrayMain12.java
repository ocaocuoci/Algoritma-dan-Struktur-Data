public class BinaryTreeArrayMain12 {
    public static void main(String[] args) {
        BinaryTreeArray12 bta = new BinaryTreeArray12();

        // Tambah data mahasiswa satu per satu menggunakan method add()
        bta.add(new Mahasiswa12("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa12("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa12("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa12("244160220", "Dewi", "B", 3.35));
        bta.add(new Mahasiswa12("244160131", "Devi", "A", 3.48));
        bta.add(new Mahasiswa12("244160205", "Ehsan", "D", 3.61));
        bta.add(new Mahasiswa12("244160170", "Fizi", "B", 3.86));

        // Tampilkan data mahasiswa menggunakan traversal
        System.out.println("\nInorder Traversal Mahasiswa:");
        bta.traverseInOrder(0);

        System.out.println("\nPreorder Traversal Mahasiswa:");
        bta.traversePreOrder(0);
    }
}
