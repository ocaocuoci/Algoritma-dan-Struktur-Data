public class QueueAntrian{
    Node front, rear;
    int size =0;

    boolean isEmpty(){
        return front == null;
    }

    public void Enqueue(Mahasiswa mhs){
        Node nodeBaru = new Node(mhs);
        if(isEmpty()){
            front = rear = nodeBaru;
        } else{
            rear.next = nodeBaru;
            rear = nodeBaru;
        }
        size++;
        System.out.println("Mahasiswa Berhasil Ditambahkan ke Antrian.");
        mhs.TampilInformasi();
    }

    public void Dequeue(){
        if(isEmpty()){
            System.out.println("Antrian Masih Kosong, Tidak Ada yang Dipanggil!");
        } else{
            System.out.println("Memanggil: ");
            front.data.TampilInformasi();
            front = front.next;
            if(front == null){
                rear = null;
            }
            size--;
        }
    }

    public void PeekFront(){
        if(isEmpty()){
            System.out.println("Antrian Masih Kosong!");
        } else{
            System.out.println("Antrian Terdepan: ");
            front.data.TampilInformasi();
        }
    }

    public void PeekRear(){
        if(isEmpty()){
            System.out.println("Antrian Masih Kosong!");
        } else{
            System.out.println("Antrian pZaling Akhir: ");
            rear.data.TampilInformasi();
        }
    }

    public void DisplayQueue(){
        if(isEmpty()){
            System.out.println("Antrian Masih Kosong!");
        } else{
            System.out.println("Daftar Mahasiswa yang Mengantri: ");
            Node temp = front;
            int nomer = 1;
            while(temp != null){
                System.out.print(nomer++ + ". ");
                temp.data.TampilInformasi();
                temp = temp.next;
            }
        }
    }

    public void ClearQueue(){
        front = rear = null;
        size =0;
        System.out.println("Antrian Telah Dikosongkan.");
    }

    public void JmlAntrian(){
        System.out.println("Jumlah Mahasiswa yang Masih Mengantri: " + size);
    }
}