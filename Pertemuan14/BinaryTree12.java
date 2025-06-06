public class BinaryTree12{
    Node12 root;

    public BinaryTree12(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(Mahasiswa12 mahasiswa){
        Node12 newNode = new Node12(mahasiswa);
        if(isEmpty()){
            root = newNode;
        } else{
            Node12 current = root;
            Node12 parent = null;
            while(true){
                parent = current;
                if(mahasiswa.ipk < current.mahasiswa.ipk){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                } else{
                    current = current.right;
                    if(current == null){
                        parent.right =  newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk){
        boolean result = false;
        Node12 current = root;
        while(current != null){
            if(current.mahasiswa.ipk == ipk){
                result = true;
                break;
            } else if(ipk > current.mahasiswa.ipk){
                current = current.right;
            } else{
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node12 node){
        if(node != null){
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node12 node){
        if( node != null){
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node12 node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node12 getSuccessor(Node12 del){
        Node12 successor = del.right;
        Node12 successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if(isEmpty()){
            System.out.println("Binary tree kosong");
            return;
        }
        Node12 parent = root;
        Node12 current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.mahasiswa.ipk == ipk){
                break;
            } else if(ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if(current == null){
            System.out.println("Data tidak ditemukan");
            return;
        } else{
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                } else{
                    if(isLeftChild){
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left == null){
                if(current == root){
                    root = current.right;
                } else{
                    if(isLeftChild){
                        parent.left = current.right;
                    } else{
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null){
                if(current == root){
                    root = current.left;
                } else{
                    if(isLeftChild){
                        parent.left = current.left;
                    } else{
                        parent.right = current.left;
                    }
                }
            } else{
                Node12 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if(current == root){
                    root = successor;
                } else{
                    if(isLeftChild){
                        parent.left = successor;
                    } else{
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}