public class sortingMain12{
    public static void main(String[] args){
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30,20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        sorting12 dataurut1 = new sorting12(a, a.length);
        sorting12 dataurut2 = new sorting12(b, b.length);
        sorting12 dataurut3 = new sorting12(c, c.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
        System.out.println();

        System.out.println("Data awal 2");
        dataurut1.tampil();
        dataurut1.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut1.tampil();
        System.out.println();

        System.out.println("Data awal 3");
        dataurut1.tampil();
        dataurut1.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT  (ASC)");
        dataurut1.tampil();
        System.out.println();
    }
}