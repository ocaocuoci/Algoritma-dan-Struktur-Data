public class AntrianPasien {
    Node head, tail;

    public AntrianPasien() {
        head = tail = null;
    }

    public void tambahPasien(Pasien p) {
        Node baru = new Node(p);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public Pasien layaniPasien() {
        if (head == null) return null;
        Pasien p = head.data;
        head = head.next;
        if (head == null) tail = null;
        return p;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int hitungSisa() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void tampilkanAntrian() {
        System.out.println("-- Antrian Pasien --");
        if (isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            temp.data.tampilkanInformasi();
            temp = temp.next;
        }
    }
}
