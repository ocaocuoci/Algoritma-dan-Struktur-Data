public class DoublelinkedList{
    Node01 head;
    Node01 tail;

    public DoublelinkedList(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return (head == null);
    }

     public void addFirst(Mahasiswa01 data){
        Node01 newNode = new Node01(data);
        if(isEmpty()){
            head = tail = newNode;
        } else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa01 data){
        Node01 newNode = new Node01(data);
            if(isEmpty()){
            head = tail = newNode;
        } else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa01 data){
        Node01 current = head;

        while(current != null && !current.data.nim.equals(keyNim)){
            current = current.next;
        }

        if(current == null){
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node01 newNode = new Node01(data);

        if(current == tail){
            current.next = newNode;
            newNode.prev = current;
            tail=newNode;
        } else{
            newNode.next= current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong");
        } else{
            Node01 current = head;
            while(current != null){
            current.data.tampil();
            current = current.next;
            }
        }
        
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List masih kosong, tidak dapat dihapus!");
        } else if(head == tail){
            System.out.println("Data sudah berhasil dihapus. Data yan terhapus adalah ");
            head.data.tampil();
            head = tail = null;
        } else{
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah ");
            head.data.tampil();
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("List masih kosong, tidak dapat dihapus!");
        } else if(head == tail){
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah ");
            tail.data.tampil();
            head = tail = null;
        } else{
            System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah ");
            tail.data.tampil();
            Node01 temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public Node01 search(String nim) {
    Node01 current = head;
    while (current != null) {
        if (current.data.nim.equals(nim)) {
            return current;
        }
        current = current.next;
    }
    return null;
    }

    public void add(int index, Mahasiswa01 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node01 current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Indeks melebihi ukuran list.");
            return;
        }

        Node01 newNode = new Node01(data);
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    public void removeAfter(String keyNim) {
    Node01 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Data setelah NIM tidak ditemukan.");
            return;
        }

        Node01 nodeToRemove = current.next;
        current.next = nodeToRemove.next;

        if (nodeToRemove.next != null) {
            nodeToRemove.next.prev = current;
        } else {
            tail = current;
        }

        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus: ");
        nodeToRemove.data.tampil();
    }

    public void remove(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Index tidak valid atau list kosong.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node01 current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Index melebihi ukuran list.");
            return;
        }

        if (current.prev != null) current.prev.next = current.next;
        if (current.next != null) current.next.prev = current.prev;
        if (current == tail) tail = current.prev;

        System.out.println("Data pada index " + index + " berhasil dihapus:");
        current.data.tampil();
    }

    public void getFirst() {
        if (!isEmpty()) {
            System.out.println("Data pertama:");
            head.data.tampil();
        } else {
            System.out.println("List kosong.");
        }
    }

    public void getLast() {
        if (!isEmpty()) {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        } else {
            System.out.println("List kosong.");
        }
    }

    public void getIndex(int index) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }

        Node01 current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current != null) {
            System.out.println("Data pada index " + index + ":");
            current.data.tampil();
        } else {
            System.out.println("Index melebihi ukuran list.");
        }
    }


}