public class SingleLinkedList12{
    Node12 head;
    Node12 tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if(!isEmpty()){
            Node12 tmp = head;
            System.out.println("Isi Linked List:\t");
            while(tmp != null){
                tmp.data.TampilInformasi();
                tmp = tmp.next;
            }
            System.out.println(" ");
        } else{
            System.out.println("Linked LIst kosong!");
            System.out.println();
        }
    }

    public void addFirst(Mahasiswa12 input){
        Node12 ndInput = new Node12(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa12 input){
        Node12 ndInput = new Node12(input, null);
            if(isEmpty()){
                head = ndInput;
                tail = ndInput;
            } else{
                tail.next = ndInput;
                tail = ndInput;
            }
    }

    public void insertAfter(String key, Mahasiswa12 input){
        Node12 ndInput = new Node12(input, null);
        Node12 temp = head;
        do{
            if(temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while(temp != null);
    }

    public void insertAt(int index, Mahasiswa12 input){
        if(index < 0){
            System.out.println("Indeks salah!");
        } else if(index == 0){
            addFirst(input);
        } else{
            Node12 temp =head;
            for(int i =0; i< index -1; i++){
                temp = temp.next;
            }
            temp.next = new Node12(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }


}