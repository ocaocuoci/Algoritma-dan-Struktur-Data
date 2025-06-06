public class BinaryTreeMain12 {
    public static void main(String[] args) {
        BinaryTree12 bst = new BinaryTree12();

        // Uji addRekursif()
        System.out.println("Menambahkan data dengan addRekursif():");
        bst.addRekursif(new Mahasiswa12("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa12("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa12("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa12("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        // Uji pencarian
        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan IPK 3.54: ");
        System.out.println(bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan");

        // Tambahkan data lagi
        bst.addRekursif(new Mahasiswa12("244160131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa12("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa12("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan:");
        bst.traverseInOrder(bst.root);

        // Uji cariMinIPK dan cariMaxIPK
        System.out.println("\nMahasiswa dengan IPK terkecil:");
        bst.cariMinIPK().tampilInformasi();

        System.out.println("\nMahasiswa dengan IPK terbesar:");
        bst.cariMaxIPK().tampilInformasi();

        // Uji tampil mahasiswa dengan IPK di atas batas tertentu
        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(3.50);

        // Uji hapus
        System.out.println("\nPenghapusan data mahasiswa (IPK 3.57)");
        bst.delete(3.57);
        System.out.println("Daftar mahasiswa setelah penghapusan:");
        bst.traverseInOrder(bst.root);
    }
}
