public class BinaryTreeArray12 {
    Mahasiswa12[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray12() {
        this.dataMahasiswa = new Mahasiswa12[10]; 
        this.idxLast = -1; 
    }

    
    void populateData(Mahasiswa12[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    
    public void add(Mahasiswa12 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree penuh, tidak bisa menambahkan data.");
        }
    }

    // Traversal InOrder (Left, Root, Right)
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            traverseInOrder(2 * idxStart + 1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2 * idxStart + 2);
        }
    }

    // Traversal PreOrder (Root, Left, Right)
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
