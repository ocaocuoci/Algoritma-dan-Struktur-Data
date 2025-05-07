public class AntrianLayanan12{
    Mahasiswa12[] data;
    int front, rear, size, max;

    public AntrianLayanan12(int max){
        this.max = max;
        this.data = new Mahasiswa12[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty(){
        if(size ==0){
            return true;
        } else{
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    public void lihatTerdepan(){
        if(!IsEmpty()){
            System.out.println("Antrian kosong.");
        } else{
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].TampilkanData();
        }
    }

    public void LihatAkhir(){
        if(IsEmpty()){
            System.out.println("Antrian Kosong.");
        } else{
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].TampilkanData();
        }
    }

    public void tampilkanSemua(){
        if(IsEmpty()){
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for(int i = 0; i< size; i++){
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].TampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa12 mhs){
        if(IsFull()){
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear]= mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa12 layaniMahasiswa(){
        if(IsEmpty()){
            System.out.println("Antrian kosong.");
            return null;
        } 
        Mahasiswa12 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

}