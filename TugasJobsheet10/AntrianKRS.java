public class AntrianKRS{
    Mahasiswa12[] data;
    int front, rear, size, max, proses;
    int maxKRS = 30;

    public AntrianKRS(int max){
        this.max = max;
        this.data = new Mahasiswa12[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.proses = 0;
    }

     public boolean isEmpty(){
        if(size ==0){
            return true;
        } else{
            return false;
        }
    }

    public boolean isFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    public void clear(){
        front = 0;
        rear = -1;
        size = 0;
        proses = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

     public void tambahAntrian(Mahasiswa12 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void panggilAntrian() {
        if (isEmpty() || size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa, tidak bisa memanggil.");
            return;
        }

        for (int i = 0; i < 2; i++) {
            Mahasiswa12 mhs = data[front];
            front = (front + 1) % max;
            size--;
            proses++;
            System.out.print("Memproses KRS: ");
            mhs.tampilkanData();
        }

        if (proses >= maxKRS) {
            System.out.println("DPA sudah mencapai batas maksimal mahasiswa yang bisa diproses.");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihat2Terdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa.");
            return;
        }
        System.out.println("Dua mahasiswa terdepan:");
        data[front].tampilkanData();
        data[(front + 1) % max].tampilkanData();
    }

     public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa paling belakang:");
        data[rear].tampilkanData();
    }

    public int jumlahAntrian() {
        return size;
    }

    public int jumlahTerproses() {
        return proses;
    }

    public int jumlahUnproses() {
        return (maxKRS - proses);
    }
}