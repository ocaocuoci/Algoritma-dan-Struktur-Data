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
        Node01 current = head;
        while(current != null){
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if(head == tail){
            head = tail = null;
        } else{
            head = head.next;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if(head == tail){
            head = tail = null;
        } else{
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
}