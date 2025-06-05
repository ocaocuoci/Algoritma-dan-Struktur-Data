public class QueueTransaksi{
   public  TransaksiLayanan[] data; // menyimpan objek trans
   public  int front, rear, size; 
   /*
   f&r posisi elemen first n last dlm queue n size menyimpan jml elemen rn
   */

    public QueueTransaksi(int kapasitas){
        data = new TransaksiLayanan[kapasitas]; // membuat array dg kapasitas tertntu
        front = rear = size = 0;
    }

    public void enqueue(TransaksiLayanan t){ //menmabhakan data ke antrian
       if (size < data.length) { //cek ruang kosong
            data[rear] = t; //menempatkan data t ke indeks terakhir
            rear = (rear + 1) % data.length; //menggeser pointer r ke pss brktnya
            size++;
        } else{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
            System.out.println("Riwayat transaksi penuh!");
        }
    }

    public void tampilkanTransaksi() { // menampilkan data transaksi
       if (size == 0) {
            System.out.println("Belum ada riwayat transaksi.");
            return;
        }
        System.out.println();
        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi");
        int i = front; //menunjuk indek pertama (fifo) maka pakai front
        for (int j = 0; j < size; j++) { //looping
            data[i].tampilkanTraksaksi();
            i = (i + 1) % data.length;
        }
    }
}