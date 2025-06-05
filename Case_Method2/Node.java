public class Node{ // stuktur data linked list
    Pasien data; // menyimpan data pasian dlm node
    Node next; // menunjuk ke node berikutnya

    public Node(Pasien data){ // menerima objek pasien yg disimpan di atribut data
        this.data = data;
        this.next = null; // diset sbg default
    }
}