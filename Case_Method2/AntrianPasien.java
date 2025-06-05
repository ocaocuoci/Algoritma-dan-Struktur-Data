public class AntrianPasien { //struktur antrian linked list 
    Node head, tail; //menandai awal dan akhir

    public AntrianPasien() {
        head = tail = null; //inisialisasi = antrian kosong
    }

    public void tambahPasien(Pasien p) {
        Node baru = new Node(p); //meyimpan data pasien 
        if (head == null) {
            head = tail = baru; //pasien per1 jadi head sekaligus tail
        } else {
            tail.next = baru; //pasien baru diletakkan setelah pasien tadi
            tail = baru;
        }
    }

    public Pasien layaniPasien() {
        if (head == null) return null; // cek antrian & mengembalikan null
        Pasien p = head.data; // menyimpan data pasien dari node paling depan
        head = head.next; // geser head
        if (head == null) tail = null; 
        return p; // mengembalikan data pasien 
    }

    public boolean isEmpty() { // cek antrian kosong
        return head == null;
    }

    public int hitungSisa() { //menghitung jml pasien
        int count = 0; // inisialisasi
        Node temp = head; // var sementara yg mngacu ke node plg depan
        while (temp != null) { // loop slm bukan null
            count++;
            temp = temp.next; // dari depan ke belakang asd
        }
        return count;
    }

    public void tampilkanAntrian() { // menampilkan data pasien
        if (isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
            return;
        }
        Node temp = head; //var temp untuk melihat node dari awal
        while (temp != null) {
            temp.data.tampilkanInformasi(); //mencetak data
            temp = temp.next; //iterasi maju
        }
    }
}
