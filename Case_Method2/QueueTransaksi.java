public class QueueTransaksi{
   public  TransaksiLayanan[] data;
   public  int front, rear, size;

    public QueueTransaksi(int kapasitas){
        data = new TransaksiLayanan[kapasitas];
        front = rear = size = 0;
    }

    public void enqueue(TransaksiLayanan t){
       if (size < data.length) {
            data[rear] = t;
            rear = (rear + 1) % data.length;
            size++;
        } else{
            System.out.println("Riwayat transaksi penuh!");
        }
    }

    public void tampilkanTransaksi() {
       if (size == 0) {
            System.out.println("Belum ada riwayat transaksi.");
            return;
        }
        System.out.println();
        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi");
        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampilkanTraksaksi();
            i = (i + 1) % data.length;
        }
    }
}